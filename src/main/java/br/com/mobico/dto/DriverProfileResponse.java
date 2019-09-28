package br.com.mobico.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * DriverProfileResponse
 */
@Validated
public class DriverProfileResponse {

	@NotNull
	@JsonProperty("phone")
	private String phone = null;

	@NotNull
	@JsonProperty("name")
	private String name = null;
}
