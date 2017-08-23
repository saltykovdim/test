import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Logger;
import java.util.Properties;

public class MyNowDate {
    private static Logger log = Logger.getLogger(MyNowDate.class.getName());

    private String getMessage (String mes){
        String message = null;
        final String PATH_TO_PROPERTIES = "src/main/resources/config.properties";
        FileInputStream fileInputStream = null;
        Properties prop = new Properties();

        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);
            message = prop.getProperty(mes);

        }catch (IOException e) {
            System.out.println("Ошибка в программе: файл " + PATH_TO_PROPERTIES + " не обнаружено");
            log.info("The method getMessage worked with an error");
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                log.info("FileInputStream close with error.");
            }
        }

        return message;
    }

    public int checkHours(){

        Date date = new Date();

        int res = date.getHours();

        log.info("method checkHours return date: " + date);

        return res ;
    }

    public String printString (int num){

        String result = null;

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
