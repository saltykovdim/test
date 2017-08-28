import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class MyNowDate {
    private Logger log = Logger.getLogger(MyNowDate.class.getName());

    private String getMessage (String mes){

        Locale locale = Locale.getDefault();
        ResourceBundle resourceBundle = ResourceBundle.getBundle("config", locale);
        mes = resourceBundle.getString(mes);
log.info("method getMessage return mes: " + mes);

        return mes;
    }

    public int checkHours(){

        Date date = new Date();

        int res = date.getHours();

        log.info("method checkHours return date: " + date);

        return res ;
    }

    public String printString (int num){

        String result;

        if (num >= 6 && num <= 9){
            result = getMessage("mesMorning");
        }else if( num > 9 && num < 19){
            result = getMessage("mesDay");
        }else if (num >= 19 && num < 23){
            result = getMessage("mesEvening");
        }else {
            result = getMessage("mesNight");
        }
        log.info("method printString return the message: " + result);

        return result;
    }

}
