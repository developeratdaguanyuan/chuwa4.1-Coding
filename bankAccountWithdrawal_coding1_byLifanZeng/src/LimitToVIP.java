public class LimitToVIP {
    public void limitation(int m) throws TooLessMoneyToOpenVIPAccountException{
        if(m < 2000){
            throw new TooLessMoneyToOpenVIPAccountException();
        }
    }
}
