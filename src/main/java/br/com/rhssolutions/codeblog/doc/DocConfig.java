package br.com.rhssolutions.codeblog.doc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DocConfig {

    @Bean
    public OpenAPI OpenAPI() {
        return new OpenAPI()
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("API Code Blog")
                        .description("API de gerenciamento de posts pessoais")
                        .version("1.0.0")
                        .termsOfService("https://rhssolutions.com.br/terms-of-service.html")
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html"))
                        .contact(new Contact()
                                .name("RHSsolutions.com.br")
                                .email("rhssolutions@gmail.com")
                                .url("https://rhssolutions.com.br"))

                ).externalDocs( new io.swagger.v3.oas.models.ExternalDocumentation()
                        .description("Github")
                        .url("https://github.com/RafaSamm/CodeBlog"));
    }


}












