package VKS_12.exception;

public class SqlQuestionNotFoundException extends RuntimeException{
    public SqlQuestionNotFoundException(String message) {
        super(message);
    }
}
