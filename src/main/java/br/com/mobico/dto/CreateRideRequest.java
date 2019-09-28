package br.com.mobico.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * CreateRideRequest
 */
@Validated
public class CreateRideRequest   {
  @JsonProperty("origin")
  private Integer origin;

  @JsonProperty("destination")
  private Integer destination;

  @JsonProperty("vacancies")
  private Integer vacancies;

  @JsonProperty("originDescription")
  private String originDescription = null;

  public Integer getOrigin() {
    return origin;
  }

  public void setOrigin(Integer origin) {
    this.origin = origin;
  }
  
  public Integer getDestination() {
    return destination;
  }

  public void setDestination(Integer destination) {
    this.destination = destination;
  }

  public Integer getVacancies() {
    return vacancies;
  }

  public void setVacancies(Integer vacancies) {
    this.vacancies = vacancies;
  }

  public String getOriginDescription() {
    return originDescription;
  }

  public void setOriginDescription(String originDescription) {
    this.originDescription = originDescription;
  }
}
