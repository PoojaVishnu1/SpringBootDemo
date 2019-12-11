package com.example.demo.DBcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DBController {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping( value="/createTable", method=RequestMethod.GET)
		public void createtable()
	{
		try {			
	jdbcTemplate.execute("CREATE TABLE CARDDETAILS ("  +
			"CARDNO INTEGER, CARDNM VARCHAR(255), STATUS VARCHAR(255))");
	
		}catch(Exception e) {
		e.printStackTrace();
	}
	
	}
	
	
	@RequestMapping( value="/putdata", method=RequestMethod.GET)
	public void putdata()
{
	try {			
jdbcTemplate.execute("INSERT INTO CARDDETAILS(CARDNO,CARDNM,STATUS) VALUES (1,'AAA','ACTIVE')");
jdbcTemplate.execute("INSERT INTO CARDDETAILS(CARDNO,CARDNM,STATUS) VALUES (2,'BBB','ACTIVE')");
jdbcTemplate.execute("INSERT INTO CARDDETAILS(CARDNO,CARDNM,STATUS) VALUES (3,'CCC','INACTIVE')");
jdbcTemplate.execute("INSERT INTO CARDDETAILS(CARDNO,CARDNM,STATUS) VALUES (4,'DDD','ACTIVE')");

	}catch(Exception e) {
	e.printStackTrace();
}

}
	
}
