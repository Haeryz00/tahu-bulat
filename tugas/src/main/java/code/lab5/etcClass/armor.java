package code.lab5.etcClass;

public class Armor implements destroyable {
    private int strength;

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Armor(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        strength -= 5;
        setStrength(strength);
        getArmorInfo();
    }
    

    public void getArmorInfo(){
        System.out.println("Armor strength: " + getStrength() + "%");
    }
    

}
