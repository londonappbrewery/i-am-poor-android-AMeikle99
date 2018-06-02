package com.londonappbrewery.iampoor;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static int timesClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imgButton = findViewById(R.id.coalButton);
        timesClicked = 0;
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timesClicked += 1;
                if (timesClicked == 1) {
                    Toast.makeText(getApplicationContext(), "You poor person, you have clicked me " + timesClicked + " time", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "You poor person, you have clicked me " + timesClicked + " times", Toast.LENGTH_LONG).show();
                }


            }
        });
    }

}
