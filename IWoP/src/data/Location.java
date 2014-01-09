/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.ILocation;

/**
 *
 * @author Vera
 */
public class Location implements ILocation {

    int id, biom;
    String name;
    ILocation[] neighbours;
    int[] wildPokemons;

    public Location(int id, String name, int neighbours, int biom) {
        this.id = id;
        this.name = name;
        this.neighbours = new ILocation[neighbours];
        this.biom = biom;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ILocation[] getNeighbours() {
        return neighbours;
    }

    @Override
    public int[] getWildPokemons() {
        return wildPokemons;
    }

    @Override
    public int getBiom() {
        return biom;
    }
}
