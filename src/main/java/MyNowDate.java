import java.util.Date;
import java.util.logging.Logger;

public class MyNowDate {

    private static Logger log = Logger.getLogger(MyNowDate.class.getName());


    public int checkHours(){

        log.info("method checkHours is OK");

        return new Date().getHours();
    }

    public String printString (int num){

        log.info("method printString is OK.");

        String result = null;

        if (num > 6 && num < 9){
            result = "Good morning, World!";
        }else if( num > 9 && num < 19){
            result = "Good day, World!";
        }else if (num > 19 && num < 23){
            result = "Good evening, World!";
        }else if (num > 23 && num < 6){
            result = "Good night, World!";
        }

        return result;
    }

}
