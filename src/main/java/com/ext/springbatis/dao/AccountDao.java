package com.ext.springbatis.dao;

import com.ext.springbatis.model.Account;
import org.apache.ibatis.annotations.Param;

public interface AccountDao {

    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    public void moveIn(@Param("id") int id, @Param("money") float money); // 转入

    public void moveOut(@Param("id") int id, @Param("money") float money); // 转出
}