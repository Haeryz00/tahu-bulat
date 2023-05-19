package code.lab5.etcClass;

public class armor implements destroyable{
    public int strength;


    public armor(int strength) {
        this.strength = strength;
    }
    

    @Override
    public void destroyed() {
        System.out.println("Armor hancur");
    }


    public void getarmorinfo() {
        
    }


}
