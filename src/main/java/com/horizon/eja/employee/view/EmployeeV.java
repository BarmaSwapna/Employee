package com.horizon.eja.employee.view;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "empName",
    "employeeId",
    "empAccount",
    "status"
})
public class EmployeeV {

    @JsonProperty("empName")
    private String empName;
    @JsonProperty("employeeId")
    private Integer employeeId;
    @JsonProperty("empAccount")
    private String empAccount;
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EmployeeV() {
    }

    /**
     * 
     * @param empName
     * @param empAccount
     * @param employeeId
     * @param status
     */
    public EmployeeV(String empName, Integer employeeId, String empAccount, String status) {
        super();
        this.empName = empName;
        this.employeeId = employeeId;
        this.empAccount = empAccount;
        this.status = status;
    }

    @JsonProperty("empName")
    public String getEmpName() {
        return empName;
    }

    @JsonProperty("empName")
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @JsonProperty("employeeId")
    public Integer getEmployeeId() {
        return employeeId;
    }

    @JsonProperty("employeeId")
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @JsonProperty("empAccount")
    public String getEmpAccount() {
        return empAccount;
    }

    @JsonProperty("empAccount")
    public void setEmpAccount(String empAccount) {
        this.empAccount = empAccount;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", employeeId=" + employeeId +
                ", empAccount='" + empAccount + '\'' +
                ", status='" + status + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
