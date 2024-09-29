import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1\nHello:) \nMy name is Olga Telyuk, I work as a manual QA\n");

        //task 2
        byte byteExample = 127;
        short shortExample = 32767;
        int intExample = 2147483647;
        long longExample = 1;
        float floatExample = 3.14f;
        double doubleExample = 3.141592653589793;
        boolean booleanExample = true;
        char charExample = '\u0041';
        System.out.println ("Task 2\nThis is byte:" + byteExample + "\nthis is short:" + shortExample + "\nthis is int:"
                + intExample + "\nthis is long:" + longExample + "\nthis is float:" + floatExample + "\nthis is double:"
                + doubleExample + "\nthis is boolean:" +  booleanExample + "\nthis is char:" + charExample + "\n");

        //task 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 3\nEnter an arbitrary string:");
        String userEnteredString = scanner.nextLine();
        //measuring the length of a string
        System.out.println("The length of the entered string = " + userEnteredString.length());
        //checking for an empty string
        System.out.println("Is it true that you entered an empty string? - " + userEnteredString.isEmpty());
        //the output of the symbol under the number
        System.out.println("The second character you entered is " + userEnteredString.charAt(1));
        //string comparison
        String systemString = "12345";
        System.out.println("Is it true that you entered 12345? - " + userEnteredString.equals(systemString));
        //startsWith,endsWith,contains
        System.out.println("Is it true that you entered the first word \"Hello\"? - "
                + userEnteredString.startsWith("Hello"));
        System.out.println("Is it true that your last word entered is \"bye\"? - " + userEnteredString.endsWith("bye"));
        System.out.println("Is it true that your sentence contains the word \"my name is\"?? - "
                + userEnteredString.contains("my name is"));
        //replace symbols
        String updateuserEnteredString = userEnteredString.replace('a', 'A');
        System.out.println("I replaced the lowercase letters \"a\" with uppercase \"A\", now your string looks like this: "
                + updateuserEnteredString);
        //lowercase symbols
        String lowerCaseUserEnteredString = userEnteredString.toLowerCase();
        System.out.println("Do you believe in magic? Now all your uppercase letters will become lowercase: "
                + lowerCaseUserEnteredString);
        //work with String.format
        System.out.println("Okay, now I need to work with the method string.format therefore, I will output a couple" +
                "of sentences");
        System.out.printf("The largest number that we can output in a byte is: %d,"
                + "the value of Pi is equal is %f," + " the first letter in the alphabet is %c",byteExample,
                doubleExample,charExample);
        //buffer
        StringBuffer buffer = new StringBuffer("\nToday I decided to defrost the refrigerator and do household chores");
        buffer.append("\nAnd then do your homework");
        buffer.append("\nIt was a bad idea....");
        System.out.println(buffer);
    }
}