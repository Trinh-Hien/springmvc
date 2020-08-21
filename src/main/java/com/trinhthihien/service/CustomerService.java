package com.trinhthihien.service;

import com.trinhthihien.dao.CustomerDao;
import com.trinhthihien.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;
     public List<Customer> getCustomers(int currentPage, int recordsPerPage)throws DataAccessException {
         return customerDao.getCustomers(currentPage,recordsPerPage);
     }
     public boolean deleteCustomer(String customerId) throws DataAccessException{
         return customerDao.deleteCustomer(customerId);
     }

     public boolean updateCustomer(Customer customer)throws DataAccessException{
         return customerDao.updateCustomer(customer);
     }

     public boolean insertCustomer(Customer customer)throws DataAccessException{
         return customerDao.insertCustommer(customer);
     }

     public int numberOfRecord()throws DataAccessException{
         return customerDao.numberOfRecords();
     }
     public Customer getCustomer(String customerId) throws DataAccessException{
         return customerDao.getCustomer(customerId);
     }
}
