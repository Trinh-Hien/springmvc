package com.trinhthihien.service;

import com.trinhthihien.dao.RegisterComputerDao;
import com.trinhthihien.model.RegisterComputer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class RegisterComputerService {
    @Autowired
    private RegisterComputerDao registerComputerDao;

    public boolean insertRegister(RegisterComputer registerComputer) throws DataAccessException{
        return registerComputerDao.insertRegisterComputer(registerComputer);
    }
}
