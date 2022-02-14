package ConfigClient.centralizedconfigurationclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CentralizedConfigurationClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(CentralizedConfigurationClientApplication.class, args);
  }
}

@RefreshScope
@RestController
class MessageRestController {

  @Value("${message:Hello default}")
  private String message;

  @RequestMapping("/message")
  String getMessage() {
    return this.message;
  }
}

@RefreshScope
@RestController
class TestController {
	@Value("${test:Hello default}")
	private String test;

	@RequestMapping("/test")
	String getTest() {
		return this.test;
	}
}