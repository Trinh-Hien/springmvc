package com.trinhthihien.RowMapper;

import com.trinhthihien.model.RegisterComputer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterComputerMapper implements RowMapper<RegisterComputer> {
    @Override
    public RegisterComputer mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegisterComputer registerComputer= new RegisterComputer();
        registerComputer.setComputerID(rs.getString("MaMay"));
        registerComputer.setCustomerID(rs.getString("MaKH"));
        registerComputer.setDate(rs.getDate("NgayBatDauSuDung").toLocalDate());
        registerComputer.setTime(rs.getTime("GioBatDauSuDung").toLocalTime());
        registerComputer.setPeriodOfTime(rs.getInt("ThoiGianSuDung"));
        return registerComputer;
    }
}
