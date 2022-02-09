package com.azure.cosmos.example;

import com.azure.core.credential.AzureKeyCredential;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.CosmosDatabase;
import com.azure.cosmos.DirectConnectionConfig;
import com.azure.cosmos.GatewayConnectionConfig;
import com.azure.spring.data.cosmos.config.AbstractCosmosConfiguration;
import com.azure.spring.data.cosmos.config.CosmosConfig;
import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCosmosRepositories
public class CosmosConfiguration extends AbstractCosmosConfiguration {

  @Value("${azure.cosmos.uri}")
  private String uri;

  @Value("${azure.cosmos.key}")
  private String key;

  @Value("${azure.cosmos.database}")
  private String dbName;

  @Bean
  public CosmosClientBuilder getCosmosClientBuilder() {
    AzureKeyCredential azureKeyCredential = new AzureKeyCredential(key);
    return new CosmosClientBuilder()
        .endpoint(uri)
        .credential(azureKeyCredential);
  }

  @Override
  protected String getDatabaseName() {
    return dbName;
  }

}
