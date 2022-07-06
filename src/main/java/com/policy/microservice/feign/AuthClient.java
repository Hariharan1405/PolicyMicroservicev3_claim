package com.policy.microservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.policy.microservice.dto.ValidatingDTO;


@FeignClient(name = "auth-client", url = "${Cdeauthorizationpod2-env.eba-psugwnmv.us-east-1.elasticbeanstalk.com }")
public interface AuthClient {
	
	 @GetMapping(value = "/validate")
     public ValidatingDTO getsValidity(@RequestHeader(name = "Authorization", required = true) String token);

}
