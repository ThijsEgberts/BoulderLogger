package com.thijsegberts.boulderlogger.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;

import com.thijsegberts.boulderlogger.R;

public class AddNewBoulderActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText nrEditText;
    private SeekBar redSeekBar;
    private SeekBar greenSeekBar;
    private SeekBar blueSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_boulder);
    }
}