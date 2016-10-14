package dto;

/**
 * Created by williaz on 10/14/16.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"customId", "customerType", "firstName", "lastName" })
@JsonRootName("customer")
@JsonPropertyOrder({"customId", "customerType", "firstName", "lastName"})
public class CustomerDto {

    @XmlElement(name = "id")
    @JsonProperty("id")
    private long customId;

    private String firstName;
    private String lastName;
    @XmlElement(name = "type")
    @JsonProperty("type")
    private String customerType;

    public long getCustomId() {
        return customId;
    }

    public void setCustomId(long customId) {
        this.customId = customId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
