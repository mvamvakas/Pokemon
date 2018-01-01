/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

/**
 *
 * @author Michael Vamvakas
 */
public class BattlePKM extends Pokemon {
    
    private String status;
    private int currentHP;
    
    /**
     * Function: Constructor with all parameters
     * @param name
     * @param nickName
     * @param type1
     * @param type2
     * @param slotA
     * @param slotB
     * @param slotC
     * @param slotD
     * @param level
     * @param hp
     * @param attack
     * @param spAttack
     * @param defense
     * @param spDefense
     * @param speed
     * @throws IncorrectInputException 
     */
    public BattlePKM(String name, String nickName, String type1, String type2, Move slotA, Move slotB, Move slotC, Move slotD, int level, int hp, int attack, int spAttack, int defense, int spDefense, int speed) throws IncorrectInputException {
        super (name, nickName, type1, type2, slotA, slotB, slotC, slotD, level, hp, attack, spAttack, defense, spDefense, speed);
        this.status = "None";
        this.currentHP = hp;
    }
    
    /**
     * Constructor with no Parameters
     */
    public BattlePKM(){
        super();
        this.status = "";
        this.currentHP = 0;
    }
    /**
     * Function: Returns the status of the pokemon
     * @return 
     */
    public String getStatus(){
        return status;
    }
    /**
     * Function: Returns the current hp of the pokemon
     * @return 
     */
    public int getCurrHP(){
        return currentHP;
    }
    /**
     * Function: Changes the status of the pokemon
     * @param status 
     */
    public void changeStatus(String status){
        this.status = status;
    }
    /**
     * Function: Changes the current HP of the pokemon
     * @param currentHP 
     */
    public void changeCurrHP(int currentHP){
        if (currentHP < 0){
            this.currentHP = 0;
        }
        else {
            this.currentHP = currentHP;
        }
    }
    
}
