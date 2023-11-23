package com.thijsegberts.boulderlogger.DataTypes;

public class Boulder extends AbstractClimb {

    public Boulder(int id) {
        super(id);
        this.type = ClimbTypes.BOULDER;
    }

    public Boulder(int id, int climbNr) {
        super(id, climbNr);
        this.type = ClimbTypes.BOULDER;
    }
}
