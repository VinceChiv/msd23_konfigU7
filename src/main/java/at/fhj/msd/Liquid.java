package at.fhj.msd;

/**
 * Represents a liquid of which has different attributes that make it
 */
public class Liquid {

    /**
     * Name of the liquid
     */
    private String name;

    /**
     * How much volumen the liquid has
     */
    private double volume;

    /**
     * How much percentage of alcohol the liquid has
     */
    private double alcoholPercent;

    /**
     * Constructor which creates the liquid object
     * @param name the name of the liquid
     * @param volume the volume of the liquid
     * @param alcoholPercent the amount of alcohol of the liquid in percentage
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Retrieves the name of the current liquid
     *
     * @return name of the liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the current liquid with the given name
     *
     * @param name the name of the liquid
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the volume of the current liquid
     *
     * @return volume of the liquid
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the current liquid with the given volume
     *
     * @param volume the volume of the liquid
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Retrieves the amountn of alcohol of the current liquid in percentage
     *
     * @return volume of the liquid
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets the current liquid with the given amount of alcohol in percentage
     *
     * @param alcoholPercent the name of the liquid
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
