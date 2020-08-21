package com.trinhthihien.RowMapper;

import com.trinhthihien.model.RegisterService;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterServiceMapper implements RowMapper<RegisterService> {

    @Override
    public RegisterService mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegisterService registerService= new RegisterService();
        registerService.setCustomerID(rs.getString("MaKH"));
        registerService.setServiceID(rs.getString("MaDV"));
        registerService.setDate(rs.getDate("NgaySuDung").toLocalDate());
        registerService.setTime(rs.getTime("GioSuDung").toLocalTime());
        registerService.setQuantity(rs.getInt("SoLuong"));
        return registerService;
    }
}
