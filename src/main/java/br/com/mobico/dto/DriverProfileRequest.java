package br.com.mobico.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * DriverProfileRequest
 */
@Validated
public class DriverProfileRequest {

    @NotNull
    @JsonProperty("phone")
    private String phone = null;

    @NotNull
    @JsonProperty("name")
    private String name = null;
}
