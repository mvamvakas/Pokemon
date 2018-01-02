/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import java.util.Random;

/**
 *
 * @author Michael Vamvakas
 */
public class Battle {

    private BattlePKM ally;
    private BattlePKM opponentPokemon;

    /**
     * Function: Constructor
     *
     * @param ally
     * @param opponentPokemon
     */
    public Battle(BattlePKM ally, BattlePKM opponentPokemon) {
        this.ally = ally;
        this.opponentPokemon = opponentPokemon;
    }

    /**
     * Function: runs the battle section until either one of the opposing
     * pokemon wins, returns true if you won and false if you lost
     *
     * @return
     */
    public boolean runBattle() {

        return false;
    }

    /**
     * Function, takes the ally pokemon and the opponent pokemon and calculates
     * the damage
     *
     * @param ally
     * @param opponent
     * @param attack
     * @return
     */
    private double calulateDamage(BattlePKM ally, BattlePKM opponent, Move attack) {
        double damage;
        damage = ((2 * ally.getLevel()) / 5) + 2;
        damage = damage * ally.getAttack() * attack.getPower();
        damage = damage / opponent.getDefense();
        damage = (damage / 50) + 2;
        if (attack.getType().equals(ally.getType1()) || attack.getType().equals(ally.getType2())) {
            damage = damage * 1.5;
        }
        /*
        Find weakness and resistant here
         */
        Random rand = new Random();
        int n = rand.nextInt(100) + 85;
        damage = damage * n;
        return damage;
    }

