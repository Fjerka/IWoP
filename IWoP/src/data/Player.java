/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.abstracts.ATrainer;
import data.interfaces.Constants;
import data.interfaces.IInventory;
import data.interfaces.ILocation;
import data.interfaces.IMove;
import data.interfaces.IPlayer;
import data.interfaces.IPokemon;
import data.interfaces.ISkill;
import data.interfaces.ITrainingMethod;
import data.interfaces.IWorld;
import java.util.ArrayList;

/**
 *
 * @author Stefan
 */
public class Player extends ATrainer {

    int sex, story, exp, requieredExp, skillPoints;
    int[] badges;
    ITrainingMethod[] trainingMethods;
    ArrayList<IPokemon> storedPokemon;

    public Player(int sex, String name, int id, int level, ILocation location, IWorld world, int capacity, int money) {
        super.setName(name);
        super.setId(id);
        super.setLevel(level);
        super.setMaxAp(Constants.PLAYER_MAX_AP_INIT);
        super.setAp(super.getMaxAp());
        super.setLocation(location);
        super.setWorld(world);
        super.setInventory(new Inventory(capacity, money));
        super.setPartyPokemons(new IPokemon[6]);
        this.sex = sex;
        requieredExp = Constants.PLAYER_REQUIRED_EXP_INIT;
        exp = 0;
        skillPoints = 0;
        badges = new int[8];
    }
    
    public int[] getBadges() {
        return badges;
    }

    public int getSex() {
        return sex;
    }

    public int getStory() {
        return story;
    }

    public int getExp() {
        return exp;
    }

    public int getRequiredExp() {
        return requieredExp;
    }

    public void changeExp(int i) {
        exp = (exp + i >= 0) ? exp + i : 0;
        if (exp <= requieredExp) {
            exp = exp - requieredExp;
            increaseLevel(1);
        }
    }

    public void increaseLevel(int i) {
        super.setLevel(super.getLevel() + 1);
        for (int j = 0; j < i; j++) {
            requieredExp = (int) (requieredExp * Constants.PLAYER_REQUIRED_EXP_MODIFIER);
        }
        skillPoints += i * Constants.PLAYER_SKILL_POINTS_MODIFIER;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public ITrainingMethod[] getTrainingMethods() {
        return trainingMethods;
    }

    public ArrayList<IPokemon> getStoredPokemon() {
        return storedPokemon;
    }

    public void moveToNextLocation(int toLocation) {
        super.setLocation(super.getLocation().getNeighbours()[toLocation % super.getLocation().getNeighbours().length]);
    }

    @Override
    public IMove attack(IPokemon attacker, IPokemon defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
