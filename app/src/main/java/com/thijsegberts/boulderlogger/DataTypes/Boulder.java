package com.thijsegberts.boulderlogger.DataTypes;

public class Boulder extends AbstractClimb {

    public Boulder() {
        super();
        this.type = ClimbTypes.BOULDER;
    }

    public Boulder(int climbNr) {
        super(climbNr);
        this.type = ClimbTypes.BOULDER;
    }
}
