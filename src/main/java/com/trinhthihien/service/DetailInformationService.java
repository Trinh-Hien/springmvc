package com.trinhthihien.service;

import com.trinhthihien.dao.DetailInformationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailInformationService {
    @Autowired
    private DetailInformationDao detailInformationDao;

    public List<List<String>> getDetailInformation(int currentPage, int recordPerPage){
        return detailInformationDao.getDetailInformation(currentPage,recordPerPage);
    }

    public int numberOfRecord(){
        return detailInformationDao.numberOfRows();
    }
}
