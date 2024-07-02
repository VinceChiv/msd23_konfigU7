package at.fhj.msd;

import java.util.LinkedList;

/**
 * GITTeamWork
 * <Description>
 * Author: Matio
 * Last Change: 02.07.2024
 */
public class Cocktail extends Drink {
    private String name;
    private LinkedList<Liquid> ingredients;

    public Cocktail(String name) {
        super(name);
        this.name = name;
        this.ingredients = new LinkedList<Liquid>();
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }


}
