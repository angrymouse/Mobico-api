package br.com.mobico.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

/**
 * RideResponse
 */
@Validated
@Getter
@Setter
public class RideResponse   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("origin")
  private Locality origin = null;

  @JsonProperty("destination")
  private Locality destination = null;

  @JsonProperty("van")
  private VanResponse van = null;

  @JsonProperty("vacancies")
  private Integer vacancies = null;

  @JsonProperty("originDescription")
  private String originDescription = null;
}
