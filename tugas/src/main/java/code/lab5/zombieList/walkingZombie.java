package code.lab5.zombieList;

public class walkingZombie extends zombie{
    public int health;

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public walkingZombie(int health) {
        this.health = health;
    }



    @Override
    public void destroyed(){
        if(health == 0){
        System.out.println("Walking zombie mati");  
        }
    }


    public void getzombieinfo() {
        health -= getHealth()* 0.04;
        System.out.println("Health walking zombie: " + health);
    }
}
