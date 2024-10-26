import oop.Jaba;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //чтение файла
        File file = new File("D:\\AQA\\pypsik\\HelloWorld1\\ILoveJaba.txt");
        if (file.length() == 0){ System.out.println("There are no objects in your file. " +
                "therefore, we will create a jaba for the first time");}
        else {
            System.out.println("\nDo you want to see information about a previously created jaba?");
            String UserAnswer = scanner.nextLine();
            if (UserAnswer.equalsIgnoreCase("yes")) {
                try {
                    WorkWithFile.readFromFile();
                } catch (FileNotFoundException e) {
                    System.out.println("\nSorry, no such file");
                }

            }
        }

        //консольный ввод
        System.out.println("Now we're going to create a jaba, it's going to be a long process," +
                " so get ready\nThe code does not know how to process incorrect data, so if you enter " +
                "something wrong, everything will break\n");
        System.out.println("Enter her name:");                  //ввод имени
        String userInputName = scanner.nextLine();

        System.out.println("\nNice name:) \nUse \",\" if you want to enter a floating point number. " +
                "Now enter its cost:");                          //ввод стоимости
        double userInputPrice = scanner.nextDouble();

        // Определяем количество стран
        System.out.print("\nEnter the number of countries where your " + userInputName + " lives:");
        int numberOfCountries = scanner.nextInt();
        scanner.nextLine();
        String[] userInputCountries = new String[numberOfCountries];

        //цикл для ввода любого кол-во стран
        for (int i = 0; i < numberOfCountries; i++) {
            System.out.print("Enter the name of the country where your java is located. #" + (i + 1) + ": ");
            userInputCountries[i] = scanner.nextLine();
        }

        //ввод инфы о ядовитости
        System.out.println("\nIs it poisonous? Please enter true or false ");
        boolean userInputIsPoison = scanner.nextBoolean();
        scanner.nextLine();

        //ввод типа террариума
        System.out.println("\nWhat type of terrarium can it live in? ");
        String userInputTypeOfTerrarium = scanner.nextLine();

        //ввод длины
        System.out.println("\nWhat is the usual length of the " + userInputName + "? " +
                "\nUse \",\" if you want to enter a floating point number");
        double userInputLength = scanner.nextDouble();

        //ввод продолжительности жизни
        System.out.println("\nHow long do they usually live? ");
        int userInputLifeExpectancy = scanner.nextInt();

        //ввод информации о наличии хвоста
        System.out.println("\nDoes your" + userInputName + " have a tail? Please enter true or false" +
                " \nHint: immature jabs have a tail, but if your jaba is an adult, it won't" );
        boolean userInputHasTail = scanner.nextBoolean();

        //ввод кол-во глаз
        System.out.println("\nHow many eyes does your creature have? Hint: 2");
        int userInputNumberOfEyes = scanner.nextInt();

        //ввод инфы о анабозе
        System.out.println("\nDoes your individual have anabiosis? Please enter true or false ");
        boolean userInputIsHaveAnabiosis = scanner.nextBoolean();
        scanner.nextLine();

        //ввод образа жизни
        System.out.println("\nWhat kind of lifestyle does your monster lead?");
        String userInputLifestyle = scanner.nextLine();

        //ввод инфы о канибализме
        System.out.println("\nPhew, and the last scary question. Does it eat its own kind? " +
                "Please enter true or false");
        boolean UserInputIsCannibal = scanner.nextBoolean();

        //создание жабы в конструкторе
        Jaba userInputJaba = new Jaba(userInputName, userInputPrice, userInputCountries, userInputIsPoison,
                userInputTypeOfTerrarium, userInputLength, userInputLifeExpectancy, userInputHasTail,
                userInputNumberOfEyes, userInputIsHaveAnabiosis, userInputLifestyle, UserInputIsCannibal);

        //сохранение жабы в файл
        try {
            FileWriter file2 = new FileWriter("D:\\AQA\\pypsik\\HelloWorld1\\ILoveJaba.txt",
                    false);
            file2.write("Name: " + userInputName);
            file2.write("\nprice: " + userInputPrice);
            file2.write("\ncountries: " + Arrays.toString(userInputCountries));
            file2.write("\npoison? : " + userInputIsPoison);
            file2.write("\ntype of terrarium: " + userInputTypeOfTerrarium);
            file2.write("\nlength: " + userInputLength);
            file2.write("\nlife expectancy: " + userInputLifeExpectancy);
            file2.write("\nhas a tail?: " + userInputHasTail);
            file2.write("\nnumber of eyes: " + userInputNumberOfEyes);
            file2.write("\nhave anabiosis? : " + userInputIsHaveAnabiosis);
            file2.write("\nlifestyle: " + userInputLifestyle);
            file2.write("\nis cannibal? : " + UserInputIsCannibal);
            file2.write("\n======End of information about this object======");
            System.out.println("\nYour jaba has been successfully saved to a file ILoveJaba.txt!");
            file2.close();
        } catch (IOException e) {
            System.out.println("Sorry, cannot write to file. File error massage: " + e.getMessage());
        }

        System.out.println("\nNow let's see what kind of monster you've created.");
        userInputJaba.getInfo();

        //вывод инфы о созданной жабке
        System.out.println("\n\nYou can see the individual characteristics of your jaba" +
                " if you want. Enter what you want to see, or enter EXIT if you don't want to" +
                "\nAvailable options: name, price, listCountriesResidence, isPoison, length, " +
                "LifeExpectancy, TypeOfTerrarium, hasTail, \nnumberOfEyes, isHaveAnabiosis, " +
                "lifestyle, isCannibal");
        while (true) {
            String userEnteredAnswer = scanner.nextLine();
            if (userEnteredAnswer.equalsIgnoreCase("name")) {
                System.out.println(userInputJaba.getName());
            } else if (userEnteredAnswer.equalsIgnoreCase("price")) {
                System.out.println(userInputJaba.getPrice());
            } else if (userEnteredAnswer.equalsIgnoreCase("listCountriesResidence")) {
                System.out.println(Arrays.toString(userInputJaba.getListCountriesResidence()));
            } else if (userEnteredAnswer.equalsIgnoreCase("isPoison")) {
                System.out.println(userInputJaba.getIsPoison());
            } else if (userEnteredAnswer.equalsIgnoreCase("length")) {
                System.out.println(userInputJaba.characteristicsSpecies.getLength());
            } else if (userEnteredAnswer.equalsIgnoreCase("LifeExpectancy")) {
                System.out.println(userInputJaba.characteristicsSpecies.getLifeExpectancy());
            } else if (userEnteredAnswer.equalsIgnoreCase("TypeOfTerrarium")) {
                System.out.println(userInputJaba.characteristicsSpecies.getTypeOfTerrarium());
            } else if (userEnteredAnswer.equalsIgnoreCase("hasTail")) {
                System.out.println(userInputJaba.getHasTail());
            } else if(userEnteredAnswer.equalsIgnoreCase("numberOfEyes")) {
                System.out.println(userInputJaba.getNumberOfEyes());
            } else if(userEnteredAnswer.equalsIgnoreCase("isHaveAnabiosis")) {
                System.out.println(userInputJaba.getIsHaveAnabiosis());
            } else if(userEnteredAnswer.equalsIgnoreCase("lifestyle")) {
                System.out.println(userInputJaba.getLifestyle());
            } else if(userEnteredAnswer.equalsIgnoreCase("isCannibal")) {
                System.out.println(userInputJaba.getIsCannibal());
            } else if(userEnteredAnswer.equalsIgnoreCase("Exit")){
                break;}
        }
////        cricketToad.calculatePrice(3.55);
////        cricketToad.setName("Masha");
////        System.out.println("Your toad's new name is " + cricketToad.getName());
//
        System.out.println("Do you want to see a jaba?");
        String userEnteredAnswer = scanner.nextLine();
        if (userEnteredAnswer.equalsIgnoreCase("yes")) {
            Jaba.showJaba();
        } else {
            System.out.println("I'm upset that you don't want to see the jaba");
        }
    }
}
