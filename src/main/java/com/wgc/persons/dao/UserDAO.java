package com.wgc.persons.dao;

import com.wgc.persons.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDAO {

    @Autowired
    private JdbcOperations jdbcOperations;


    public List<Map<String, Object>> getToList() {
        List<Map<String, Object>> maps = jdbcOperations.queryForList("select * from demo.p_user");
        return maps;
    }

    public User getToUser() {
        String sql = "select * from demo.p_user where id > 1";

        User user = jdbcOperations.queryForObject(
                sql,
             /*   new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet resultSet, int i) throws SQLException {
                        return null;
                    }
                }*/
        (rs, row) -> new User(rs.getString(1))
        );
        return user;
    }


}
