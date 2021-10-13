package Lesson_8.BASIC_HW8.Task3;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Price[] prices = new Price[2];

        for (int i = 0; i < prices.length; i++) {
            prices[i] = new Price();
            prices[i].setProduct(scanner.next());
            prices[i].setMarket(scanner.next());
            prices[i].setCost(scanner.nextDouble());
        }

        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < i; j++) {
                if (prices[i].getMarket().compareTo(prices[j].getMarket()) < 0) {
                    Price tempPrice = prices[i];
                    prices[i] = prices[j];
                    prices[j] = tempPrice;
                }
            }
        }
        System.out.println();

        System.out.println("Весь список, отсортированный по алфавиту:");
        for (Price price : prices) {
            System.out.println(price);
        }
        System.out.println();

        boolean bool = false;
        while (!bool) {
            try {
                System.out.print("Введите название магазина: ");
                String market = scanner.next();
                int count = 0;
                for (Price price : prices) {
                    if (price.getMarket().equals(market)) {
                        if (count == 0) {
                            System.out.println("\nИнформация о товарах указанного магазина:");
                        }
                        System.out.println(price);
                        count++;
                    }
                }
                if (count == 0) {
                    throw new Exception();
                } else {
                    bool = true;
                }
            } catch (Exception e) {
                System.out.println("Список не содержит введенного магазина\n");
            }
        }
    }
}
