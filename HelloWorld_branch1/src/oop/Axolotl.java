package oop;

public class Axolotl extends Amphibia {
    private boolean isSmilingSweetly;
    private CharacteristicsSpecies characteristicsSpecies;
    private String scalesColor;

    public Axolotl( String typeOfTerrarium, double length, int lifeExpectancy, boolean hasTail, int numberOfEyes,
                    boolean isHaveAnabiosis, String lifestyle, boolean isCannibal, boolean isSmilingSweetly,
                    String scalesColor){
        this.characteristicsSpecies = new CharacteristicsSpecies(typeOfTerrarium, length, lifeExpectancy);
        this.hasTail = hasTail;
        this.numberOfEyes = numberOfEyes;
        this.isHaveAnabiosis = isHaveAnabiosis;
        this.lifestyle = lifestyle;
        this.isCannibal = isCannibal;
        this.isSmilingSweetly = isSmilingSweetly;
        this.scalesColor = scalesColor;

    }
    public void setIsSmilingSweetly(boolean isSmilingSweetly){
        this.isSmilingSweetly = isSmilingSweetly;
    }
    public void setCharacteristicsSpecies(String typeOfTerrarium, double length, int lifeExpectancy){
        this.characteristicsSpecies = new CharacteristicsSpecies(typeOfTerrarium, length, lifeExpectancy);
    }
    public void setScalesColor(String scalesColor){
        this.scalesColor = scalesColor;
    }
    public boolean getIsSmilingSweetly(){
        return isSmilingSweetly;
    }
    public String getScalesColor(){
        return  scalesColor;
    }
}
