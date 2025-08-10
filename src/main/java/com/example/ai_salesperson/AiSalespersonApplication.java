package com.example.ai_salesperson;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class AiSalespersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiSalespersonApplication.class, args);
	}

	@Bean
	public ToolCallbackProvider plpMCPAdapaterToolBack(PlpMcpAdapter plpMCPAdapater) {
		return  MethodToolCallbackProvider.builder().toolObjects(plpMCPAdapater).build();
	}

	@Bean
	public ToolCallbackProvider orderMCPAdapterToolBack(OrderMcpAdapter orderMCPAdapter) {
		return  MethodToolCallbackProvider.builder().toolObjects(orderMCPAdapter).build();
	}

}
