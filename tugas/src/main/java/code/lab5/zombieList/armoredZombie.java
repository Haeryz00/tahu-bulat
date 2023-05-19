package code.lab5.zombieList;

import code.lab5.etcClass.armor;

public class armoredZombie {
  public int health;
  public armor armor;

  public armoredZombie(int health, armor armor){
    this.health = health;
    this.armor = armor;
  }

  

  public void destroyed() {
    System.out.println("Zombie armor mati");
  }

//   public void getzombieinfo() {
//     System.out.println("Health Armored Zombie: " + health);
//     System.out.println("Armor strenght: " + armor);
//     if () {

//     }

//   }
}
