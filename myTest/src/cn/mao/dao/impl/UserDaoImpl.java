package cn.mao.dao.impl;

import cn.mao.dao.UserDao;
import cn.mao.domain.User;
import cn.mao.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        //使用Jdbc操作数据库

        String sql = "select * from user";

        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));

        return users;
    }

    @Override
    public void add(User user) {

        String sql = "insert into user values(null,?,?,?,?)";

        template.update(sql,user.getName(),user.getGender(),user.getAge(),user.getEmail());
    }

    @Override
    public void delete(int id) {

        String sql = "delete from user where id = ?";

        template.update(sql,id);
    }
}
