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

        boolean bool = false;
        while (!bool) {
            try {
                String market = scanner.next();
                int count = 0;
                for (Price price : prices) {
                    if (price.getMarket().equals(market)) {
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
                System.out.println("Список не содержит введенного магазина!");
            }
        }
    }
}
