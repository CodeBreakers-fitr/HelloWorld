package oop;

public class Amphibia extends Animals {
    protected boolean isHaveAnabiosis;
    protected String lifestyle;
    protected boolean isCannibal;

    public void setIsHaveAnabiosis(boolean isHaveAnabiosis){
        this.isHaveAnabiosis = isHaveAnabiosis;
    }

    public void setLifestyle (String lifestyle){
        this.lifestyle = lifestyle;
    }

    public void setIsCannibal (boolean isCannibal){
        this.isCannibal = isCannibal;
    }

    public  boolean getIsHaveAnabiosis(){
        return  isHaveAnabiosis;
    }

    public String getLifestyle(){
        return  lifestyle;
    }

    public boolean getIsCannibal(){
        return  isCannibal;
    }
}



