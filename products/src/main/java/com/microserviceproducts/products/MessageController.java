package com.microserviceproducts.products;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("client")
public interface MessageController {
	@RequestMapping("/message")
	String getMessage();
}