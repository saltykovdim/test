

public class Main {
    public static void main(String[] args) {

        MyNowDate s = new MyNowDate();

        String mes = s.printString(s.checkHours());

        System.out.println(mes);
    }
}
