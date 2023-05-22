package code.lab5.etcClass;

public class Armor implements destroyable {
    public int strength;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        System.out.println("Armor hancur");
    }

    public int getArmorInfo() {
        if (strength > 0) {
            int damageToArmor = (int) (strength * 0.05);
            strength -= damageToArmor;

            // Ensure armor strength does not go below 0
            if (strength < 0) {
                strength = 0;
            }
        }
        return strength;
    }
    

}
