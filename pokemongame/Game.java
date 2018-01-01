/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Michael Vamvakas
 */
public class Game {

    HashMap<String, Move> moveMap;

    /**
     * Function, Constructor;
     */
    public Game() {
        this.moveMap = new HashMap<>();
    }

    /**
     * Function: Runs the game
     */
    public void run() {
        setMoveMap();
        Pokemon pokemon = new Pokemon();
        //BattlePKM pkm = new BattlePKM();
        try {
            pokemon = new Pokemon("Pikachu", "Pokebro", "Electric", "Steel", moveMap.get("Absorb"), moveMap.get("Acid"), moveMap.get("None"), moveMap.get("None"), 5, 50, 5, 5, 5, 5, 5);
          //  pkm = new BattlePKM("Pikachu", "Pokebro", "Electric", "Steel", moveMap.get("Absorb"), moveMap.get("Acid"), moveMap.get("None"), moveMap.get("None"), 5, 50, 5, 5, 5, 5, 5);
        } 
        catch (IncorrectInputException e) {
            System.out.println("Incorrect Input");
        }
        System.out.println(pokemon.toString());       
        
    }

    /**
     * Function: Sets up the hashmap with all the pokemon moves
     */
    public void setMoveMap() {
        try {
            moveMap.put("None", new Move("None", "None", "None", 0, 0, 0, "None"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Absorb not added");
        }
        try {
            moveMap.put("Absorb", new Move("Absorb", "Grass", "Special", 20, 100, 25, "Recover Half Damage"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Absorb not added");
        }
        try {
            moveMap.put("Acid", new Move("Acid", "Poison", "Special", 40, 100, 30, "May Lower Opponent SPDefense Regular"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Acid not added");
        }
        try {
            moveMap.put("Acid Armor", new Move("Acid Armor", "Poison", "Status", 0, 0, 20, "Always Raise User Attack Sharply"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Acid not added");
        }
        try {
            moveMap.put("Agility", new Move("Agility", "Normal", "Status", 0, 0, 30, "Always Raise User Speed Sharply"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Acid not added");
        }
        try {
            moveMap.put("Amnesia", new Move("Amnesia", "Psychic", "Status", 0, 0, 20, "Always Raise User SPDefense Sharply"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Acid not added");
        }
        try {
            moveMap.put("Aurora Beam", new Move("Aurora Beam", "Ice", "Special", 65, 100, 20, "May Lower Opponent Attack Regular"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Aurora Beam not added");
        }
        try {
            moveMap.put("Barrage", new Move("Barrage", "Normal", "Physical", 15, 85, 20, "Hits 2-5 Times"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Barrage not added");
        }
        try {
            moveMap.put("Barrier", new Move("Barrier", "Pyschic", "Status", 0, 0, 20, "Alwasy Raise User Defense Sharply"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Acid not added");
        }
        try {
            moveMap.put("Bind", new Move("Bind", "Normal", "Physical", 15, 85, 20, "Traps Opponent 4-5"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Bind not added");
        }
        try {
            moveMap.put("Bite", new Move("Bite", "Dark", "Physical", 6, 100, 25, "May Cause Flinching"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Absorb not added");
        }
        try {
            moveMap.put("Blizzard", new Move("Blizzard", "Ice", "Special", 110, 70, 5, "May Cause Freeze"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Blizzard not added");
        }
        try {
            moveMap.put("Body Slam", new Move("Body Slam", "Normal", "Physical", 85, 100, 15, "May Cause Paralyze"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Body Slam not added");
        }
        try {
            moveMap.put("Bone Club", new Move("Bone Club", "Ground", "Physical", 65, 85, 20, "May Cause Flinching"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Bone CLub not added");
        }
        try {
            moveMap.put("Bonemerang", new Move("Bonemerange", "Ground", "Physical", 50, 90, 10, "Hits 2 Times"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Bonemerang not added");
        }
        try {
            moveMap.put("Bubble", new Move("Bubble", "Water", "Special", 40, 100, 30, "May Lower Opponent Speed Regular"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Bubble not added");
        }
        try {
            moveMap.put("Bubble Beam", new Move("Bubble Beam", "Water", "Special", 65, 100, 20, "May Lower Opponent Speed Regular"));
        } 
        catch (IncorrectInputException e) {
            System.out.println("Bubble Beam not added");
        }
    }
}
