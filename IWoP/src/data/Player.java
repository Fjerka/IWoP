/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.Constants;
import data.interfaces.IInventory;
import data.interfaces.ILocation;
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
public class Player implements IPlayer {

    String name;
    int sex, ap, maxAp, story, exp, requieredExp, level, skillPoints, id;
    int[] badges;
    ILocation location;
    IWorld world;
    ITrainingMethod[] trainingMethods;
    IInventory inventory;
    ISkill[] skills;
    IPokemon[] partyPokemon;
    ArrayList<IPokemon> storedPokemon;

    public Player(String name, int sex, int id, int badges, ILocation location, IWorld world) {
        this.name = name;
        this.sex = sex;
        this.maxAp = Constants.PLAYER_MAX_AP_INIT;
        this.ap = maxAp;
        this.story = 0;
        this.exp = 0;
        this.requieredExp = Constants.PLAYER_REQUIRED_EXP_INIT;
        this.level = 1;
        this.skillPoints = 0;
        this.id = id;
        this.badges = new int[badges];
        this.location = location;
        this.world = world;
        this.trainingMethods = new ITrainingMethod[3];
        this.inventory = null;
        this.skills = new ISkill[3];
        this.partyPokemon = new IPokemon[6];
        this.storedPokemon = null;
    }

    @Override
    public int[] getBadges() {
        return badges;
    }

    @Override
    public int getSex() {
        return sex;
    }

    @Override
    public int getAP() {
        return ap;
    }

    @Override
    public boolean changeAP(int i) {
        if (ap + i >= 0) {
            ap += i;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void resetAP() {
        ap = maxAp;
    }

    @Override
    public ILocation getLocation() {
        return location;
    }

    @Override
    public IWorld getWorld() {
        return world;
    }

    @Override
    public int getStory() {
        return story;
    }

    @Override
    public int getExp() {
        return exp;
    }

    @Override
    public int getRequiredExp() {
        return requieredExp;
    }

    @Override
    public void changeExp(int i) {
        exp = (exp + i >= 0) ? exp + i : 0;
        if (exp <= requieredExp) {
            exp = exp - requieredExp;
            increaseLevel(1);
        }
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void increaseLevel(int i) {
        level += i;
        for (int j = 0; j < i; j++) {
            requieredExp = (int) (requieredExp * Constants.PLAYER_REQUIRED_EXP_MODIFIER);
        }
        skillPoints += i * Constants.PLAYER_SKILL_POINTS_MODIFIER;
    }

    @Override
    public int getSkillPoints() {
        return skillPoints;
    }

    @Override
    public ITrainingMethod[] getTrainingMethods() {
        return trainingMethods;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IInventory getInventory() {
        return inventory;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public ISkill[] getSkills() {
        return skills;
    }

    @Override
    public IPokemon[] getPartyPokemon() {
        return partyPokemon;
    }

    @Override
    public ArrayList<IPokemon> getStoredPokemon() {
        return storedPokemon;
    }
}
