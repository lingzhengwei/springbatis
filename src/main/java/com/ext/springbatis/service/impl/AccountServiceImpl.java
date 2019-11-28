package com.ext.springbatis.service.impl;

import com.ext.springbatis.dao.AccountDao;
import com.ext.springbatis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    @Transactional
    public void transfer(int outer, int inner, Integer money) {
        accountDao.moveOut(outer, money);
        int i = 1 / 0;
        accountDao.moveIn(inner, money);
    }
}
