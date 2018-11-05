package cn.mao.service.impl;

import cn.mao.dao.UserDao;
import cn.mao.dao.impl.UserDaoImpl;
import cn.mao.domain.User;
import cn.mao.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    public UserDao dao=new UserDaoImpl();
    @Override
    public List<User> findAll() {
        //调用Dao查询
        //List<User> all = user.findAll();

        return dao.findAll();
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public void deleteUser(String id) {
        dao.delete(Integer.parseInt(id));
    }
}
