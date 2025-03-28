package document.uploader.backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI createOpenAPI() {
        OpenAPI customOpenAPI = new OpenAPI();
        customOpenAPI.info(
                new Info()
                        .title("Document Store Backend")
                        .version("0.0.1")
                        .description("This application stores documents")
        );
        return customOpenAPI;
    }
}
