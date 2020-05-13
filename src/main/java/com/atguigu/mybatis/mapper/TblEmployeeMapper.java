package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.TblEmployee;
import org.apache.ibatis.annotations.Mapper;

/**
 * TblEmployeeMapper继承基类
 */
@Mapper
public interface TblEmployeeMapper extends MyBatisBaseMapper<TblEmployee, Integer> {
}