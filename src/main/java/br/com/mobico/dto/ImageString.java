package br.com.mobico.dto;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ImageString
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-04T01:15:06.795Z[GMT]")
public class ImageString   {
  @JsonProperty("image")
  private String image = null;

  public ImageString image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageString imageString = (ImageString) o;
    return Objects.equals(this.image, imageString.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageString {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
