package com.trinhthihien.service;

import com.trinhthihien.dao.RegisterServiceDao;
import com.trinhthihien.model.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceService {
    @Autowired
    private RegisterServiceDao registerServiceDao;

    public boolean insertRegisterService(RegisterService registerService) throws DataAccessException {
        return registerServiceDao.insertRegisterService(registerService);
    }
}
