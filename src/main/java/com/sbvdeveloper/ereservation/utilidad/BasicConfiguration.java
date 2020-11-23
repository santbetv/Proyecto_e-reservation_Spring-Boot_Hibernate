/**
 * 
 */
package com.sbvdeveloper.ereservation.utilidad;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Clase para manejar seguridad
 * 
 * @author Santiago Betancur
 * @email santiago-betancur@hotmail.com
 *
 *
 */
@Configuration
@EnableWebSecurity
public class BasicConfiguration extends WebSecurityConfigurerAdapter {
	/**
	 * -Por medio de http se autorizan las peticiones -de que tipo van autorizar, de
	 * cualquier tipo pero de manera autentidicada -utilizar un fomulario de login
	 * -y metodo de autenticación basico. -
	 */
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
		.anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/app/login").permitAll()
			.failureUrl("/app/login?error=true")
			.defaultSuccessUrl("/app/home");
		
		//http.csrf().disable(); //para se desactivar la protección CSRF en toda tu aplicación por lo tanto en cada formulario que se rellene, se debe de incluir.
		//es por que se activa cierto token de seguridad.
	}
	
	
	
	//Configurar el método de autentificación, para lo cual utilizamos un método en memoria.
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		auth.inMemoryAuthentication().withUser("sbvdeveloper").password(encoder.encode("admin123456")).roles("USER");
	}
	
	//Configurar qué rutas de la aplicación se deben excluir del proceso de login, en la cual 
	//están todos los recursos estáticos configurados anteriormente.
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
