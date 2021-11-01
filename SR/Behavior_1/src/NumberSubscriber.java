import java.util.concurrent.Flow;
import java.util.regex.Pattern;

public class NumberSubscriber extends StringSubscriber{
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        // implement here
        subscription.request(Long.MAX_VALUE); // effectively unbounded

    }
    public void update(String text){
        if(containNum(text)){
            FileManager.writeInFile(text,"Number");
        }
    }
    public boolean containNum (String text){
        String regex = "(.)*(\\d)(.)*";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(text).matches();
    }
    @Override
    public void onNext(Object item) {
        // TODO Auto-generated method stub
        
    }

}