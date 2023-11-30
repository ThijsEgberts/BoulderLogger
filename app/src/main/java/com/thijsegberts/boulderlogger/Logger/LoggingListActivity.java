package com.thijsegberts.boulderlogger.Logger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.thijsegberts.boulderlogger.R;

/**
 * Activity to display a list of the boulders in the gym where a user can press the boulder to log them.
 */
public class LoggingListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging_list);
    }
}