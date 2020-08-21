package com.trinhthihien.dao;

import com.trinhthihien.RowMapper.ServiceMapper;
import com.trinhthihien.model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ServiceDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Service> getServiceList(int currentPage, int recordsPerPage) throws DataAccessException {
        int rowStart= currentPage*recordsPerPage-recordsPerPage;
        String query = "select * from DICHVU order by MaDV offset ? rows fetch next ? rows only";
        return jdbcTemplate.query(query,new ServiceMapper(),rowStart,recordsPerPage);
    }

    public int numberOfRecords() throws DataAccessException{
        String query="select count(*) from DICHVU";
        return jdbcTemplate.queryForObject(query,Integer.class);
    }

    public Service getService(String serviceID)throws DataAccessException{
        String query= "select * from DICHVU where MaDV=?";
        return jdbcTemplate.queryForObject(query, new Object[]{serviceID}, new ServiceMapper());
    }

    public boolean deleteService(String serviceID)throws DataAccessException{
        String query= "delete from DICHVU where MaDV=?";
        int row= jdbcTemplate.update(query,serviceID);
        if(row>0){
            return true;
        }
        return false;
    }

    public boolean updateService(Service service)throws DataAccessException{
        String query="update DICHVU set TenDV = ?, DonViTinh = ?, DonGia = ? where MaDV = ?";
        int row= jdbcTemplate.update(query,service.getServiceName(),service.getUnit(),service.getPrice(),service.getServiceID());
        if(row>0){
            return true;
        }
        return false;
    }
    public boolean insertService(Service service)throws DataAccessException{
        String query="insert into DICHVU values(?,?,?,?)";
        int row= jdbcTemplate.update(query,service.getServiceID(),service.getServiceName(),service.getUnit(),service.getPrice());
        if(row>0){
            return true;
        }
        return false;
    }
}
