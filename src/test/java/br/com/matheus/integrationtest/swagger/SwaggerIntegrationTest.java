package br.com.matheus.integrationtest.swagger;

import static io.restassured.RestAssured.given;

import br.com.matheus.configs.TestConfigs;
import br.com.matheus.integrationtest.testcontainer.AbstractIntegrationTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class SwaggerIntegrationTest extends AbstractIntegrationTest {

	@Test
	public void shouldDisplaySwaggerUiPage(){
		var content =
			given().basePath("/swagger-ui/index.html")
					.port(TestConfigs.SERVER_PORT)
					.when()
					.get()
					.then()
					.extract()
					.body()
					.asString();

		assertTrue(content.contains("Swagger UI"));
	}

}
