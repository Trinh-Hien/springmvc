package com.trinhthihien.dao;

import com.trinhthihien.RowMapper.ComputerMapper;
import com.trinhthihien.model.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ComputerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Computer> getAllComputers(int currentPage, int recordsPerPage) throws DataAccessException{
        int rowStart= currentPage*recordsPerPage-recordsPerPage;
        String query = "select * from MAY order by MaMay offset ? rows fetch next ? rows only";
        return jdbcTemplate.query(query, new ComputerMapper(),rowStart,recordsPerPage);
    }
    public boolean deleteComputer(String computerID) throws DataAccessException{
        int row =  jdbcTemplate.update("delete from MAY where MaMay = ? ", computerID);
        if(row>0) return true;
        return false;
    }
    public boolean updateComputer(Computer computer) throws DataAccessException{
        int row =  jdbcTemplate.update("update MAY set ViTri = ?, TrangThai = ?  where MaMay = ? ", computer.getPosition()
        ,computer.getStatus(),computer.getComputerID());
        if(row>0) return true;
        return false;
    }
    public Computer getComputer(String computerID) throws DataAccessException{
        return jdbcTemplate.queryForObject("select * from MAY where MaMay=?", new Object[]{computerID}, new ComputerMapper());
    }

    public boolean insertComputer(Computer computer) throws DataAccessException{
            int row = jdbcTemplate.update("insert into MAY values(?,?,?) ", computer.getComputerID(), computer.getPosition()
                    , computer.getStatus());
            if (row > 0) return true;

        return false;
    }

    public int numberOfRecords() throws DataAccessException{
        return jdbcTemplate.queryForObject("select count(*) from MAY", Integer.class);
    }

}
