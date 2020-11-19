/**
 * 
 */
package com.sbvdeveloper.ereservation.utilidad;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

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
		http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
		http.csrf().disable(); //para se desactivar la protección CSRF en toda tu aplicación por lo tanto en cada formulario que se rellene, se debe de incluir.
		//es por que se activa cierto token de seguridad.
	}
}
