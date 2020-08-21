package com.trinhthihien.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DetailInformationDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<List<String>> getDetailInformation(int currentPage, int recordsPerPage){
        int startRecord= currentPage*recordsPerPage-recordsPerPage;
        String query = "SELECT X.MaKH,K.TenKH,m.MaMay,m.ViTri,m.TrangThai,sdm.NgayBatDauSuDung,\r\n"
                + "sdm.GioBatDauSuDung,sdm.ThoiGianSuDung,dv.MaDV,sdv.NgaySuDung,sdv.GioSuDung,sdv.SoLuong, X.TongTien as TongTien \r\n"
                + "FROM\r\n"
                + "(select kh.MaKH,SUM(sdv.SoLuong*dv.DonGia) as TongTien from KHACHHANG kh inner join SUDUNGDICHVU sdv on sdv.MaKH = kh.MaKH\r\n"
                + "join DICHVU dv on dv.MaDV = sdv.MaDV\r\n" + "group by kh.MaKH) as X\r\n"
                + "INNER JOIN KHACHHANG K ON X.MAKH = K.MAKH\r\n" + "join SUDUNGMAY sdm on K.MaKH = sdm.MaKH\r\n"
                + "join SUDUNGDICHVU sdv on sdv.MaKH = K.MaKH\r\n" + "join DICHVU dv on dv.MaDV = sdv.MaDV\r\n"
                + "join MAY m on m.MaMay = sdm.MaMay\r\n"
                + "order by x.MaKH\r\n"
                + "offset ? rows\r\n"
                + "fetch next ? rows only";
        return jdbcTemplate.query(query, new RowMapper<List<String>>() {

            @Override
            public List<String> mapRow(ResultSet rs, int rowNum) throws SQLException {
                List<String> list= new ArrayList<>();
                list.add(rs.getString(1));
                list.add(rs.getString(2));
                list.add(rs.getString(3));
                list.add(rs.getString(4));
                list.add(rs.getString(5));
                list.add(rs.getDate(6).toString());
                list.add(rs.getTime(7).toString());
                list.add(Integer.toString(rs.getInt(8)));
                list.add(rs.getString(9));
                list.add(rs.getDate(10).toString());
                list.add(rs.getTime(11).toString());
                list.add(Integer.toString(rs.getInt(12)));
                list.add(Integer.toString(rs.getInt(13)));
                return list;
            }
        },startRecord,recordsPerPage);
    }
    public int numberOfRows(){
        String query= "select count(*) \r\n"
                + "FROM\r\n"
                + "(select kh.MaKH,SUM(sdv.SoLuong*dv.DonGia) as TongTien from KHACHHANG kh inner join SUDUNGDICHVU sdv on sdv.MaKH = kh.MaKH\r\n"
                + "join DICHVU dv on dv.MaDV = sdv.MaDV\r\n" + "group by kh.MaKH) as X\r\n"
                + "INNER JOIN KHACHHANG K ON X.MAKH = K.MAKH\r\n" + "join SUDUNGMAY sdm on K.MaKH = sdm.MaKH\r\n"
                + "join SUDUNGDICHVU sdv on sdv.MaKH = K.MaKH\r\n" + "join DICHVU dv on dv.MaDV = sdv.MaDV\r\n"
                + "join MAY m on m.MaMay = sdm.MaMay";
        return jdbcTemplate.queryForObject(query,Integer.class );
    }
}
