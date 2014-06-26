/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.IQuest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Stefan
 */


public class Story {
    
    private Map<World, Map<Integer, List<IQuest>>> quests;

    public Story(World[] worlds) {
        quests = new HashMap<>();
        for (World world : worlds) {
            quests.put(world, new HashMap<Integer, List<IQuest>>());
            quests.get(world).put(0, new ArrayList<IQuest>());
            quests.get(world).put(1, new ArrayList<IQuest>());
            quests.get(world).put(2, new ArrayList<IQuest>());
            quests.get(world).put(3, new ArrayList<IQuest>());
        }
    }
    
    public List<IQuest> getActiveMainQuests(World world){
        return quests.get(world).get(0);
    }
    
    public List<IQuest> getCompletedMainQuests(World world){
        return quests.get(world).get(1);
    }
    
    public List<IQuest> getActiveSideQuests(World world){
        return quests.get(world).get(2);
    }
    
    public List<IQuest> getCompletedSideQuests(World world){
        return quests.get(world).get(3);
    }

    
}
