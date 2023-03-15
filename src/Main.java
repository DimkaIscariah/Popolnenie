public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int popolnenie = 2900;

        if (popolnenie > 1000) {
            int bonus = popolnenie / 100;
            System.out.println(" Ваш счёт составляет " + (balance + popolnenie) + " рублей и " + bonus + " бонусов");
        } else {
                System.out.println(" Ваш счёт составляет " + (balance + popolnenie) + " рублей");

            }
        }

    }


