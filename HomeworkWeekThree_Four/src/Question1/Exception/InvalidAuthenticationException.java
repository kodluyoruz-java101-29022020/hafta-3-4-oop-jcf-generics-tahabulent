package Question1.Exception;

public class InvalidAuthenticationException extends  Exception {

    public InvalidAuthenticationException(String errorMessage){
        super(errorMessage);
    }

}
