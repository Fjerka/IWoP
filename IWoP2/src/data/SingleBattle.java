/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.abstact.ATrainer;
import data.interfaces.IBattleground;
import data.interfaces.IPKMNBonus;
import java.util.Random;

/**
 *
 * @author Stefan
 */
public class SingleBattle {
    
    private ATrainer[] trainers;
    private int attackerIndex;
    private IPKMNBonus[][] bonuses;
    private IBattleground battleground;
    private int numberOfPKMN;

    public SingleBattle(ATrainer trainer1,ATrainer trainer2, IBattleground battleground, int numberOfPKMN) {
        trainers = new ATrainer[numberOfPKMN];
        trainers[0] = trainer1;
        trainers[1] = trainer2;
        bonuses = new IPKMNBonus[2][numberOfPKMN];
        Random ran = new Random(System.currentTimeMillis());
        double random = ran.nextDouble();
        attackerIndex = random >= 0.5 ? 1 : 0;
        this.battleground = battleground;
        this.numberOfPKMN = numberOfPKMN;
    }
    
    
    
    
    
    
    
    
}
