package Main;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class rowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet res, int rowNo) throws SQLException {
		// TODO Auto-generated method stub
		User user=new User();
		user.setFirstname(res.getString("firstname"));
		user.setLastname(res.getString("lastnamr"));
		user.setStatus(res.getInt("status"));
		user.setPassword(res.getString("password"));
		user.setEmailType(res.getInt("email_type"));
		user.setEmail(res.getString("e_mail"));
		
		return user;
	
	}

}
