package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicesKafkaProducerAppApplication
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MicroservicesKafkaProducerAppApplication.class, args);
		System.out.println("Kafka producer App has been Started Successfully.............");
	}

}
