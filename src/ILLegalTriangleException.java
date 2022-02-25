public class ILLegalTriangleException extends Exception {
    private String message;

    public ILLegalTriangleException(){}
    public ILLegalTriangleException(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
