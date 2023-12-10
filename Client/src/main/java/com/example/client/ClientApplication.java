package com.example.client;
import com.example.client.entities.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import com.example.client.repositories.ClientRepository;

@EnableDiscoveryClient
@SpringBootApplication
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
