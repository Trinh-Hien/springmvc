package com.trinhthihien.dao;

import com.trinhthihien.model.RegisterComputer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Time;

@Repository
public class RegisterComputerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean insertRegisterComputer(RegisterComputer registerComputer) throws DataAccessException{
        String query="insert into SUDUNGMAY values(?,?,?,?,?)";
        Object[] objects= new Object[]{registerComputer.getCustomerID(),registerComputer.getComputerID(),
                Date.valueOf(registerComputer.getDate()), Time.valueOf(registerComputer.getTime()),registerComputer.getPeriodOfTime()};
        int row= jdbcTemplate.update(query, objects);
        if(row>0){
            return true;
        }
        return false;
    }
}
