package com.thijsegberts.boulderlogger.DataTypes;

import android.graphics.Color;

public abstract class AbstractClimb {
    private String id = null; //the firebase id of the climb
    private int climbNr; //the display id/number of the climb
    private Color color; //the color of the holds
    private double xLoc; //the location of the climb
    private double yLoc;
    protected boolean isBoulder; //the type of the climb
    protected BoulderGrades grade; //the grade of the climb given by the setters
    protected BoulderGrades consensusGrade; //the consensus grade of the climb

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

    public boolean isBoulder() {
        return isBoulder;
    }
}
