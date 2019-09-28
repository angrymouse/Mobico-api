package br.com.mobico.dto;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProfileResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-06T00:04:53.742Z[GMT]")
public class ProfileResponse {
	@JsonProperty("id")
	private Integer id = null;

	@JsonProperty("rg")
	private String rg = null;

	@JsonProperty("phone")
	private String phone = null;

	@JsonProperty("lastName")
	private String lastName = null;

	@JsonProperty("firstName")
	private String firstName = null;

	@JsonProperty("dateOfBirth")
	private LocalDate dateOfBirth = null;

	@JsonProperty("cpf")
	private String cpf = null;

	@JsonProperty("cnh")
	private String cnh = null;

	public ProfileResponse id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "")

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProfileResponse rg(String rg) {
		this.rg = rg;
		return this;
	}

	/**
	 * Get rg
	 * 
	 * @return rg
	 **/
	@ApiModelProperty(value = "")

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public ProfileResponse phone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * Get phone
	 * 
	 * @return phone
	 **/
	@ApiModelProperty(value = "")

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ProfileResponse lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * Get lastName
	 * 
	 * @return lastName
	 **/
	@ApiModelProperty(value = "")

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ProfileResponse firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Get firstName
	 * 
	 * @return firstName
	 **/
	@ApiModelProperty(value = "")

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public ProfileResponse dateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	/**
	 * Get dateOfBirth
	 * 
	 * @return dateOfBirth
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public ProfileResponse cpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	/**
	 * Get cpf
	 * 
	 * @return cpf
	 **/
	@ApiModelProperty(value = "")

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ProfileResponse cnh(String cnh) {
		this.cnh = cnh;
		return this;
	}

	/**
	 * Get cnh
	 * 
	 * @return cnh
	 **/
	@ApiModelProperty(value = "")

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProfileResponse profileResponse = (ProfileResponse) o;
		return Objects.equals(this.id, profileResponse.id) && Objects.equals(this.rg, profileResponse.rg)
				&& Objects.equals(this.phone, profileResponse.phone)
				&& Objects.equals(this.lastName, profileResponse.lastName)
				&& Objects.equals(this.firstName, profileResponse.firstName)
				&& Objects.equals(this.dateOfBirth, profileResponse.dateOfBirth)
				&& Objects.equals(this.cpf, profileResponse.cpf) && Objects.equals(this.cnh, profileResponse.cnh);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, rg, phone, lastName, firstName, dateOfBirth, cpf, cnh);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProfileResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    rg: ").append(toIndentedString(rg)).append("\n");
		sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
		sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
		sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
		sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
		sb.append("    cnh: ").append(toIndentedString(cnh)).append("\n");
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
