package com.trinhthihien.dao;

import com.trinhthihien.RowMapper.CustomerMapper;
import com.trinhthihien.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CustomerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Customer> getCustomers(int currentPage, int recordsPerPage) throws DataAccessException {
        int rowStart= currentPage*recordsPerPage-recordsPerPage;
        String query= "select * from KHACHHANG order by MaKH offset ? rows fetch next ? rows only";
        return jdbcTemplate.query(query, new CustomerMapper(),rowStart,recordsPerPage);
    }

    public boolean updateCustomer(Customer customer) throws DataAccessException{
        String query="update KHACHHANG set TenKH = ?, DiaChi = ?, SoDienThoai = ?, DiaChiEmail = ? where MaKH = ?";
        int row= jdbcTemplate.update(query,customer.getCustomerName(),customer.getAddress(),customer.getPhoneNumber()
        ,customer.getEmail(),customer.getCustomerID());
        if(row>0){
            return true;
        }
        return false;
    }

    public boolean insertCustommer(Customer customer) throws DataAccessException{
        String query= "insert into KHACHHANG values(?,?,?,?,?)";
        int row= jdbcTemplate.update(query, customer.getCustomerID(),customer.getCustomerName(), customer.getAddress()
        ,customer.getPhoneNumber(), customer.getEmail());
        if(row>0){
            return true;
        }
        return false;
    }

    public boolean deleteCustomer(String customerId) throws DataAccessException{
        String query="delete from KHACHHANG where MaKH = ?";
        int row= jdbcTemplate.update(query,customerId);
        if(row>0){
            return true;
        }
        return false;
    }
    public int numberOfRecords() throws DataAccessException{
        return jdbcTemplate.queryForObject("select count(*) from KHACHHANG",Integer.class);
    }

    public Customer getCustomer(String customerId) throws DataAccessException{
        return jdbcTemplate.queryForObject("select * from KHACHHANG where MaKH=?",new Object[]{customerId},new CustomerMapper());
    }
}
