package code.lab5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import code.lab5.zombieList.walkingZombie;
import code.lab5.etcClass.*;
import code.lab5.zombieList.armoredZombie;
import code.lab5.etcClass.Armor;

public class App extends Application {
    private walkingZombie walkerZombie;
    private armoredZombie armzom;
    private plant plantae;
    private Armor Arm;
    private int armoredZombieArmorStrength = 100;
    private int armoredZombieHealth = 100;
    private Label walkerZombieHealthLabel;
    private Label armoredZombieArmorLabel;
    private Label armoredZombieHealthLabel;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Zombie Game");

        walkerZombie = new walkingZombie(100);
        plantae = new plant();
        Arm = new Armor(50);
        armzom = new armoredZombie(100, Arm);

        // Walker Zombie health label
        Label walkerZombieLabel = new Label("Walker Zombie");
        walkerZombieHealthLabel = new Label("Health: " + walkerZombie.getHealth() + "%");

        // Armored Zombie armor and health labels
        Label armoredZombieLabel = new Label("Armored Zombie");
        armoredZombieArmorLabel = new Label("Armor Strength: " + Arm.getStrength() + "%");
        armoredZombieHealthLabel = new Label("Health: " + armzom.getHealth() + "%");

        // Attack buttons
        Button attackWalkerZombieButton = new Button("Attack Walker Zombie");
        attackWalkerZombieButton.setOnAction(e -> attackWalkerZombie());

        Button attackArmoredZombieButton = new Button("Attack Armored Zombie");
        attackArmoredZombieButton.setOnAction(e -> attackArmoredZombie());

        // Create layout
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(
                walkerZombieLabel,
                walkerZombieHealthLabel,
                attackWalkerZombieButton,
                armoredZombieLabel,
                armoredZombieArmorLabel,
                armoredZombieHealthLabel,
                attackArmoredZombieButton);

        Scene scene = new Scene(vbox, 300, 250);
        scene.getStylesheets().add("style.css"); // Add CSS style sheet
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void attackWalkerZombie() {
        plantae.attack(walkerZombie);
        walkerZombieHealthLabel.setText("Health: " + walkerZombie.getHealth() + "%");
    }

    private void attackArmoredZombie() {
        plantae.attack(armzom);
        armzom.destroyed();
        int updatedArmorStrength = armzom.getArmor().getStrength();
        armoredZombieArmorLabel.setText("Armor Strength: " + updatedArmorStrength + "%");
        armoredZombieHealthLabel.setText("Health: " + armzom.getHealth() + "%");
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void setRoot(String string) {
    }
}
