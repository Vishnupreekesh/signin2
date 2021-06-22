package sqldatabase;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.xdevapi.Result;

import Main.User;
import Main.rowMapper;

public class UserDeo {
	private JdbcTemplate jdbcTemplate;  

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
//	

	public List<User> setUpTable(String query) {
		// TODO Auto-generated method stub
		
		List<User> userList = jdbcTemplate.query(query, new rowMapper());
		
		return userList;
		
	}

	

}
