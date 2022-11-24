package Telephone;

public class Main {

    public static void main(String args[]) {

        BasicMobile basicMobile = new BasicMobile("Базовая модель Nokia");

        SmartPhone mobile = new SmartPhone("iPhone 11");

        Landline landline = new Landline("Кнопочный стационарный телефон");

        landline.call();
        landline.leaveMessage();

        basicMobile.call();
        basicMobile.internetUse();
        basicMobile.leaveMessage();

        mobile.call();
        mobile.internetUse();
        mobile.leaveMessage();
        mobile.emailService();

    }
}
