public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 2900;

        if (payment > 1000) {
            int bonus = payment / 100;
            System.out.println(" Ваш счёт составляет " + (balance + payment) + " рублей и " + bonus + " бонусов");
        } else {
            System.out.println(" Ваш счёт составляет " + (balance + payment) + " рублей");

        }
    }

}


