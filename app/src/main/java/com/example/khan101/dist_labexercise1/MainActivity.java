package com.example.khan101.dist_labexercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    EditText editText;

    SeekBar seekBar2;
    EditText editText2;

    SeekBar seekBar3;
    EditText editText3;



    int progress = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(255);
        editText = (EditText) findViewById(R.id.editText3);
        seekBar.setProgress(progress);

        seekBar2 = (SeekBar) findViewById(R.id.seekBar3);
        seekBar2.setMax(255);
        seekBar2.setProgress(progress);
        editText2 = (EditText) findViewById(R.id.editText);

        seekBar3 = (SeekBar) findViewById(R.id.seekBar2);
        seekBar3.setMax(255);
        seekBar3.setProgress(progress);
        editText3 = (EditText) findViewById(R.id.editText2);

        //textView= (TextView) findViewById(R.id.textView);



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                progress = i;
               editText.setText(String.valueOf(i));
               }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                }

        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar2, int j, boolean c) {

                progress = j;
                editText2.setText(String.valueOf(j));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });

        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar2, int j, boolean c) {

                progress = j;
                editText3.setText(String.valueOf(j));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });







    }
}


