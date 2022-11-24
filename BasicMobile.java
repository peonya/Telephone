package Telephone;

public class BasicMobile extends Telephone implements CallService, LeaveMessage, InternetUse {

    public BasicMobile(String model) {
        super(model);
    }

    @Override
    public void call() {
        System.out.println(this.model + " получает и делает звонки");
    }

    @Override
    public void leaveMessage() {
        System.out.println(this.model + " имеет голосовую почту и все функции для работы с ней");

    }

    @Override
    public void internetUse() {
        System.out.println(this.model + " использует мобильные данных и Wi-fi");
    }
}
