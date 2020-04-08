package oauth.spring.springsecurity.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
//@EnableOAuth2Client -> this annotatiton is used when you don't want oauth2 to be leveraged for authentication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
