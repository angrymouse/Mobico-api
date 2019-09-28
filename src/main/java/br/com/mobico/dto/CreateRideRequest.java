package br.com.mobico.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * CreateRideRequest
 */
@Validated
public class CreateRideRequest   {
  @JsonProperty("origin")
  @NotNull
  private Integer origin = null;

  @JsonProperty("destination")
  @NotNull
  private Integer destination = null;

  @JsonProperty("vacancies")
  @NotNull
  private Integer vacancies = null;

  @JsonProperty("originDescription")
  @NotNull
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
