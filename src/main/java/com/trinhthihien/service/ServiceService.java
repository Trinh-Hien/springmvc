package com.trinhthihien.service;

import com.trinhthihien.dao.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceService {
    @Autowired
    private ServiceDao serviceDao;

    public List<com.trinhthihien.model.Service> getServiceList(int currentPage, int recordPerPage) throws DataAccessException{
        return serviceDao.getServiceList(currentPage,recordPerPage);
    }
    public com.trinhthihien.model.Service getService(String serviceId) throws DataAccessException{
        return  serviceDao.getService(serviceId);
    }
    public int numberOfRecord() throws DataAccessException{
        return serviceDao.numberOfRecords();
    }
    public boolean insertService(com.trinhthihien.model.Service service) throws DataAccessException{
        return serviceDao.insertService(service);
    }
    public boolean updateService(com.trinhthihien.model.Service service) throws DataAccessException{
        return serviceDao.updateService(service);
    }
    public boolean deleteService(String serviceId) throws DataAccessException{
        return serviceDao.deleteService(serviceId);
    }

}
