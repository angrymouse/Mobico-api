package br.com.mobico.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DetailedRideResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-04T19:31:55.305Z[GMT]")
public class DetailedRideResponse   {
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

  @JsonProperty("passengers")
  @Valid
  private List<ProfileResponse> passengers = null;

  @JsonProperty("originDescription")
  private String originDescription = null;

  public DetailedRideResponse id(Integer id) {
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

  public DetailedRideResponse origin(Locality origin) {
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

  public DetailedRideResponse destination(Locality destination) {
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

  public DetailedRideResponse departureTime(OffsetDateTime departureTime) {
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

  public DetailedRideResponse van(VanResponse van) {
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

  public DetailedRideResponse vacancies(Integer vacancies) {
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

  public DetailedRideResponse food(Boolean food) {
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

  public DetailedRideResponse drink(Boolean drink) {
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

  public DetailedRideResponse animal(Boolean animal) {
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

  public DetailedRideResponse bag(Boolean bag) {
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

  public DetailedRideResponse passengers(List<ProfileResponse> passengers) {
    this.passengers = passengers;
    return this;
  }

  public DetailedRideResponse addPassengersItem(ProfileResponse passengersItem) {
    if (this.passengers == null) {
      this.passengers = new ArrayList<ProfileResponse>();
    }
    this.passengers.add(passengersItem);
    return this;
  }

  /**
   * Get passengers
   * @return passengers
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ProfileResponse> getPassengers() {
    return passengers;
  }

  public void setPassengers(List<ProfileResponse> passengers) {
    this.passengers = passengers;
  }

  public DetailedRideResponse originDescription(String originDescription) {
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
    DetailedRideResponse detailedRideResponse = (DetailedRideResponse) o;
    return Objects.equals(this.id, detailedRideResponse.id) &&
        Objects.equals(this.origin, detailedRideResponse.origin) &&
        Objects.equals(this.destination, detailedRideResponse.destination) &&
        Objects.equals(this.departureTime, detailedRideResponse.departureTime) &&
        Objects.equals(this.van, detailedRideResponse.van) &&
        Objects.equals(this.vacancies, detailedRideResponse.vacancies) &&
        Objects.equals(this.food, detailedRideResponse.food) &&
        Objects.equals(this.drink, detailedRideResponse.drink) &&
        Objects.equals(this.animal, detailedRideResponse.animal) &&
        Objects.equals(this.bag, detailedRideResponse.bag) &&
        Objects.equals(this.passengers, detailedRideResponse.passengers) &&
        Objects.equals(this.originDescription, detailedRideResponse.originDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, origin, destination, departureTime, van, vacancies, food, drink, animal, bag, passengers, originDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedRideResponse {\n");
    
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
    sb.append("    passengers: ").append(toIndentedString(passengers)).append("\n");
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
