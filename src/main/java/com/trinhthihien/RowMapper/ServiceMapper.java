package com.trinhthihien.RowMapper;

import com.trinhthihien.model.Service;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceMapper implements RowMapper<Service> {
    @Override
    public Service mapRow(ResultSet rs, int rowNum) throws SQLException {
        Service service= new Service();
        service.setServiceID(rs.getString("MaDV").trim());
        service.setServiceName(rs.getString("TenDV"));
        service.setUnit(rs.getString("DonViTinh"));
        service.setPrice(rs.getInt("DonGia"));
        return service;
    }
}
