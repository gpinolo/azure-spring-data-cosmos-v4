package com.azure.cosmos.example;

import com.azure.cosmos.example.domain.Address;
import com.azure.cosmos.example.repository.AddressRepository;
import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CosmosAzureRunner {

  private static final Logger LOGGER = LoggerFactory.getLogger(CosmosAzureRunner.class);

  public static void main(String[] args) {
    ConfigurableApplicationContext ctx = SpringApplication.run(CosmosAzureRunner.class, args);
    SpringApplication.exit(ctx, () -> 0);
  }

  @Bean
  public CommandLineRunner demo(AddressRepository addressRepository) {
    return args -> {

      Address address = new Address();
      address.setId("myId");
      address.setCity("Naples");
      address.setNation("Italy");

      LOGGER.info("Save address {}", address);

      try {
        Address addressSaved  = addressRepository.save(address);
        LOGGER.info("Address saved {}", addressSaved.getId());
      } catch (Exception e) {
        LOGGER.error("Save address failed", e);
      }
    };

  }
}
