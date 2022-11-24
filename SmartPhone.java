package Telephone;

public class SmartPhone extends BasicMobile implements EmailService {

    public SmartPhone(String model) {
        super(model);
    }

    @Override
    public void emailService() {
        System.out.println(this.model + "Получает и отправляет эл.почту");
    }

}
