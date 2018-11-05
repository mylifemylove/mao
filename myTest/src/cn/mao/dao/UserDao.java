package cn.mao.dao;

import cn.mao.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();

    void add(User user);

    void delete(int id);
}
