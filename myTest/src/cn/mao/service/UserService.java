package cn.mao.service;

import cn.mao.domain.User;

import java.util.List;

public interface UserService {
    //查询信息
    public List<User> findAll();

    //添加用户
    void addUser(User user);

    //删除用户
    void deleteUser(String id);
}
