package com.thijsegberts.boulderlogger.DataTypes;

public class Boulder extends AbstractClimb {

    public Boulder() {
        super();
        this.isBoulder = true;
    }

    public Boulder(int climbNr) {
        super(climbNr);
        this.isBoulder = true;
    }

    public Boulder(int climbNr, String name, int color) {
        super(climbNr, name, color);
        this.isBoulder = true;
    }
}
