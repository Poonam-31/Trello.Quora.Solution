package com.upgrad.quora.api.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * UserDeleteResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-10T19:41:43.029+05:30")

public class UserDeleteResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("status")
  private String status = null;

  public UserDeleteResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * uuid of the deleted user
   * @return id
  **/
  @ApiModelProperty(required = true, value = "uuid of the deleted user")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserDeleteResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * message showing status of the deleted user
   * @return status
  **/
  @ApiModelProperty(required = true, value = "message showing status of the deleted user")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDeleteResponse userDeleteResponse = (UserDeleteResponse) o;
    return Objects.equals(this.id, userDeleteResponse.id) &&
        Objects.equals(this.status, userDeleteResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDeleteResponse {\n");   
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

