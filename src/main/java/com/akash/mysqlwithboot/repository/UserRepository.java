package com.akash.mysqlwithboot.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String sql = "select userName from data";

    public List<String> getAllUserName(){
        List<String> userNameList = new ArrayList<>();
        userNameList.addAll(jdbcTemplate.queryForList(sql,  String.class));
        return userNameList;
    }

}
