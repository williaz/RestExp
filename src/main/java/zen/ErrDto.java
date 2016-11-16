package zen;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by williaz on 11/16/16.
 */
@XmlRootElement(name = "error")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("error")
public class ErrDto {
    private String notMatching;

    public ErrDto(String message) {
        this.notMatching = message;
    }

    public String getNotMatching() {
        return notMatching;
    }
}
