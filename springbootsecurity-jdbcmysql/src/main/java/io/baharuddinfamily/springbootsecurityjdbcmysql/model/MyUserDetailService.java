package io.baharuddinfamily.springbootsecurityjdbcmysql.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<User> user = userRepo.findByUsername(username);

		user.orElseThrow(()-> new UsernameNotFoundException("Not Found " + username));
		
		return user.map(MyUserDetails::new).get();

//		return new MyUserDetails(username);
	}

}
