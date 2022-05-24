package com.tyf.dao.impl;

import com.tyf.dao.LocationDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author tyf
 * @create 2022-03-21-14:19
 */
public class LocationDaoImpl extends JdbcDaoSupport implements LocationDao {
    @Override
    public void addLocation(String name) {
        getJdbcTemplate().update("insert into location(name) values (?)",name);
    }
}
