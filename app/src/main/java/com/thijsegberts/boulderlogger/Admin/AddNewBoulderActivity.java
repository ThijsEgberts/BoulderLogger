package com.thijsegberts.boulderlogger.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.thijsegberts.boulderlogger.DB.BoulderDataBaseHandler;
import com.thijsegberts.boulderlogger.DataTypes.Boulder;
import com.thijsegberts.boulderlogger.R;

public class AddNewBoulderActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText nrEditText;
    private SeekBar redSeekBar;
    private SeekBar greenSeekBar;
    private SeekBar blueSeekBar;
    private TextView colorBar;
    private Button submitButton;


    private final static String TAG = "AddNewBoulderActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_boulder);

        initUiRefs();

        redSeekBar.setOnSeekBarChangeListener(colorBarOnSeekChangeListener);
        greenSeekBar.setOnSeekBarChangeListener(colorBarOnSeekChangeListener);
        blueSeekBar.setOnSeekBarChangeListener(colorBarOnSeekChangeListener);

        submitButton.setOnClickListener(submitButtonListener);

        updateColorViewer();

    }

    //This onchangelistener is used by all the color sliders
    SeekBar.OnSeekBarChangeListener colorBarOnSeekChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            updateColorViewer();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    View.OnClickListener submitButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String boulderName = nameEditText.getText().toString();
            int boulderNr = Integer.parseInt(nrEditText.getText().toString());
            int red = redSeekBar.getProgress();
            int green = greenSeekBar.getProgress();
            int blue = blueSeekBar.getProgress();

            Boulder boulder = new Boulder(boulderNr, boulderName, Color.rgb(red, green, blue));

            BoulderDataBaseHandler.addNewBoulder(boulder);
        }
    };

    /**
     * Updates the color viewer TextView.
     */
    private void updateColorViewer() {
        int red = redSeekBar.getProgress();
        int green = greenSeekBar.getProgress();
        int blue = blueSeekBar.getProgress();

        colorBar.setBackgroundColor(Color.rgb(red, green, blue));
    }
    private void initUiRefs() {
        nameEditText = (EditText)findViewById(R.id.editTextBoulderName);
        nrEditText = (EditText) findViewById(R.id.editTextBoulderNr);
        redSeekBar = (SeekBar) findViewById(R.id.seekBarRed);
        greenSeekBar = (SeekBar) findViewById(R.id.seekBarGreen);
        blueSeekBar = (SeekBar) findViewById(R.id.seekBarBlue);
        colorBar = (TextView) findViewById(R.id.colorBarViewer);
        submitButton = (Button) findViewById(R.id.submitButton);
    }
}