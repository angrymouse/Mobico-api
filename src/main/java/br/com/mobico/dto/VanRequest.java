package br.com.mobico.dto;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * VanRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-06T00:04:53.742Z[GMT]")
public class VanRequest {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("plate")
  private String plate = null;

  @JsonProperty("color")
  private String color = null;

  public VanRequest id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public VanRequest model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public VanRequest plate(String plate) {
    this.plate = plate;
    return this;
  }

  /**
   * Get plate
   * @return plate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public VanRequest color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VanRequest vanRequest = (VanRequest) o;
    return Objects.equals(this.id, vanRequest.id) &&
        Objects.equals(this.model, vanRequest.model) &&
        Objects.equals(this.plate, vanRequest.plate) &&
        Objects.equals(this.color, vanRequest.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, model, plate, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VanRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    plate: ").append(toIndentedString(plate)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
