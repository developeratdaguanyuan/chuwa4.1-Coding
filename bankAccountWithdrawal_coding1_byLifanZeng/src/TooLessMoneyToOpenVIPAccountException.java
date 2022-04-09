public class TooLessMoneyToOpenVIPAccountException extends RuntimeException{
    private String msg;

    public TooLessMoneyToOpenVIPAccountException(){
        msg = "Exception(Too Less Money): To open a VIP account, the money should be more than $2000";
    }

    public String showMsg(){
        return msg;
    }
}
