package com.atguigu.mybatis.service.impl;

import com.atguigu.mybatis.mapper.AccountMapper;
import com.atguigu.mybatis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {


    @Resource
    private AccountMapper accountMapper;



    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateAccountByUserId(Integer userId,  Double account) {


        int i=10/0;
        //账户增加100，email改为:zhangsan@qq.com


        accountMapper.updateByUserId(userId,account);

        return 0;
    }
}
