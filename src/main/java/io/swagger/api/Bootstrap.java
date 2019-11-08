package io.swagger.api;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
    info = @Info(
        title = "Swagger Server", 
        version = "1.0", 
        description = "This API provides different services to obtain the result of different operations.",
        termsOfService = "https://calculator.spilab.es/terms",
        contact = @Contact(email = "jberolm@unex.es"),
        license = @License(
            name = "",
            url = "http://unlicense.org"
        )
    )
)
public class Bootstrap {
}
