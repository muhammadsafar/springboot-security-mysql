package io.baharuddinfamily.springbootsecurityjdbcmysql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resources {
	
	@GetMapping("/")
	public String hallo() {	
		return "Its Works all permition";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1>Hallo User</1>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Hallo Admin</h1>";
	}

}
