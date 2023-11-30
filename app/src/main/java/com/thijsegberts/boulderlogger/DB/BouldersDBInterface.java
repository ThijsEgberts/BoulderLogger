package com.thijsegberts.boulderlogger.DB;

import com.thijsegberts.boulderlogger.DataTypes.Boulder;

import java.util.List;

public interface BouldersDBInterface {

    /**
     * Callback method for fetching all current boulders from the database.
     *
     * @param boulderList an Arraylist where the boulders are to be returned
     */
    void fetchBouldersCallBack(List<Boulder> boulderList);
}
