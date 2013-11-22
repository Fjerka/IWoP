package data;

import data.interfaces.Constants;
import data.interfaces.IMove;
import data.interfaces.IPokemon;

public class Pokemon implements IPokemon {

    String name;
    int number, maxhp, hp, maxEnergy, energy, love, sex, lvl, exp, currentExp,
            attack, currentAttack, defense, currentDefense, spAttack, currentSpAttack,
            spDefense, currentSpDefense, speed, currentSpeed, accuracy, currentAccuracy,
            evasiveness, currentEvasiveness;
    IMove[] moves;

    public Pokemon(String name, int number, int maxhp, int maxEnergy, int sex, int lvl, int exp, int attack, int defense, int spAttack, int spDefense, int speed, int accuracy, int evasiveness, IMove[] moves) {
        this.name = name;
        this.number = number;
        this.maxhp = maxhp;
        hp = maxhp;
        this.maxEnergy = maxEnergy;
        energy = maxEnergy;
        love = 0;
        this.sex = sex;
        this.lvl = lvl;
        this.exp = exp;
        currentExp = 0;
        this.attack = attack;
        currentAttack = attack;
        this.defense = defense;
        currentDefense = defense;
        this.spAttack = spAttack;
        currentSpAttack = spAttack;
        this.spDefense = spDefense;
        currentSpDefense = spDefense;
        this.speed = speed;
        currentSpeed = speed;
        this.accuracy = accuracy;
        currentAccuracy = accuracy;
        this.evasiveness = evasiveness;
        currentEvasiveness = evasiveness;
        this.moves = moves;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public int getMaxHP() {
        return maxhp;
    }

    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public void changeHP(int i) {
        hp += i;
        if (hp > maxhp) {
            hp = maxhp;
        }
    }

    @Override
    public void resetHP() {
        hp = maxhp;
    }

    @Override
    public int getMaxEnrgy() {
        return maxEnergy;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public void changeEnergy(int i) {
        energy += i;
        if (energy > maxEnergy) {
            energy = maxEnergy;
        }
    }

    @Override
    public void resetEnergy() {
        energy = maxEnergy;
    }

    @Override
    public int getState() {
        int tmp = (100 * energy) / maxEnergy;
        if (tmp == 0) {
            return Constants.PKMN_FAINTED;
        } else if (tmp < 20) {
            return Constants.PKMN_EXHAUSTED;
        } else if (tmp < 40) {
            return Constants.PKMN_VERY_TIRED;
        } else if (tmp < 60) {
            return Constants.PKMN_TIRED;
        } else if (tmp < 80) {
            return Constants.PKMN_NORMAL;
        } else {
            return Constants.PKMN_RESTED;
        }
    }

    @Override
    public int getLove() {
        return love;
    }

    @Override
    public void changeLove(int i) {
        love += i;
        if (love > 100) {
            love = 100;
        }
    }

    @Override
    public int getSex() {
        return sex;
    }

    @Override
    public int getLvl() {
        return lvl;
    }

    /**
     * Increases the level of a pokemon by 1, increase tha amount of exp needed
     * for next lvl and lowers curretnExp by the value of exp.
     */
    private void increaseLvl() {
        lvl++;
        currentExp = currentExp - exp;
        exp = (int) 1.5 * exp;
    }

    @Override
    public int getExp() {
        return exp;
    }

    @Override
    public int getCurrentExp() {
        return currentExp;
    }

    @Override
    public void changeCurrentExp(int i) {
        currentExp += i;
        if (currentExp >= exp) {
            increaseLvl();
        }
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public int getCurrentAttack() {
        return currentAttack;
    }

    @Override
    public void changeCurrentAttack(int i) {
        currentAttack += i;
    }

    @Override
    public void resetCurrentAttack() {
        currentAttack = attack;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public int getCurrentDefense() {
        return currentDefense;
    }

    @Override
    public void changeCurrentDefense(int i) {
        currentDefense += i;
    }

    @Override
    public void resetCurrentDefense() {
        currentDefense = defense;
    }

    @Override
    public int getSpAttack() {
        return spAttack;
    }

    @Override
    public int getCurrentSpAttack() {
        return currentSpAttack;
    }

    @Override
    public void changeCurrentSpAttack(int i) {
        currentSpAttack += i;
    }

    @Override
    public void resetCurrentSpAttack() {
        currentSpAttack = spAttack;
    }

    @Override
    public int getSpDefense() {
        return spDefense;
    }

    @Override
    public int getCurrentSpDefense() {
        return currentSpDefense;
    }

    @Override
    public void changeCurrentSpDefense(int i) {
        currentSpDefense += i;
    }

    @Override
    public void resetCurrentSpDefense() {
        currentSpDefense = spDefense;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void changeCurrentSpeed(int i) {
        currentSpeed += i;
    }

    @Override
    public void resetCurrentSpeed() {
        currentSpeed = speed;
    }

    @Override
    public int getAccuracy() {
        return accuracy;
    }

    @Override
    public int getCurrentAccuracy() {
        return currentAccuracy;
    }

    @Override
    public void changeCurrentAccuracy(int i) {
        currentAccuracy += i;
    }

    @Override
    public void resetCurrentAccuracy() {
        currentAccuracy = accuracy;
    }

    @Override
    public int getEvasiveness() {
        return evasiveness;
    }

    @Override
    public int getCurrentEvasiveness() {
        return currentEvasiveness;
    }

    @Override
    public void changeCurrentEvasiveness(int i) {
        currentEvasiveness += i;
    }

    @Override
    public void resetCurrentEvasiveness() {
        currentEvasiveness = evasiveness;
    }

    @Override
    public IMove getMove(int i) {
        if (i >= 0 && i < 6) {
            return moves[i];
        } else {
            return null;
        }
    }

    @Override
    public void setMove(IMove m, int i) {
        if (i >= 0 && i < 6) {
            moves[i] = m;
        }
    }

    @Override
    public IMove[] getMoves() {
        return moves;
    }
}
