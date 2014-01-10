/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

/**
 *
 * @author Stefan
 */
public interface IMove {

    /**
     * Return id of the move;
     *
     * @return id
     */
    int getId();

    /**
     * Return name of the move.
     *
     * @return name
     */
    String getName();

    /**
     * Return description of the move.
     *
     * @return description
     */
    String getDescription();

    /**
     * Return hit point cost of the move.
     *
     * @return hit point cost
     */
    int getHPCost();

    /**
     * Return energy cost of the move.
     *
     * @return energy cost
     */
    int getEnergyCost();

    /**
     * Return action point cost of the move.
     *
     * @return action point cost
     */
    int getAPCost();

    /**
     * Return category of the move (special attack and defense, physical attack
     * and defense, status and unique).
     *
     * @return category
     */
    int getCategory();

    /**
     * Return type of the move.
     *
     * @return type
     */
    int getType();

    /**
     * Return attack power of the attack.
     *
     * @return
     */
    int getPower();

    /**
     * Return defense rating of the move.
     *
     * @return defense rating
     */
    int getDefenseRating();

    /**
     * Return accuracy of the attack.
     *
     * @return accarucy
     */
    int getAccuracy();

    /**
     * Get critical hit ratio of the move.
     *
     * @return critical hit ratio
     */
    int getCriticalHitRatio();

    /**
     * Get priority of the attack (integer from -7 to 7).
     *
     * @return priority
     */
    int getPriority();

    /**
     * Returns true if by using this move opposing pokemons make contact, false
     * otherwise.
     *
     * @return contact
     */
    boolean getContact();

    /**
     * Return effect which is done to the target pokemon.
     *
     * @return effect
     */
    IEffect getTargetEffect();

    /**
     * Return effect which is done to itself.
     *
     * @return effect
     */
    IEffect getSelfEffect();

    /**
     * Return effect which is done to the environment.
     *
     * @return effect
     */
    IEffect getBattleEffect();
}
