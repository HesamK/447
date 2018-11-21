package com.politiforum.politiforum;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {
   public User mapRow(ResultSet rs, int rowNum) throws SQLException {
      User User = new User();
      User.setId(rs.getInt("id"));
      User.setName(rs.getString("name"));
      User.setAge(rs.getInt("age"));
      
      return User;
   }
}