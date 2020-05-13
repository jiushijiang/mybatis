package com.atguigu.mybatis.service;

import com.atguigu.mybatis.pojo.TblEmployee;

public interface TblEmployeeService {


    TblEmployee selectByPrimaryKey(Integer id);

    int updateAccountAndEmployeeById(Integer id,String email,Double account);
}
