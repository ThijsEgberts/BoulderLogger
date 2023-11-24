package com.thijsegberts.boulderlogger.DataTypes;

import android.graphics.Color;

public abstract class AbstractClimb {
    private int id;
    private int climbNr;
    private Color color;
    private double xLoc;
    private double yLoc;
    protected ClimbTypes type;
    protected BoulderGrades grade;

    public AbstractClimb(int id) {
        this.id = id;
    }

    public AbstractClimb(int id, int climbNr) {
        this.id = id;
        this.climbNr = climbNr;
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
     * Set the location of the boulder in the physical space.
     *
     * @param x coordinate
     * @param y coordinate
     */
    public void setLoc(double x, double y) {
        this.xLoc = x;
        this.yLoc = y;
    }
}
