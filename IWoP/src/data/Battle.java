/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.abstracts.ATrainer;
import data.interfaces.IBattle;

/**
 *
 * @author Vera
 */
public class Battle implements IBattle{
    
    ATrainer[] trainers;
    int number, round;
    
    public Battle(ATrainer first, ATrainer second, int number) {
        trainers = new ATrainer[2];
        double rand = Math.random();
        if (rand > 0.5) {
            trainers[0] = first;
            trainers[1] = second;
        } else {
            trainers[1] = first;
            trainers[0] = second;
        }
        this.number = number;
        round = 1;
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
    public ATrainer getDeffender() {
        return trainers[round  % 2];
    }
    
}
