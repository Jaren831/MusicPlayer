package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView song = (TextView) findViewById(R.id.song);
        // Set a click listener on that View
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@Link FamilyActivity}
                Intent songIntent = new Intent(MainActivity.this, PlayerActivity.class);
                startActivity(songIntent);
            }
        });
    }
}
