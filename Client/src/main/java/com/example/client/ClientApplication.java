package com.example.client;
import entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import repositories.ClientRepository;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("repositories")
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}


	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository clientRepository){
		return args ->{
			clientRepository.save(new Client(Long.parseLong("1"),"meryem Mouhoubi",Float.parseFloat("24")));
			clientRepository.save(new Client(Long.parseLong("2"),"taha moubhoubi",Float.parseFloat("27")));
			clientRepository.save(new Client(Long.parseLong("3"),"iman mouhoubi",Float.parseFloat("30")));
		};
	}
}
