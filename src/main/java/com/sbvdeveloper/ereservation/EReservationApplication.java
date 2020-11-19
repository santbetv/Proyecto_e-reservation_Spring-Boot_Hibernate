package com.sbvdeveloper.ereservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//Clase base de sprint boot la cual permite que la app funciona o corra utlizando esta tecnologia.
//Se exluye la clase por default para colocar nuestras configuraci{on de seguridad
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class EReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EReservationApplication.class, args);
	}

}
