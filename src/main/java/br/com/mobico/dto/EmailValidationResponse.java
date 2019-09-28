package br.com.mobico.dto;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * EmailValidationResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-06T00:04:53.742Z[GMT]")
public class EmailValidationResponse   {
  @JsonProperty("valid")
  private Boolean valid = null;

  @JsonProperty("message")
  private String message = null;

  public EmailValidationResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
  **/
  @ApiModelProperty(value = "")

  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public EmailValidationResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailValidationResponse emailValidationResponse = (EmailValidationResponse) o;
    return Objects.equals(this.valid, emailValidationResponse.valid) &&
        Objects.equals(this.message, emailValidationResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailValidationResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
