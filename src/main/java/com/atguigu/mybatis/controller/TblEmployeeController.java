package com.atguigu.mybatis.controller;


import com.atguigu.mybatis.pojo.TblEmployee;
import com.atguigu.mybatis.service.TblEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TblEmployeeController {


    @Autowired
    private TblEmployeeService tblEmployeeService;

    @GetMapping("/tblEmployee/{id}")
    public TblEmployee getById(@PathVariable("id") Integer id){


        return tblEmployeeService.selectByPrimaryKey(id);



    }
}
