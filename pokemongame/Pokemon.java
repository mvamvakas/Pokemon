/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import java.util.Objects;

/**
 *
 * @author Michael Vamvakas
 */
public class Pokemon {

    private String name;
    private String nickName;
    private String type1;
    private String type2;
    private Move slotA;
    private Move slotB;
    private Move slotC;
    private Move slotD;
    private int level;
    private int hp;
    private int attack;
    private int spAttack;
    private int defense;
    private int spDefense;
    private int speed;

    /**
     * Function: Constructor
     *
     * @param name name of the pokemon
     * @param nickName the nickName of the pokemon
     * @param type1 the primary type
     * @param type2 the secondary type
     * @param slotA
     * @param slotB
     * @param slotC
     * @param slotD
     * @param level
     * @param hp the max health
     * @param attack the attack stat of the pokemon
     * @param spAttack the special attack stat of the pokemon
     * @param defense the defense stat of the pokemon
     * @param spDefense the special Defense stat of the pokemon
     * @param speed the speed stat of the pokemon
     * @throws pokemongame.IncorrectInputException
     */
    public Pokemon(String name, String nickName, String type1, String type2, Move slotA, Move slotB, Move slotC, Move slotD, int level, int hp, int attack, int spAttack, int defense, int spDefense, int speed) throws IncorrectInputException {
        if (name.equals("")) {
            throw new IncorrectInputException();
        }
        this.name = name;
        if (nickName.equals("")) {
            throw new IncorrectInputException();
        }
        this.nickName = nickName;
        if (type1.equals("")) {
            throw new IncorrectInputException();
        }
        this.type1 = type1;
        if (type2.equals("")) {
            throw new IncorrectInputException();
        }
        this.type2 = type2;
        this.slotA = slotA;
        this.slotB = slotB;
        this.slotC = slotC;
        this.slotD = slotD;
        if (level < 0 || level > 100) {
            throw new IncorrectInputException();
        }
        this.level = level;
        if (hp < 1) {
            throw new IncorrectInputException();
        }
        this.hp = hp;
        if (attack < 1) {
            throw new IncorrectInputException();
        }
        this.attack = attack;
        if (spAttack < 1) {
            throw new IncorrectInputException();
        }
        this.spAttack = spAttack;
        if (defense < 1) {
            throw new IncorrectInputException();
        }
        this.defense = defense;
        if (spDefense < 1) {
            throw new IncorrectInputException();
        }
        this.spDefense = spDefense;
        if (speed < 1) {
            throw new IncorrectInputException();
        }
        this.speed = speed;
    }

    /**
     * Function: Constructor
     */
    public Pokemon() {
        name = "";
        nickName = "";
        type1 = "";
        type2 = "";
        hp = 0;
        attack = 0;
        spAttack = 0;
        defense = 0;
        spDefense = 0;
        speed = 0;
    }

    /**
     * Function returns the pokemon's name
     *
     * @return
     */
    public String getPokemonName() {
        return name;
    }

    /**
     * Function: returns the pokemon's nickname
     *
     * @return
     */
    public String getPokemonNickname() {
        return nickName;
    }

    /**
     * Function: returns the primary type of the pokemon
     *
     * @return
     */
    public String getType1() {
        return type1;
    }

    /**
     * Function: returns the secondary type of the pokemon
     *
     * @return
     */
    public String getType2() {
        return type2;
    }

    /**
     * Function: Returns slotA
     *
     * @return
     */
    public Move getSlotA() {
        return slotA;
    }

    /**
     * Function: Returns slotB
     *
     * @return
     */
    public Move getSlotB() {
        return slotB;
    }

    /**
     * Function: Returns slotC
     *
     * @return
     */
    public Move getSlotC() {
        return slotC;
    }

    /**
     * Function: Returns slotD
     *
     * @return
     */
    public Move getSlotD() {
        return slotD;
    }

    /**
     * Function: Returns level
     *
     * @return
     */
    public int getLevel() {
        return level;
    }

    /**
     * Function: Returns the max health of the pokemon
     *
     * @return
     */
    public int getHP() {
        return hp;
    }

    /**
     * Function: Returns the attack stat of the pokemon
     *
     * @return
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Function: Returns the special attack stat of the pokemon
     *
     * @return
     */
    public int getSPAttack() {
        return spAttack;
    }

    /**
     * Function: Returns the defense stat of the pokemon
     *
     * @return
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Function: Returns the special defense stat of the pokemon
     *
     * @return
     */
    public int getSPDefense() {
        return spDefense;
    }

    /**
     * Function: Returns the speed stat of the pokemon
     *
     * @return
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Function: Changes the name of the pokemon
     *
     * @param name
     * @throws pokemongame.IncorrectInputException
     */
    public void changeName(String name) throws IncorrectInputException {
        if (name.equals("")) {
            throw new IncorrectInputException();
        }
        this.name = name;
    }

    /**
     * Function: Changes the nickname of the pokemon
     *
     * @param nickName
     * @throws pokemongame.IncorrectInputException
     */
    public void changeNickname(String nickName) throws IncorrectInputException {
        if (nickName.equals("")) {
            throw new IncorrectInputException();
        }
        this.nickName = nickName;
    }