    /**
     * Function: This function applies the after effects of an attack
     *
     * @param user
     * @param opponent
     * @param move
     */
    private String moveEffects(BattlePKM user, BattlePKM opponent, Move move) {
        boolean attack = false;
        boolean spAttack = false;
        boolean defense = false;
        boolean spDefense = false;
        boolean speed = false;
        String[] keywords;
        keywords = move.getDescription().split(" ");
        if (keywords[0].equals("May")) {
            Random rand = new Random();
            int n = rand.nextInt(1);
            if (keywords[0].equals("Always")) {
                n = 1;
            }
            if (keywords[1].equals("Lower")) {
                if (keywords[2].equals("User")) {
                    switch (keywords[3]) {
                        case "Attack":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        user.changeAttack(user.getAttack() - 1);
                                        return user.getPokemonNickname() + "'s attack fell";
                                    } catch (IncorrectInputException e) {
                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        user.changeAttack(user.getAttack() - 2);
                                        return user.getPokemonNickname() + "'s attack sharply fell";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            user.changeAttack(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "Defense":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        user.changeDefense(user.getDefense() - 1);
                                        return user.getPokemonNickname() + "'s defense fell";
                                    } catch (IncorrectInputException e) {

                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        user.changeDefense(user.getDefense() - 2);
                                        return user.getPokemonNickname() + "'s defense sharply fell";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            user.changeDefense(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "SPDefense":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        user.changeSPDefense(user.getSPDefense() - 1);
                                        return user.getPokemonNickname() + "'s special defense fell";
                                    } catch (IncorrectInputException e) {

                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        user.changeSPDefense(user.getSPDefense() - 2);
                                        return user.getPokemonNickname() + "'s special defense sharply fell";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            user.changeSPDefense(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "SPAttack":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        user.changeSPAttack(user.getSPAttack() - 1);
                                        return user.getPokemonNickname() + "'s special attack fell";
                                    } catch (IncorrectInputException e) {
                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        user.changeSPAttack(user.getSPAttack() - 2);
                                        return user.getPokemonNickname() + "'s special attack sharply fell";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            user.changeSPAttack(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "Speed":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        user.changeSpeed(user.getSpeed() - 1);
                                        return user.getPokemonNickname() + "'s speed fell";
                                    } catch (IncorrectInputException e) {
                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        user.changeSpeed(user.getSpeed() - 2);
                                        return user.getPokemonNickname() + "'s speed sharply fell";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            user.changeSpeed(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            break;
                    }
                } else if (keywords[2].equals("Opponent")) {
                    switch (keywords[3]) {
                        case "Attack":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeAttack(opponent.getAttack() - 1);
                                        return opponent.getPokemonNickname() + "'s attack fell";
                                    } catch (IncorrectInputException e) {
                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeAttack(opponent.getAttack() - 2);
                                        return opponent.getPokemonNickname() + "'s attack sharply fell";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            opponent.changeAttack(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "Defense":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeDefense(opponent.getDefense() - 1);
                                        return opponent.getPokemonNickname() + "'s defense fell";
                                    } catch (IncorrectInputException e) {

                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeDefense(opponent.getDefense() - 2);
                                        return opponent.getPokemonNickname() + "'s defense sharply fell";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            opponent.changeDefense(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "SPDefense":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeSPDefense(opponent.getSPDefense() - 1);
                                        return opponent.getPokemonNickname() + "'s special defense fell";
                                    } catch (IncorrectInputException e) {

                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeSPDefense(opponent.getSPDefense() - 2);
                                        return opponent.getPokemonNickname() + "'s special defense sharply fell";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            opponent.changeSPDefense(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "SPAttack":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeSPAttack(opponent.getSPAttack() - 1);
                                        return opponent.getPokemonNickname() + "'s special attack fell";
                                    } catch (IncorrectInputException e) {
                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeSPAttack(opponent.getSPAttack() - 2);
                                        return opponent.getPokemonNickname() + "'s special attack sharply fell";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            opponent.changeSPAttack(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "Speed":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeSpeed(opponent.getSpeed() - 1);
                                        return opponent.getPokemonNickname() + "'s speed fell";
                                    } catch (IncorrectInputException e) {
                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeSpeed(opponent.getSpeed() - 2);
                                        return opponent.getPokemonNickname() + "'s speed sharply fell";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            opponent.changeSpeed(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
            } else if (keywords[1].equals("Raise")) {
                if (keywords[2].equals("User")) {
                    switch (keywords[3]) {
                        case "Attack":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        user.changeAttack(user.getAttack() + 1);
                                        return user.getPokemonNickname() + "'s attack rose";
                                    } catch (IncorrectInputException e) {
                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        user.changeAttack(user.getAttack() + 2);
                                        return user.getPokemonNickname() + "'s attack sharply rose";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            user.changeAttack(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "Defense":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        user.changeDefense(user.getDefense() + 1);
                                        return user.getPokemonNickname() + "'s defense rose";
                                    } catch (IncorrectInputException e) {

                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        user.changeDefense(user.getDefense() + 2);
                                        return user.getPokemonNickname() + "'s defense sharply rose";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            user.changeDefense(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "SPDefense":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        user.changeSPDefense(user.getSPDefense() + 1);
                                        return user.getPokemonNickname() + "'s special defense rose";
                                    } catch (IncorrectInputException e) {

                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        user.changeSPDefense(user.getSPDefense() + 2);
                                        return user.getPokemonNickname() + "'s special defense sharply rose";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            user.changeSPDefense(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "SPAttack":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        user.changeSPAttack(user.getSPAttack() + 1);
                                        return user.getPokemonNickname() + "'s special attack rose";
                                    } catch (IncorrectInputException e) {
                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        user.changeSPAttack(user.getSPAttack() + 2);
                                        return user.getPokemonNickname() + "'s special attack sharply rose";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            user.changeSPAttack(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "Speed":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        user.changeSpeed(user.getSpeed() + 1);
                                        return user.getPokemonNickname() + "'s speed rose";
                                    } catch (IncorrectInputException e) {
                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        user.changeSpeed(user.getSpeed() + 2);
                                        return user.getPokemonNickname() + "'s speed sharply rose";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            user.changeSpeed(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            break;
                    }
                } else if (keywords[2].equals("Opponent")) {
                    switch (keywords[3]) {
                        case "Attack":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeAttack(opponent.getAttack() + 1);
                                        return opponent.getPokemonNickname() + "'s attack rose";
                                    } catch (IncorrectInputException e) {
                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeAttack(opponent.getAttack() + 2);
                                        return opponent.getPokemonNickname() + "'s attack sharply rose";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            opponent.changeAttack(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "Defense":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeDefense(opponent.getDefense() + 1);
                                        return opponent.getPokemonNickname() + "'s defense rose";
                                    } catch (IncorrectInputException e) {

                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeDefense(opponent.getDefense() + 2);
                                        return opponent.getPokemonNickname() + "'s defense sharply rose";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            opponent.changeDefense(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "SPDefense":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeSPDefense(opponent.getSPDefense() + 1);
                                        return opponent.getPokemonNickname() + "'s special defense rose";
                                    } catch (IncorrectInputException e) {

                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeSPDefense(opponent.getSPDefense() + 2);
                                        return opponent.getPokemonNickname() + "'s special defense sharply rose";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            opponent.changeSPDefense(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "SPAttack":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeSPAttack(opponent.getSPAttack() + 1);
                                        return opponent.getPokemonNickname() + "'s special attack rose";
                                    } catch (IncorrectInputException e) {
                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeSPAttack(opponent.getSPAttack() + 2);
                                        return opponent.getPokemonNickname() + "'s special attack sharply rose";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            opponent.changeSPAttack(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        case "Speed":
                            if (keywords[4].equals("Regular")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeSpeed(opponent.getSpeed() + 1);
                                        return opponent.getPokemonNickname() + "'s speed rose";
                                    } catch (IncorrectInputException e) {
                                    }
                                }
                            } else if (keywords[4].equals("Sharply")) {
                                if (n == 1) {
                                    try {
                                        opponent.changeSpeed(opponent.getSpeed() + 2);
                                        return opponent.getPokemonNickname() + "'s speed sharply rose";
                                    } catch (IncorrectInputException e) {
                                        try {
                                            opponent.changeSpeed(1);
                                        } catch (IncorrectInputException b) {

                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
            } else if (keywords[1].equals("Cause")) {
                switch (keywords[2]) {
                    case "Flinching":
                        opponent.changeStatus("Flinching");
                        return opponent.getPokemonNickname() + " flinched";
                    case "Freeze":
                        opponent.changeStatus("Freeze");
                        return opponent.getPokemonNickname() + " Froze";
                    case "Poison":
                        opponent.changeStatus("Poison");
                        return opponent.getPokemonNickname() + " was poisoned";
                    case "Paralyze":
                        opponent.changeStatus("Paralyze");
                        return opponent.getPokemonNickname() + " was paralyzed";
                    case "Burn":
                        opponent.changeStatus("Burn");
                        return opponent.getPokemonNickname() + " was burned";
                    default:
                        break;
                }
            }
        }
        return "";
    }
    
    /**
     * Function: Returns true if the pokemon was knocked out
     * @param damage
     * @param pokemon
     * @return 
     */
    private boolean applyDamage(double damage, BattlePKM pokemon){
        int dmg = (int) damage;
        pokemon.changeCurrHP(pokemon.getCurrHP() - dmg);
        if (pokemon.getCurrHP() == 0){
            return true;
        }
        return false;
    }
}
