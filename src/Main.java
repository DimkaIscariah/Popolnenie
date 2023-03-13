public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int bonus = 0;
        int p = 2900; //пополнение счёта

        if (p > 1000) {
            bonus = p / balance;
        } else if (p < 1000) {
            bonus = 0;

        }
        System.out.println(balance + p + bonus);
    }


    }