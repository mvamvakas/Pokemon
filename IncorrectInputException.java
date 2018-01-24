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
public class IncorrectInputException extends Exception {
    /*
    Constructor for Exception
    */
    public IncorrectInputException() {
        super("Incorrect Informaton");
    }

    /*
    Constructor for Exception
    */
    public IncorrectInputException(String message) {
        super(message);
    }
}