/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

/**
 *
 * @author Stefan
 */
public interface IPokemon {

    /**
     * Returns name of the pokemon.
     *
     * @return name
     */
    String getName();

    /**
     * Returns the nickname of the pokemon.
     *
     * @return nickname
     */
    String getNickname();

    /**
     * Returns id of pokemon according to a pokedex number of pokemon (Kanto
     * pokedex).
     *
     * @return id of a pokemon
     */
    int getId();

    /**
     * Returns the gender of the pokemon.
     *
     * @return gender
     */
    int getGender();

    /**
     * Returns true if the pokemon is shiny.
     *
     * @return shiny
     */
    boolean isShiny();

    /**
     * Returns the nature of the pokemon.
     *
     * @return nature
     */
    INature getNature();

    /**
     * Get maximal hit points of a pokemon.
     *
     * @return maximal hit points
     */
    int getMaxHP();

    /**
     * Get current hit points of a pokemon.
     *
     * @return current hit points
     */
    int getHP();

    /**
     * Get the exp multiplier for determination of HP increase.
     *
     * @return HP multiplier
     */
    int getHPMultiplier();

    /**
     * Changes current amount of hit points of a pokemon by the value of param
     * i. Current hit points can never be higher then maximal hit points.
     *
     * @param i changes current HP
     */
    void changeHP(int i);

    /**
     * Resets current hit points on a value of a maximal hit points of a
     * pokemon.
     */
    void resetHP();

    /**
     * Get maximal amount of an energy of a pokemon.
     *
     * @return max amount of an energy
     */
    int getMaxEnrgy();

    /**
     * Get current amount of an energy of a pokemon.
     *
     * @return current amount of an energy
     */
    int getEnergy();

    /**
     * Get the exp multiplier for determination of Energy increase.
     *
     * @return Energy multiplier
     */
    int getEnergyMultiplier();

    /**
     * Changes current amount of energy of a pokemon by the value of param i.
     * Current energy can never be higher then maximal energy.
     *
     * @param i changes current energy
     */
    void changeEnergy(int i);

    /**
     * Resets current energy on a value of a maximal energy of a pokemon.
     */
    void resetEnergy();

    /**
     * Returns current energy state of a pokemon (determines perfomence of a
     * pokemon on the start of a battle).
     *
     * @return current state of a pokemon
     */
    int getState();

    /**
     * Returns current value of AP.
     *
     * @return current value of AP
     */
    int getAP();

    /**
     * Changes current amount of AP of a pokemon by the value of param i.
     * Current AP can never be higher then maximal AP.
     *
     * @param i changes current energy
     */
    public void changeAP(int i);

    /**
     * Resert value of AP to its original value.
     */
    void resetAP();

    /**
     * Retunrs current attitude of a pokemon towards its trainer.
     *
     * @return love
     */
    int getLove();

    /**
     * Changes current value of a pokemon's love by the param i.
     *
     * @param i changes current love
     */
    void changeLove(int i);

    /**
     * Returns required amount of exp of a pokemon.
     *
     * @return required amount of exp
     */
    int getExp();

    /**
     * Returns current amount of exp of a pokemon.
     *
     * @return current amount of exp
     */
    int getCurrentExp();

    /**
     * Chenges current amount of exp by the value of param i.
     *
     * @param i change of current exp
     */
    void changeCurrentExp(int i);

    /**
     * Get the number of pokemon, that is a direct evolution of this pokemon. Or
     * 0, if this pokemon doesnt have any further evolution.
     *
     * @return
     */
    int getEvolution();

    /**
     * Returns the level of the pokemon.
     *
     * @return level
     */
    int getLevel();

    /**
     * Increases the level of the pokemon by 1.
     */
    void increaseLevel();

    /**
     * Returns number of skill points.
     *
     * @return number of skill points
     */
    int getSkillPoints();

    /**
     * Returns attack stat of a pokemon.
     *
     * @return attack
     */
    int getAttack();

    /**
     * Returns current state of an attack stat of a pokemon (can be altered
     * during a battle).
     *
     * @return current state of an attack
     */
    int getCurrentAttack();

    /**
     * Get the exp multiplier for determination of attack increase.
     *
     * @return Attack multiplier
     */
    int getAttackMultiplier();

    /**
     * Changes current attack stat by the value of an parametr i.
     *
     * @param i changes current attack
     */
    void changeCurrentAttack(int i);

    /**
     * Resets current attack value on a value of a normal attack of a pokemon.
     */
    void resetCurrentAttack();

    /**
     * Returns defense stat of a pokemon.
     *
     * @return defense
     */
    int getDefense();

    /**
     * Returns current state of a defense stat of a pokemon (can be altered
     * during a battle).
     *
     * @return current state of a defense
     */
    int getCurrentDefense();

