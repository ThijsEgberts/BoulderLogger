package com.thijsegberts.boulderlogger.DB;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.thijsegberts.boulderlogger.DataTypes.Boulder;

import java.util.ArrayList;
import java.util.List;

public class BoulderDataBaseHandler extends DataBaseHandler {

    public static final String BOULDERS_LIST = "bouldersList";

    private static final String TAG = "boulderDbHandler";

    /**
     * Gives a reference to the boulders in firebase.
     *
     * @return
     */
    public static DatabaseReference getBoulderReference() {
        return getInstance().getReference(BOULDERS_LIST);
    }

    /**
     * Adds a new boulder to the database.
     *
     * @param boulder
     */
    public static void addNewBoulder(Boulder boulder) {
        String boulderId = getBoulderReference().push().getKey();
        boulder.setId(boulderId);

        getBoulderReference().child(boulder.getId()).setValue(boulder).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Log.d(TAG, "onComplete: Successfully added boulder " + boulder.getId() + " to db");
                } else {
                    Log.e(TAG, "onComplete: Error while trying to added boulder " + boulder.getId() + " to db", task.getException());
                }
            }
        });
    }

    /**
     * Fetches all current boulders from the database.
     *
     * @param callBack a callback interface to pass the results of the fetch to
     */
    public static void fetchCategoriesFromDB(BouldersDBInterface callBack) {
        getBoulderReference().get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    callBack.fetchBouldersCallBack(null);
                    Log.e(TAG, "fetchBouldersFromDB: Failed to fetch boulders from DB.", task.getException());
                }

                List<Boulder> categoriesList = new ArrayList<>();

                for (DataSnapshot catSnapShot : task.getResult().getChildren()) {
                    categoriesList.add(catSnapShot.getValue(Boulder.class));
                }

                callBack.fetchBouldersCallBack(categoriesList);
                Log.d(TAG, "fetchBouldersFromDB: Fetched boulders from db");
            }
        });
    }
}
