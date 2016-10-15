package dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by williaz on 10/14/16.
 */
@XmlRootElement(name = "error")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("error")
public class ErrorDto {
    private int code;
    private String message;
    public ErrorDto(int code, String message) {
        this.code = code;
        this.message = message;
    }
    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}
