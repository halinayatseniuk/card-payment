package org.automation.clients;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.automation.utilities.SignatureGenerator;

import static io.restassured.RestAssured.given;
import static org.automation.utilities.JsonConfig.MAPPER;

public class ApiClient {

    private final RequestSpecification spec;

    public ApiClient(String baseUrl) {
        this.spec = new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .setContentType(ContentType.JSON)
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    public Response post(String path, Object requestBody) {
        String publicKey = System.getenv("API_KEY");
        String secretKey = System.getenv("SECRET_KEY");
        String body = MAPPER.writeValueAsString(requestBody);

        String generatedSignature = SignatureGenerator.generateSignature(publicKey, body, secretKey);

        return given()
                .spec(this.spec.header("merchant", publicKey).header("signature", generatedSignature))
                .body(body)
                .when()
                .post(path);
    }
}