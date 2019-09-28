package br.com.mobico.dto;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateRideRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-04T19:39:45.081Z[GMT]")
public class CreateRideRequest   {
  @JsonProperty("origin")
  private Integer origin = null;

  @JsonProperty("destination")
  private Integer destination = null;

  @JsonProperty("departureTimes")
  @Valid
  private List<OffsetDateTime> departureTimes = null;

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

  @JsonProperty("vanId")
  private Integer vanId = null;

  @JsonProperty("originDescription")
  private String originDescription = null;

  public CreateRideRequest origin(Integer origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public Integer getOrigin() {
    return origin;
  }

  public void setOrigin(Integer origin) {
    this.origin = origin;
  }

  public CreateRideRequest destination(Integer destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public Integer getDestination() {
    return destination;
  }

  public void setDestination(Integer destination) {
    this.destination = destination;
  }

  public CreateRideRequest departureTimes(List<OffsetDateTime> departureTimes) {
    this.departureTimes = departureTimes;
    return this;
  }

  public CreateRideRequest addDepartureTimesItem(OffsetDateTime departureTimesItem) {
    if (this.departureTimes == null) {
      this.departureTimes = new ArrayList<OffsetDateTime>();
    }
    this.departureTimes.add(departureTimesItem);
    return this;
  }

  /**
   * Get departureTimes
   * @return departureTimes
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OffsetDateTime> getDepartureTimes() {
    return departureTimes;
  }

  public void setDepartureTimes(List<OffsetDateTime> departureTimes) {
    this.departureTimes = departureTimes;
  }

  public CreateRideRequest vacancies(Integer vacancies) {
    this.vacancies = vacancies;
    return this;
  }

  /**
   * Get vacancies
   * @return vacancies
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public Integer getVacancies() {
    return vacancies;
  }

  public void setVacancies(Integer vacancies) {
    this.vacancies = vacancies;
  }

  public CreateRideRequest food(Boolean food) {
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

  public CreateRideRequest drink(Boolean drink) {
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

  public CreateRideRequest animal(Boolean animal) {
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

  public CreateRideRequest bag(Boolean bag) {
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

  public CreateRideRequest vanId(Integer vanId) {
    this.vanId = vanId;
    return this;
  }

  /**
   * Get vanId
   * @return vanId
  **/
  @ApiModelProperty(value = "")

  public Integer getVanId() {
    return vanId;
  }

  public void setVanId(Integer vanId) {
    this.vanId = vanId;
  }

  public CreateRideRequest originDescription(String originDescription) {
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
    CreateRideRequest createRideRequest = (CreateRideRequest) o;
    return Objects.equals(this.origin, createRideRequest.origin) &&
        Objects.equals(this.destination, createRideRequest.destination) &&
        Objects.equals(this.departureTimes, createRideRequest.departureTimes) &&
        Objects.equals(this.vacancies, createRideRequest.vacancies) &&
        Objects.equals(this.food, createRideRequest.food) &&
        Objects.equals(this.drink, createRideRequest.drink) &&
        Objects.equals(this.animal, createRideRequest.animal) &&
        Objects.equals(this.bag, createRideRequest.bag) &&
        Objects.equals(this.vanId, createRideRequest.vanId) &&
        Objects.equals(this.originDescription, createRideRequest.originDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origin, destination, departureTimes, vacancies, food, drink, animal, bag, vanId, originDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRideRequest {\n");
    
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    departureTimes: ").append(toIndentedString(departureTimes)).append("\n");
    sb.append("    vacancies: ").append(toIndentedString(vacancies)).append("\n");
    sb.append("    food: ").append(toIndentedString(food)).append("\n");
    sb.append("    drink: ").append(toIndentedString(drink)).append("\n");
    sb.append("    animal: ").append(toIndentedString(animal)).append("\n");
    sb.append("    bag: ").append(toIndentedString(bag)).append("\n");
    sb.append("    vanId: ").append(toIndentedString(vanId)).append("\n");
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
