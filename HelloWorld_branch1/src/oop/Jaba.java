package oop;

import java.util.Arrays;

public class Jaba extends Amphibia {
    public CharacteristicsSpecies characteristicsSpecies;
    private String  name;
    private double price;
    private String[] listCountriesResidence;
    private boolean isPoison;

    //конструктор с наследованием
    public Jaba(String name, double price, String[] listCountriesResidence, boolean isPoison,
                String typeOfTerrarium, double length, int lifeExpectancy, boolean hasTail, int numberOfEyes,
                boolean isHaveAnabiosis, String lifestyle, boolean isCannibal ){
        this.name = name;
        this.price = price;
        this.listCountriesResidence = listCountriesResidence;
        this.isPoison = isPoison;
        this.characteristicsSpecies = new CharacteristicsSpecies(typeOfTerrarium, length, lifeExpectancy);
        this.hasTail = hasTail;
        this.numberOfEyes = numberOfEyes;
        this.isHaveAnabiosis = isHaveAnabiosis;
        this.lifestyle = lifestyle;
        this.isCannibal = isCannibal;
    }

    public Jaba(String name, double price, String[] listCountriesResidence, boolean isPoison,
                String typeOfTerrarium, double length, int lifeExpectancy){
        this.name = name;
        this.price = price;
        this.listCountriesResidence = listCountriesResidence;
        this.isPoison = isPoison;
        this.characteristicsSpecies = new CharacteristicsSpecies(typeOfTerrarium, length, lifeExpectancy);

    }

    public static void showJaba(){
        System.out.println("────▄▄──▄▀▀▄▀▀▄──▄▄───\n" +
                "───▐▒▒▀▐░██░██░▌▀▒▒▌──\n" +
                "────▀▄▒▒▀▀▀▀▀▀▀▒▒▄▀───\n" +
                "────▄▄▌▄▒▐▀▀▀▌▒▄▐▄▄───\n" +
                "───▐▄▄▐▄▄▌▀▀▀▐▄▄▌▄▄▌──\n");
    }

    public void getInfo(){
        System.out.printf("Your frog's name is: %s, its cost %f BYR, " +
                        "she lives in %s and is it poisonous? - %b, \nLength: %f\nLife expectancy: %d\n" +
                        "Type Of Terrarium: %s, \nIs there a tail? - %b, \nNumber of eyes: %d" +
                        "\nis there anabiosis? - %b, \nLifestyle: %s, \nIs he a cannibal? - %b", name, price,
                Arrays.toString(listCountriesResidence), isPoison, characteristicsSpecies.getLength(),
                characteristicsSpecies.getLifeExpectancy(), characteristicsSpecies.getTypeOfTerrarium(),
                hasTail, numberOfEyes, isHaveAnabiosis, lifestyle, isCannibal);
    }

    public void calculatePrice(double VAT){
        double finalAmount = price * VAT/100;
        System.out.println("\nThe final amount including VAT is equal to " + finalAmount );
    }

    public String getName(){

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setListCountriesResidence(String[] listCountriesResidence){
        this.listCountriesResidence = listCountriesResidence;
    }

    public String[] getListCountriesResidence(){
        return  listCountriesResidence;
    }

    public void setCharacteristicsSpecies(String typeOfTerrarium, double length, int lifeExpectancy){
        this.characteristicsSpecies = new CharacteristicsSpecies(typeOfTerrarium, length, lifeExpectancy);
    }

    public boolean getIsPoison(){
        return isPoison;
    }

    public void setIsPoison(boolean isPoison){
        this.isPoison = isPoison;
    }
}