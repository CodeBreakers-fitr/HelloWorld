import OOP.Jaba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] countries = new String[]{"Arizona", "Colorado"};
        Jaba cricketToad = new Jaba("Kirill", 3.14, countries, false, "Water", 40.11, 10);
        cricketToad.getInfo();

        cricketToad.calculatePrice(3.55);
        cricketToad.setName("Masha");
        System.out.println("Your toad's new name is " + cricketToad.getName());

        System.out.println("Do you want to see a jaba?");
        Scanner scanner = new Scanner(System.in);
        String userEnteredAnswer = scanner.nextLine();
        if (userEnteredAnswer.equalsIgnoreCase("yes")) {
            Jaba.showJaba();
        } else {
            System.out.println("I'm upset that you don't want to see the jaba");
        }
    }
}
