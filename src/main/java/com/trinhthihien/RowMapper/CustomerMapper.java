package com.trinhthihien.RowMapper;

import com.trinhthihien.model.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer customer=new Customer();
        customer.setCustomerID(rs.getString("MaKH"));
        customer.setCustomerName(rs.getString("TenKH"));
        customer.setAddress(rs.getString("DiaChi"));
        customer.setPhoneNumber(rs.getString("SoDienThoai"));
        customer.setEmail(rs.getString("DiaChiEmail"));
        return customer;
    }
}
