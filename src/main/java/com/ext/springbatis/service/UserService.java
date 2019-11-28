package com.ext.springbatis.service;

import com.ext.springbatis.model.User;
import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
