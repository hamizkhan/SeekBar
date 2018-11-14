package com.example.hamiz.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{

    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar=(SeekBar)findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int progressChangedValue=0;
            @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                progressChangedValue=progress;
                Toast.makeText(MainActivity.this,"SeekBar in Current Progress",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                Toast.makeText(MainActivity.this,"SeekBar Started",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Toast.makeText(MainActivity.this,"SeekBar Progress is "+progressChangedValue,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
