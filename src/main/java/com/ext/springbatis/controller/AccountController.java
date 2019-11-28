package com.ext.springbatis.controller;

import com.ext.springbatis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/transfer/{inId}/{outId}/{money}")
    public String transfer(@PathVariable("inId") int inId, @PathVariable("outId") int outId,
            @PathVariable("money") int money) {
        try {
            accountService.transfer(outId, inId, money);
        } catch (Exception e) {
            System.out.println("异常"+ e.getMessage());
        }
        return "{code:success}";
    }
}
