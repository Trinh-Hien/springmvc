package com.trinhthihien.service;

import com.trinhthihien.dao.ComputerDao;
import com.trinhthihien.model.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ComputerService {
    @Autowired
    private ComputerDao computerDao;

    public List<Computer> getAllComputers(int currentPage,int recordsPerPage)throws DataAccessException{

        return computerDao.getAllComputers(currentPage,recordsPerPage);
    }
    public boolean insertComputer(Computer computer) throws DataAccessException {
        return  computerDao.insertComputer(computer);
    }
    public boolean updateComputer(Computer computer)throws DataAccessException{

        return computerDao.updateComputer(computer);
    }
    public boolean deleteComputer(String computerID)throws DataAccessException{
        return computerDao.deleteComputer(computerID);
    }
    public Computer getComputer(String computerID)throws DataAccessException{
        return computerDao.getComputer(computerID);
    }

    public int numberOfRecords()throws DataAccessException{
        return computerDao.numberOfRecords();
    }


}
