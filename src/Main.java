public class Main {

    public static void main(String[] args ) {
        int initialAmount = 678;
        int add = 1300;

        int bonus;
        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }

            int finalAmount = initialAmount + add + bonus;
            System.out.println("Итоговый счет: " + finalAmount);
            System.out.println("Бонус: " + bonus);

    }
}