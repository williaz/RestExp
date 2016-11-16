package zen;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Created by williaz on 11/16/16.
 */
@RestController
@RequestMapping(value = "/palindrome")
public class PalindromeChecker {
    @RequestMapping(value = "/{word}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public WordDto check(@PathVariable String word) {
        int[] output = isPalindrome(word);
        if (output[0] != -1) {
            throw new NoPalindromeException(Arrays.toString(output));
        }
        return new WordDto(word);

    }

    @ExceptionHandler(NoPalindromeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrDto NoPalindromeHandler(NoPalindromeException e) {
        return new ErrDto(e.getIndexNoMatch());
    }

    public static int[] isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        int[] output = new int[2];
        while (word.charAt(left) == word.charAt(right)) {
            if (left >= right) {
                output[0] = -1;
                output[1] = -1;
                return output;
            }
            left++;
            right--;

        }
        output[0] = left;
        output[1] = right;
        return output;
    }



}
