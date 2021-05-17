package ru.job4j.storages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.job4j.storages.entity.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcStorage implements Storage {

    JdbcTemplate jdbctemplate;
    DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbctemplate = new JdbcTemplate(dataSource);
    }

    public JdbcStorage() {
    }

    @Override
    public void add(User user) {
        jdbctemplate.update("INSERT INTO userstor (id, first_name, last_name, email) VALUES(?, ?, ?, ?)", user.getId(), user.getFirstName(), user.getLastName(), user.getEmail());
    }

    public User get(int id) {
        return jdbctemplate.queryForObject("SELECT * FROM userstor WHERE id = ?", new Object[]{id}, new UserMapper());
    }

    public class UserMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();

            user.setId(resultSet.getInt("id"));
            user.setFirstName(resultSet.getString("first_name"));
            user.setLastName(resultSet.getString("last_name"));
            user.setEmail(resultSet.getString("email"));

            return user;
        }
    }
}
