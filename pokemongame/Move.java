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
public final class Move {
    private String name;
    private String type;
    private String category;
    private int power;
    private int accuracy;
    private int pp;
    private String description;
    
    /**
     * Function: The constructor
     * @param name
     * @param type
     * @param category
     * @param power
     * @param accuracy
     * @param pp
     * @param description
     * @throws IncorrectInputException 
     */
    public Move(String name, String type, String category, int power, int accuracy, int pp, String description) throws IncorrectInputException{
        if (name.equals("")){
            throw new IncorrectInputException();
        }
        this.name = name;
        if (type.equals("")){
            throw new IncorrectInputException();
        }
        this.type = type;
        if (category.equals("")){
            throw new IncorrectInputException();
        }
        this.category = category;
        if (power < 0){
            throw new IncorrectInputException();
        }
        this.power = power;
        if (accuracy < 0){
            throw new IncorrectInputException();
        }
        this.accuracy = accuracy;
        if (pp < 0){
            throw new IncorrectInputException();
        }
        this.pp = pp;
        if (description.equals("")){
            throw new IncorrectInputException();
        }
        this.description = description;
    }
    /**
     * Function: returns the name of the move;
     * @return 
     */
    public String getName(){
        return name;
    }
    /**
     * Function: returns the type of the move
     * @return 
     */
    public String getType(){
        return type;
    }
    /**
     * Function: returns the category of the move
     * @return 
     */
    public String getCategory(){
        return category;
    }
    /**
     * Function: returns the power of the move
     * @return 
     */
    public int getPower(){
        return power;
    }
    /**
     * Function: returns the accuracy of the move
     * @return 
     */
    public int getAccuracy(){
        return accuracy;
    }
    /**
     * Function: returns the PP of the move
     * @return 
     */
    public int getPP(){
        return pp;
    }
    
    /**
     * Function: Gets the description
     * @return 
     */
    public String getDescription(){
        return description;
    }
}
