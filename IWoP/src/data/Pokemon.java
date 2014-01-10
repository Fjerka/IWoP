package data;

import data.interfaces.Constants;
import data.interfaces.IMove;
import data.interfaces.INature;
import data.interfaces.IPokemon;

public class Pokemon implements IPokemon {

    String name, nickname;
    int id, maxHp, hp, hpMultiplier, maxEnergy, energy, energyMultiplier, maxAp, ap, love,
            gender, exp, currentExp, level, skillPoints, attack, currentAttack, attackMultiplier, defense,
            currentDefense, defenseMultiplier, spAttack, currentSpAttack, spAttackMultiplier,
            spDefense, currentSpDefense, spDefenseMultiplier, speed, currentSpeed,
            speedMultiplier, accuracy, currentAccuracy, accuracyMultiplier,
            evasiveness, currentEvasiveness, evasivenessMultiplier, evolution;
    IMove[] moves;
    boolean shiny;
    INature nature;
    boolean[] statusEffects;

    public Pokemon(String name, String nickname, int id, int maxHp, int hpMultiplier, int maxEnergy, int energyMultiplier, int maxAp, int gender, int attack, int attackMultiplier, int defense, int defenseMultiplier, int spAttack, int spAttackMultiplier, int spDefense, int spDefenseMultiplier, int speed, int speedMultiplier, int accuracy, int accuracyMultiplier, int evasiveness, int evasivenessMultiplier, int evolution, boolean shiny, INature nature) {
        this.name = name;
        this.nickname = nickname;
        this.id = id;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.hpMultiplier = hpMultiplier;
        this.maxEnergy = maxEnergy;
        this.energy = maxEnergy;
        this.energyMultiplier = energyMultiplier;
        this.maxAp = maxAp;
        this.ap = maxAp;
        this.gender = gender;
        this.attack = attack;
        this.currentAttack = attack;
        this.attackMultiplier = attackMultiplier;
        this.defense = defense;
        this.currentDefense = defense;
        this.defenseMultiplier = defenseMultiplier;
        this.spAttack = spAttack;
        this.currentSpAttack = spAttack;
        this.spAttackMultiplier = spAttackMultiplier;
        this.spDefense = spDefense;
        this.currentSpDefense = spDefense;
        this.spDefenseMultiplier = spDefenseMultiplier;
        this.speed = speed;
        this.currentSpeed = speed;
        this.speedMultiplier = speedMultiplier;
        this.accuracy = accuracy;
        this.currentAccuracy = accuracy;
        this.accuracyMultiplier = accuracyMultiplier;
        this.evasiveness = evasiveness;
        this.currentEvasiveness = evasiveness;
        this.evasivenessMultiplier = evasivenessMultiplier;
        this.evolution = evolution;
        this.moves = new IMove[6];
        this.shiny = shiny;
        this.nature = nature;
        this.exp = Constants.PKMN_START_EXP;
        this.currentExp = 0;
        this.level = 1;
        this.love = 0;
        this.statusEffects = new boolean[7];
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getMaxHP() {
        return maxHp;
    }

    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public int getHPMultiplier() {
        return hpMultiplier;
    }

    @Override
    public void changeHP(int i) {
        hp = (hp + i >= 0) ? hp + i : 0;
        if (hp > maxHp) {
            hp = maxHp;
        }
    }

    @Override
    public void resetHP() {
        hp = maxHp;
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
    public int getEnergyMultiplier() {
        return energyMultiplier;
    }

    @Override
    public void changeEnergy(int i) {
        energy = (energy + i >= 0) ? energy + i : 0;
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
        if (energy == 0) {
            return Constants.PKMN_FAINTED;
        } else if (energy < 20) {
            return Constants.PKMN_EXHAUSTED;
        } else if (energy < 40) {
            return Constants.PKMN_VERY_TIRED;
        } else if (energy < 60) {
            return Constants.PKMN_TIRED;
        } else if (energy < 80) {
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
        love = (love + i >= 0) ? love + i : 0;
    }

    @Override
    public int getGender() {
        return gender;
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
        if (currentExp > exp) {
            // evolve !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        }
    }

    @Override
    public int getEvolution() {
        return evolution;
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
    public int getAttackMultiplier() {
        return attackMultiplier;
    }

    @Override
    public void changeCurrentAttack(int i) {
       currentAttack = (currentAttack + i >= 0) ? currentAttack + i : 0;
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
    public int getDefenseMultiplier() {
        return defenseMultiplier;
    }

    @Override
    public void changeCurrentDefense(int i) {
        currentDefense = (currentDefense + i >= 0) ? currentDefense + i : 0;
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
    public int getSpAttackMultiplier() {
        return spAttackMultiplier;
    }

    @Override
    public void changeCurrentSpAttack(int i) {
        currentSpAttack = (currentSpAttack + i >= 0) ? currentSpAttack + i : 0;
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
    public int getSpDefenseMultiplier() {
        return spDefenseMultiplier;
    }

    @Override
    public void changeCurrentSpDefense(int i) {
       currentSpDefense = (currentSpDefense + i >= 0) ? currentSpDefense + i : 0;
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
    public int getSpeedMultiplier() {
        return speedMultiplier;
    }

    @Override
    public void changeCurrentSpeed(int i) {
        currentSpeed = (currentSpeed + i >= 0) ? currentSpeed + i : 0;
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
    public int getAccuracyMultiplier() {
        return accuracyMultiplier;
    }

    @Override
    public void changeCurrentAccuracy(int i) {
        currentAccuracy = (currentAccuracy + i >= 0) ? currentAccuracy + i : 0;
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
    public int getEvasivenessMultiplier() {
        return evasivenessMultiplier;
    }

    @Override
    public void changeCurrentEvasiveness(int i) {
        currentEvasiveness = (currentEvasiveness + i >= 0) ? currentEvasiveness + i : 0;
    }

    @Override
    public void resetCurrentEvasiveness() {
        currentEvasiveness = evasiveness;
    }

    @Override
    public IMove getMove(int i) {
        return moves[i % 6];
    }

    @Override
    public void setMove(IMove m, int i) {
        moves[i % 6] = m;
    }

    @Override
    public IMove[] getMoves() {
        return moves;
    }

    @Override
    public int getAP() {
        return ap;
    }

    @Override
    public void resetAP() {
        ap = maxAp;
    }

    @Override
    public void changeAP(int i) {
        ap = (ap + i >= 0) ? ap + i : 0;
    }

    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public boolean isShiny() {
        return shiny;
    }

    @Override
    public INature getNature() {
        return nature;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void increaseLevel() {
        level += 1;
        exp = (int) (exp * Constants.PKMN_REQUIRED_EXP_MODIFIER);
    }

    @Override
    public int getSkillPoints() {
        return skillPoints;
    }

    @Override
    public boolean[] getStatusEffects() {
        return statusEffects;
    }
}
