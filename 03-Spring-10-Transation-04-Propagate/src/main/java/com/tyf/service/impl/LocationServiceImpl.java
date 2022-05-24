package com.tyf.service.impl;

import com.tyf.dao.LocationDao;
import com.tyf.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tyf
 * @create 2022-03-21-14:35
 */
@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationDao locationDao;

    @Override
    public void addLocation(String name) {
        locationDao.addLocation(name);
    }
}
