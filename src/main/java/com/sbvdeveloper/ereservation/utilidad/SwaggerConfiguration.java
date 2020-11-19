package com.sbvdeveloper.ereservation.utilidad;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Clase de configurar Swagger
 * 
 * @author Santiago Betancur
 * @email santiago-betancur@hotmail.com
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	
	//Se le indica que bsucque todos los Rest tipo Controller y los exponga para poderlos verificar
	public Docket documentation() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withMethodAnnotation(RestController.class)).paths(PathSelectors.any())
				.build();
	}

}