    /**
     * Function: Changes the primary type of the pokemon
     *
     * @param type1
     * @throws pokemongame.IncorrectInputException
     */
    public void changeType1(String type1) throws IncorrectInputException {
        if (type1.equals("")) {
            throw new IncorrectInputException();
        }
        this.type1 = type1;
    }

    /**
     * Function: Changes the secondary type of the pokemon
     *
     * @param type2
     * @throws pokemongame.IncorrectInputException
     */
    public void changeType2(String type2) throws IncorrectInputException {
        if (type2.equals("")) {
            throw new IncorrectInputException();
        }
        this.type2 = type2;
    }

    /**
     * Function: Changes the attack stat of the pokemon
     *
     * @param attack
     * @throws pokemongame.IncorrectInputException
     */
    public void changeAttack(int attack) throws IncorrectInputException {
        if (attack < 0) {
            throw new IncorrectInputException();
        }
        this.attack = attack;
    }

    /**
     * Function: Changes the value in slotA
     * @param slotA 
     */
    public void changeSlotA(Move slotA){
        this.slotA = slotA;
    }
    
    /**
     * Function: Changes Value in slotB
     * @param slotB 
     */
    public void changeSlotB(Move slotB){
        this.slotA = slotB;
    }
    
    /**
     * Function: Changes value in slotC
     * @param slotC 
     */
    public void changeSlotC(Move slotC){
        this.slotA = slotC;
    }
    
    /**
     * Function: Changes the value in slotD
     * @param slotD 
     */
    public void changeSlotD(Move slotD){
        this.slotA = slotD;
    }
    
    /**
     * Function: Changes the special attack stat of the pokemon
     *
     * @param spAttack
     * @throws pokemongame.IncorrectInputException
     */
    public void changeSPAttack(int spAttack) throws IncorrectInputException {
        if (spAttack < 0) {
            throw new IncorrectInputException();
        }
        this.spAttack = spAttack;
    }

    /**
     * Function: Changes the defense stat of the pokemon
     *
     * @param defense
     * @throws pokemongame.IncorrectInputException
     */
    public void changeDefense(int defense) throws IncorrectInputException {
        if (defense < 0) {
            throw new IncorrectInputException();
        }
        this.defense = defense;
    }

    /**
     * Function: Changes the special defense stat of the pokemon
     *
     * @param spDefense
     * @throws pokemongame.IncorrectInputException
     */
    public void changeSPDefense(int spDefense) throws IncorrectInputException {
        if (spDefense < 0) {
            throw new IncorrectInputException();
        }
        this.spDefense = spDefense;
    }

    /**
     * Function: Changes the speed stat of the pokemon
     *
     * @param speed
     * @throws pokemongame.IncorrectInputException
     */
    public void changeSpeed(int speed) throws IncorrectInputException {
        if (speed < 0) {
            throw new IncorrectInputException();
        }
        this.speed = speed;
    }

    /**
     * Checks to see if an object passed in is equal to the pokemon
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!this.getClass().equals(o.getClass())) {
            return false;
        }

        Pokemon b = (Pokemon) o;
        if (!this.getPokemonName().equals(b.getPokemonName())) {
            return false;
        }
        if (!this.getPokemonNickname().equals(b.getPokemonNickname())) {
            return false;
        }
        if (!this.getType1().equals(b.getType1())) {
            return false;
        }
        if (!this.getType2().equals(b.getType2())) {
            return false;
        }
        if (this.getHP() != (b.getHP())) {
            return false;
        }
        if (this.getAttack() != (b.getAttack())) {
            return false;
        }
        if (this.getSPAttack() != (b.getSPAttack())) {
            return false;
        }
        if (this.getDefense() != (b.getDefense())) {
            return false;
        }
        if (this.getSPDefense() != (b.getSPDefense())) {
            return false;
        }
        if (this.getSpeed() != (b.getSpeed())) {
            return false;
        }
        return true;
    }

    @Override
    /**
     * Function: Gets the hashCode
     */
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        return hash;
    }

    /**
     * Creates a string of the object
     *
     * @return
     */
    @Override
    public String toString() {
        String str = "";
        str += "Pokemon: " + name + "\n";
        str += "Name: " + nickName + "\n";
        str += "Level: " + level + "\n";
        if (type2.equals("none")) {
            str += "Type: " + type1 + "\n";
        } else {
            str += "Type: " + type1 + " / " + type2 + "\n";
        }
        if (slotA.getName().equals("None") == false) {
            str += slotA.getName() + "\n";
        }
        if (slotB.getName().equals("None") == false) {
            str += slotB.getName() + "\n";
        }
        if (slotC.getName().equals("None") == false) {
            str += slotC.getName() + "\n";
        }
        if (slotD.getName().equals("None") == false) {
            str += slotD.getName() + "\n";
        }
        return str;
    }
    
    public String printAttacks(){
        String str = "";
        str += "1. " + slotA.getName() + "\n";
        str += "2. " + slotB.getName() + "\n";
        str += "3. " + slotC.getName() + "\n";
        str += "4. " + slotD.getName();
        
        return str;
    }
}
