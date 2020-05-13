package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * AccountDAO继承基类
 */
@Mapper
public interface AccountMapper extends MyBatisBaseMapper<Account, Integer> {

    public int updateByUserId(@Param("userId") Integer userId, @Param("account")Double account);
}