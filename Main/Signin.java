package Main;

import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sqldatabase.Functions;
import sqldatabase.UserDeo;

public class Signin {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, NoSuchAlgorithmException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Email : ");
		String email=sc.next();
		System.out.println("Enter the Password : ");
		String pass=Password.doHashing(sc.next());
		
//		String  query="select u.firstname,u.lastnamr,u.status,p.password,e.email_type,e.e_mail from (usertable u join emailtable e on u.userid=e.userid) join pwdtable p on u.userid=p.userid where e.userid=(select userid from emailtable where e_mail='"+email+"') and p.password='"+pass+"' "; 
		String query="select u.firstname,u.lastnamr,u.status,p.password,e.email_type,e.e_mail from  (usertable u join emailtable e on u.userid=e.userid) join pwdtable p on u.userid=p.userid where e.userid=(select userid from emailtable where e_mail='"+email+"')and p.password='"+pass+"' ";
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		UserDeo user=context.getBean("userdeo",UserDeo.class);
		List<User> userList=  user.setUpTable(query);
		int t=0;
		
		if(userList.size()==0) {
			System.out.print("Inavalid username");
		}
		else {
			System.out.print("Login successfully");
		}
		
		
		
////		String query="select userid,e_mail from emailtable where e_mail='"+email+"'and userid=(select userid from pwdtable where password ='"+pass+"')";
//		List<Object> li=new ArrayList<>();
//		li.add(sqldatabase.Functions.select(query));
//
//		if((li.get(0)==null)) {
//			System.out.print("Invalid Username or Password");
//		}
//		else {
//			List l=(List) li.get(0);
//			String firstname=(String) l.get(0);
//			String lastname=(String) l.get(1);
//			int status=(int) l.get(2);
//			String password=(String) l.get(3);
//			Map map=(Map) l.get(4);
//			User obj=new User(firstname,lastname,status,password,map);
//			System.out.print("Login Successfully");
//		}
		
	}
}
