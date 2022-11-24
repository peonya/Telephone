package Telephone;

public interface EmailService {

    default void emailService() {
        System.out.println("Получает и отправляет эл.почту");
    }

}
