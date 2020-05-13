package com.atguigu.mybatis.service.impl;


import com.atguigu.mybatis.mapper.TblEmployeeMapper;
import com.atguigu.mybatis.pojo.TblEmployee;
import com.atguigu.mybatis.service.AccountService;
import com.atguigu.mybatis.service.TblEmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TblEmployeeServiceImpl implements TblEmployeeService {


    @Resource
    private TblEmployeeMapper tblEmployeeMapper;

    @Resource
    private AccountService accountService;




    @Override

    public TblEmployee selectByPrimaryKey(Integer id) {


        return tblEmployeeMapper.selectByPrimaryKey(id);


    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateAccountAndEmployeeById(Integer id, String email, Double account) {
        //账户增加100，email改为:zhangsan@qq.com

        TblEmployee tblEmployee=new TblEmployee();
        tblEmployee.setId(id);
        tblEmployee.setEmail(email);


        tblEmployeeMapper.updateByPrimaryKey(tblEmployee);


        accountService.updateAccountByUserId(id,account+1000);



        return 0;
    }




}
