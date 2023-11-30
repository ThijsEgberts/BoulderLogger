package com.thijsegberts.boulderlogger.DataTypes;

import android.graphics.Color;

public abstract class AbstractClimb {
    private String id = null;
    private int climbNr;
    private Color color;
    private double xLoc;
    private double yLoc;
    protected ClimbTypes type;
    protected BoulderGrades grade;

    public AbstractClimb() {
    }

    public AbstractClimb(int climbNr) {
        this.climbNr = climbNr;
    }

    /**
     * Sets the number of the climb.
     *
     * @param climbNr integer number of the climb
     */
    public void setClimbNr(int climbNr) {
        this.climbNr = climbNr;
    }

    /**
     * Returns the number of the climb.
     *
     * @return integer number of the climb
     */
    public int getClimbNr() {
        return this.climbNr;
    }

    /**
     * Set the color of the climb.
     *
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Returns the color of the climb as a color object.
     *
     * @return a color object of the climbs color
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * Set the location of the boulder in the physical space.
     *
     * @param x coordinate
     * @param y coordinate
     */
    public void setLoc(double x, double y) {
        this.xLoc = x;
        this.yLoc = y;
    }

    /**
     * Returns the id of the climb.
     *
     * @return id string
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id of a climb if it is not null.
     *
     * @param id value the id is to be set to
     */
    public void setId(String id) {
        if (this.id != null) this.id = id;
    }

    /**
     * Returns the x component of the boulder location.
     *
     * @return a x coordinate double
     */
    public double getXLoc() {
        return this.xLoc;
    }

    /**
     * Returns the y component of the boulder location.
     *
     * @return a y coordinate double
     */
    public double getYLoc() {
        return this.yLoc;
    }
}
