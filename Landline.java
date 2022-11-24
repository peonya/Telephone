package Telephone;

public class Landline extends Telephone implements CallService, LeaveMessage {

    public Landline(String model) {
        super(model);
    }

    @Override
    public void call() {
        System.out.println(this.model + " получает и делает звонки");
    }

    @Override
    public void leaveMessage() {
        System.out.println(this.model + " имеет только базовые настройки. Можно оставить 1 сообщение");

    }
}
