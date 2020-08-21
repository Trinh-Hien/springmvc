package com.trinhthihien.RowMapper;

import com.trinhthihien.model.Computer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ComputerMapper implements RowMapper<Computer> {
    @Override
    public Computer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Computer computer= new Computer();
        computer.setComputerID(rs.getString("MaMay").trim());
        computer.setPosition(rs.getString("ViTri"));
        computer.setStatus(rs.getString("TrangThai"));
        return computer;
    }
}
