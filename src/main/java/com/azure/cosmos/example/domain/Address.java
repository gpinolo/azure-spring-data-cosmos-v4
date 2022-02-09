package com.azure.cosmos.example.domain;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Version;

/**
 * Address
 */
@Container(containerName = "addresses")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {

  private String id;

  @PartitionKey
  private String nation;

  private String city;

  @Version
  private String _etag;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNation() {
    return nation;
  }

  public void setNation(String nation) {
    this.nation = nation;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String get_etag() {
    return _etag;
  }

  public void set_etag(String _etag) {
    this._etag = _etag;
  }

  @Override public String toString() {
    return "Address{" +
        "id='" + id + '\'' +
        ", city='" + city + '\'' +
        ", nation='" + nation + '\'' +
        ", _etag='" + _etag + '\'' +
        '}';
  }
}
