import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //task 1
        System.out.println("Please enter your score: ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        while (score < 0 || score > 100){
            System.out.println("Please enter correct score");
            score  = scanner.nextInt();
        }
        if (score >= 90) {
            System.out.println("Your grade is A!");
        } else if (score >= 80) {
            System.out.println("Your grade is B!");
        } else if (score >= 70) {
            System.out.println("Your grade is C!");

        } else if (score >= 60) {
            System.out.println("Your grade is D!");

        } else if (score >= 50) {
            System.out.println("Your grade is E!");

        } else System.out.println("Your grade is F!");

        //task 2
        String userInput = "";
        while (true){
            System.out.println("Please enter something ");
            userInput = scanner.nextLine();
            System.out.println("You've entered:" + userInput);
            if (userInput.equalsIgnoreCase("Exit")){
                break;}
        }

        //task3
        System.out.println("Please enter a integer number: ");
        int x = scanner.nextInt();
        int sum = 0;
        if (x < 0) {
            for (int i = 0; i >= x; i--) {
                sum += i;
            }
        } else if (x > 0) {
            for (int i = 0; i <= x; i++) {
                sum += i;
            }
        } else System.out.println("Please enter correct number");
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);

        //task 4
        String[] channels = {"Discovery", "Belarus 1", "Sport", "National Geographic"};
        System.out.println("\nYou got to the control panel\nPlease enter the channel number: \n 0 - Exit, 1 - Discovery," +
                " 2 - Belarus 1, 3 - Sport, 4 - National Geographic");
        while (true) {
            int numberOfChannels = scanner.nextInt();
            if (numberOfChannels == 0) {
                break;
            }
            else if (numberOfChannels < 4) {
                System.out.println("\nYou have chosen a channel:" + channels[numberOfChannels - 1]);
            }
            else System.out.println("You entered the wrong channel, select something from 0 to 4");
        }
        System.out.println("Exiting the program.");
    }

}

