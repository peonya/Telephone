package Telephone;

public interface CallService {
    default void call() {
        System.out.println(" Телефон получает и делает звонки");
    }
}
