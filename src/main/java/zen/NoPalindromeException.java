package zen;

/**
 * Created by williaz on 11/16/16.
 */
public class NoPalindromeException extends RuntimeException {
    private String indexNoMatch;

    public NoPalindromeException(String indexNoMatch) {
        this.indexNoMatch = indexNoMatch;
    }

    public String getIndexNoMatch() {
        return indexNoMatch;
    }
}
