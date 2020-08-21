package com.trinhthihien.dao;

import com.trinhthihien.model.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Time;

@Repository
public class RegisterServiceDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean insertRegisterService(RegisterService registerService) throws DataAccessException{
        String query="insert into SUDUNGDICHVU values(?,?,?,?,?)";
        int row= jdbcTemplate.update(query,registerService.getCustomerID(),registerService.getServiceID(), Date.valueOf(registerService.getDate()),
                Time.valueOf(registerService.getTime()),registerService.getQuantity());
        if(row>0){
            return true;
        }
        return false;
    }
}
