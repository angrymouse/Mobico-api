package br.com.mobico.dto;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RideResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-04T19:31:55.305Z[GMT]")
public class RideResponse   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("origin")
  private Locality origin = null;

  @JsonProperty("destination")
  private Locality destination = null;

  @JsonProperty("departureTime")
  private OffsetDateTime departureTime = null;

  @JsonProperty("van")
  private VanResponse van = null;

  @JsonProperty("vacancies")
  private Integer vacancies = null;

  @JsonProperty("food")
  private Boolean food = null;

  @JsonProperty("drink")
  private Boolean drink = null;

  @JsonProperty("animal")
  private Boolean animal = null;

  @JsonProperty("bag")
  private Boolean bag = null;

  @JsonProperty("originDescription")
  private String originDescription = null;

  public RideResponse id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RideResponse origin(Locality origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Locality getOrigin() {
    return origin;
  }

  public void setOrigin(Locality origin) {
    this.origin = origin;
  }

  public RideResponse destination(Locality destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Locality getDestination() {
    return destination;
  }

  public void setDestination(Locality destination) {
    this.destination = destination;
  }

  public RideResponse departureTime(OffsetDateTime departureTime) {
    this.departureTime = departureTime;
    return this;
  }

  /**
   * Get departureTime
   * @return departureTime
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OffsetDateTime getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(OffsetDateTime departureTime) {
    this.departureTime = departureTime;
  }

  public RideResponse van(VanResponse van) {
    this.van = van;
    return this;
  }

  /**
   * Get van
   * @return van
  **/
  @ApiModelProperty(value = "")

  @Valid
  public VanResponse getVan() {
    return van;
  }

  public void setVan(VanResponse van) {
    this.van = van;
  }

  public RideResponse vacancies(Integer vacancies) {
    this.vacancies = vacancies;
    return this;
  }

  /**
   * Get vacancies
   * @return vacancies
  **/
  @ApiModelProperty(value = "")

  public Integer getVacancies() {
    return vacancies;
  }

  public void setVacancies(Integer vacancies) {
    this.vacancies = vacancies;
  }

  public RideResponse food(Boolean food) {
    this.food = food;
    return this;
  }

  /**
   * Get food
   * @return food
  **/
  @ApiModelProperty(value = "")

  public Boolean isFood() {
    return food;
  }

  public void setFood(Boolean food) {
    this.food = food;
  }

  public RideResponse drink(Boolean drink) {
    this.drink = drink;
    return this;
  }

  /**
   * Get drink
   * @return drink
  **/
  @ApiModelProperty(value = "")

  public Boolean isDrink() {
    return drink;
  }

  public void setDrink(Boolean drink) {
    this.drink = drink;
  }

  public RideResponse animal(Boolean animal) {
    this.animal = animal;
    return this;
  }

  /**
   * Get animal
   * @return animal
  **/
  @ApiModelProperty(value = "")

  public Boolean isAnimal() {
    return animal;
  }

  public void setAnimal(Boolean animal) {
    this.animal = animal;
  }

  public RideResponse bag(Boolean bag) {
    this.bag = bag;
    return this;
  }

  /**
   * Get bag
   * @return bag
  **/
  @ApiModelProperty(value = "")

  public Boolean isBag() {
    return bag;
  }

  public void setBag(Boolean bag) {
    this.bag = bag;
  }

  public RideResponse originDescription(String originDescription) {
    this.originDescription = originDescription;
    return this;
  }

  /**
   * Get originDescription
   * @return originDescription
  **/
  @ApiModelProperty(value = "")

  public String getOriginDescription() {
    return originDescription;
  }

  public void setOriginDescription(String originDescription) {
    this.originDescription = originDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RideResponse rideResponse = (RideResponse) o;
    return Objects.equals(this.id, rideResponse.id) &&
        Objects.equals(this.origin, rideResponse.origin) &&
        Objects.equals(this.destination, rideResponse.destination) &&
        Objects.equals(this.departureTime, rideResponse.departureTime) &&
        Objects.equals(this.van, rideResponse.van) &&
        Objects.equals(this.vacancies, rideResponse.vacancies) &&
        Objects.equals(this.food, rideResponse.food) &&
        Objects.equals(this.drink, rideResponse.drink) &&
        Objects.equals(this.animal, rideResponse.animal) &&
        Objects.equals(this.bag, rideResponse.bag) &&
        Objects.equals(this.originDescription, rideResponse.originDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, origin, destination, departureTime, van, vacancies, food, drink, animal, bag, originDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RideResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    van: ").append(toIndentedString(van)).append("\n");
    sb.append("    vacancies: ").append(toIndentedString(vacancies)).append("\n");
    sb.append("    food: ").append(toIndentedString(food)).append("\n");
    sb.append("    drink: ").append(toIndentedString(drink)).append("\n");
    sb.append("    animal: ").append(toIndentedString(animal)).append("\n");
    sb.append("    bag: ").append(toIndentedString(bag)).append("\n");
    sb.append("    originDescription: ").append(toIndentedString(originDescription)).append("\n");
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
