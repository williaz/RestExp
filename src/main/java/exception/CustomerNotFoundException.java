package exception;

/**
 * Created by williaz on 10/14/16.
 */
public class CustomerNotFoundException extends RuntimeException{

    private long customId;

    public CustomerNotFoundException(long customId) {
        this.customId = customId;
    }

    public long getCustomId() {
        return customId;
    }

}
