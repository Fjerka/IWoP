/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.trainers;

import data.abstracts.ATrainer;
import data.interfaces.Constants;
import data.interfaces.ILocation;
import data.interfaces.IMove;
import data.interfaces.IPokemon;
import data.interfaces.IWorld;

/**
 *
 * @author Vera
 */
public class WildEncounter extends ATrainer{

    public WildEncounter(String name, ILocation location, IWorld world) {
        super.setName(name);
        super.setId(5);
        super.setLevel(1);
        super.setMaxAp(Constants.PLAYER_MAX_AP_INIT);
        super.setAp(super.getMaxAp());
        super.setLocation(location);
        super.setWorld(world);
        super.setPartyPokemons(new IPokemon[1]);
    }

    @Override
    public IMove attack(IPokemon attacker, IPokemon defender) {
        return attacker.getMove(0);
    }

    @Override
    public boolean selectPokemonForBattle(IPokemon[] pokemons, int selection) {
        pokemons[0] = super.getPartyPokemons()[0];
        return true;
    }
}
