public class ParameterInvalidException  extends Exception{

    public ParameterInvalidException(String msg){
        super(msg);
    }

    public ParameterInvalidException (String msg, Throwable throwable){
        super(msg, throwable);
    }
}
