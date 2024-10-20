package OOP;

public class CharacteristicsSpecies {
    private String typeOfTerrarium;
    private double length;
    private int lifeExpectancy;

    public CharacteristicsSpecies(String typeOfTerrarium, double length, int lifeExpectancy){
        this.typeOfTerrarium = typeOfTerrarium;
        this.length = length;
        this.lifeExpectancy = lifeExpectancy;
    }
    public String getTypeOfTerrarium(){
    return typeOfTerrarium; }

    public double getLength(){
        return length;
    }

    public  int getLifeExpectancy(){
        return lifeExpectancy;
    }
}