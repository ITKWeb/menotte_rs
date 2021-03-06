package com.itkweb.menotte.menotte_rs.spring_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// Hard coded mot de passe so far ...
		auth
		// .jdbcAuthentication()
		// .dataSource(dataSource)
		//
		// .usersByUsernameQuery("select username,password,enabled from users where username
		= ?")
				//
				// .authoritiesByUsernameQuery("select username,authority from authorities where username = ?");
				.inMemoryAuthentication().withUser("aaa").password("aaa").roles("USER");
	}

	// TODO : redirection vers notre login
	//	@Override
	//	protected void configure(HttpSecurity http) throws Exception {
	//		http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll();
	//	}

}
