package zen;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by williaz on 11/16/16.
 */
@XmlRootElement(name = "word")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("word")
public class WordDto {
    private String palindromeWord;

    public WordDto(String word) {
        this.palindromeWord = word;
    }

    public String getPalindromeWord() {
        return palindromeWord;
    }
}