    /**
     * Get the exp multiplier for determination of defense increase.
     *
     * @return defense multiplier
     */
    int getDefenseMultiplier();

    /**
     * Changes current defense stat by the value of an parametr i.
     *
     * @param i changes current defense
     */
    void changeCurrentDefense(int i);

    /**
     * Resets current defense value on a value of a normal defense of a pokemon.
     */
    void resetCurrentDefense();

    /**
     * Returns spAttack stat of a pokemon.
     *
     * @return spAttack
     */
    int getSpAttack();

    /**
     * Returns current state of a spAttack stat of a pokemon (can be altered
     * during a battle).
     *
     * @return current state of a spAttack
     */
    int getCurrentSpAttack();

    /**
     * Get the exp multiplier for determination of spAttack increase.
     *
     * @return spAttack multiplier
     */
    int getSpAttackMultiplier();

    /**
     * Changes current spAttack stat by the value of an parametr i.
     *
     * @param i changes current spAttack
     */
    void changeCurrentSpAttack(int i);

    /**
     * Resets current spAttack value on a value of a normal spAttack of a
     * pokemon.
     */
    void resetCurrentSpAttack();

    /**
     * Returns spDefense stat of a pokemon.
     *
     * @return spDefense
     */
    int getSpDefense();

    /**
     * Returns current state of a spDefense stat of a pokemon (can be altered
     * during a battle).
     *
     * @return current state of a spDefense
     */
    int getCurrentSpDefense();

    /**
     * Get the exp multiplier for determination of spDefense increase.
     *
     * @return spDefense multiplier
     */
    int getSpDefenseMultiplier();

    /**
     * Changes current spDefense stat by the value of an parametr i.
     *
     * @param i changes current dpDefense
     */
    void changeCurrentSpDefense(int i);

    /**
     * Resets current spDefense value on a value of a normal dpDefense of a
     * pokemon.
     */
    void resetCurrentSpDefense();

    /**
     * Returns speed stat of a pokemon.
     *
     * @return speed
     */
    int getSpeed();

    /**
     * Returns current state of a speed stat of a pokemon (can be altered during
     * a battle).
     *
     * @return current state of a speed
     */
    int getCurrentSpeed();

    /**
     * Get the exp multiplier for determination of speed increase.
     *
     * @return speed multiplier
     */
    int getSpeedMultiplier();

    /**
     * Changes current speed stat by the value of an parametr i.
     *
     * @param i changes current speed
     */
    void changeCurrentSpeed(int i);

    /**
     * Resets current speed value on a value of a normal speed of a pokemon.
     */
    void resetCurrentSpeed();

    /**
     * Returns accuracy stat of a pokemon.
     *
     * @return accuracy
     */
    int getAccuracy();

    /**
     * Returns current state of a accuracy stat of a pokemon (can be altered
     * during a battle).
     *
     * @return current state of a accuracy
     */
    int getCurrentAccuracy();

    /**
     * Get the exp multiplier for determination of accuracy increase.
     *
     * @return accuracy multiplier
     */
    int getAccuracyMultiplier();

    /**
     * Changes current accuracy stat by the value of an parametr i.
     *
     * @param i changes current accuracy
     */
    void changeCurrentAccuracy(int i);

    /**
     * Resets current accuracy value on a value of a normal accuracy of a
     * pokemon.
     */
    void resetCurrentAccuracy();

    /**
     * Returns evasiveness stat of a pokemon.
     *
     * @return evasiveness
     */
    int getEvasiveness();

    /**
     * Returns current state of a evasiveness stat of a pokemon (can be altered
     * during a battle).
     *
     * @return current state of a evasiveness
     */
    int getCurrentEvasiveness();

    /**
     * Get the exp multiplier for determination of evasiveness increase.
     *
     * @return evasiveness multiplier
     */
    int getEvasivenessMultiplier();

    /**
     * Changes current evasiveness stat by the value of an parametr i.
     *
     * @param i changes current evasiveness
     */
    void changeCurrentEvasiveness(int i);

    /**
     * Resets current evasiveness value on a value of a normal evasiveness of a
     * pokemon.
     */
    void resetCurrentEvasiveness();

    /**
     * Returns a move on index i (index >= 0 && 5 >= index).
     *
     * @param index index of move
     * @return IMove on index i or null if there is no such move
     */
    IMove getMove(int i);

    /**
     * Sets move on index i on a new move m.
     *
     * @param m IMove
     * @param i index
     */
    void setMove(IMove m, int i);

    /**
     * Return array of moves of a pokemon.
     *
     * @return array of moves.
     */
    IMove[] getMoves();

    /**
     * Returns an array representing status effects, which are currently
     * affecting the pokemon.
     *
     * @return array of status effects
     */
    boolean[] getStatusEffects();
}
