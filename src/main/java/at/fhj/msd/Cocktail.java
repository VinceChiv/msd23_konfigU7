package at.fhj.msd;

import java.util.LinkedList;

/**
 * Represents a cocktail which is a drink with multiple ingredients
 */
public class Cocktail extends Drink {
    /**
     * list of liquids for the cocktail
     */
    protected LinkedList<Liquid> ingredients;

    /**
     * Creates a Cocktail object with given name
     *
     * @param name name of the cocktail
     */
    public Cocktail(String name) {
        super(name);
        ingredients = new LinkedList<Liquid>();
    }

    /**
     * Adds a liquid to the cocktail
     *
     * @param l the liquid to add
     */
    public void addIngredient(Liquid l) {
        ingredients.add(l);
    }

    /**
     * Returns the number of ingredients
     *
     * @return number of ingredients
     */
    public int getNumberOfIngredients() {
        return ingredients.size();
    }

    /**
     * Returns the volume of the cocktail
     *
     * @return the volume of the cocktail in liter
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid l : ingredients) {
            volume += l.getVolume();
        }
        return volume;
    }

    /**
     * Returns the alcohol volume percent of the cocktail
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        double alcohol = 0;
        for (Liquid l : ingredients) {
            alcohol += l.getAlcoholPercent() * l.getVolume();
        }
        return alcohol / getVolume();
    }

    /**
     * Gives information if cocktail is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        return getAlcoholPercent() > 0;
    }
}
