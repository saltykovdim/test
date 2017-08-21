import java.util.Date;
import java.util.logging.Logger;

public class MyNowDate {

    private static Logger log = Logger.getLogger(MyNowDate.class.getName());

    private int chekHours (){

        log.info("method chekHours is OK");

        return new Date().getHours();
    }

    public void printString (){

        log.info("method printString is OK.");

        int res = chekHours();

        if (res > 6 && res < 9){
            System.out.println("Good morning, World!");
        }else if( res > 9 && res < 19){
            System.out.println("Good day, World!");
        }else if (res > 19 && res < 23){
            System.out.println("Good evening, World!");
        }else if (res > 23 && res < 6){
            System.out.println("Good night, World!");
        }

    }

}
