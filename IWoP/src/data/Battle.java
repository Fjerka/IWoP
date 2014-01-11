/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.abstracts.ATrainer;
import data.interfaces.IBattle;
import data.interfaces.IPokemon;

/**
 *
 * @author Vera
 */
public class Battle implements IBattle{
    
    ATrainer[] trainers;
    int number, round;
    IPokemon[][] pokemons;
    
    public Battle(ATrainer first, ATrainer second, int number) {
        trainers = new ATrainer[2];
        double rand = Math.random();
        boolean helper = true;
        if (rand > 0.5) {
            trainers[0] = first;
            trainers[1] = second;
        } else {
            trainers[1] = first;
            trainers[0] = second;
            helper = false;
        }
        this.number = number;
        round = 1;
        pokemons = new IPokemon[2][number];
        if (first.getNumberOfPokemonInParty() < number) {
            if (helper) {
                pokemons[0] = new IPokemon[first.getNumberOfPokemonInParty()];
            } else {
                pokemons[1] = new IPokemon[first.getNumberOfPokemonInParty()];
            }
        }
        if (second.getNumberOfPokemonInParty() < number) {
            if (helper) {
                pokemons[1] = new IPokemon[second.getNumberOfPokemonInParty()];
            } else {
                pokemons[0] = new IPokemon[second.getNumberOfPokemonInParty()];
            }
        }
    }

    @Override
    public ATrainer[] getTrainers() {
        return trainers;
    }

    @Override
    public int getAllowedNumberOfPokemons() {
        return number;
    }

    @Override
    public int getRound() {
        return round;
    }

    @Override
    public ATrainer getAttacker() {
        return trainers[(round + 1) % 2];
    }

    @Override
    public ATrainer getDefender() {
        return trainers[round % 2];
    }

    @Override
    public IPokemon[] getAttackerPokemons() {
        return pokemons[(round + 1) % 2];
    }

    @Override
    public IPokemon[] getDefenderPokemons() {
        return pokemons[round % 2];
    }

    @Override
    public boolean areAllPokemonsSelected(IPokemon[] pokemons) {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] == null) {
                return false;
            }
        }
        return true;
    }
    
}
