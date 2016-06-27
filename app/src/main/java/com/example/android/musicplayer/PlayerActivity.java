package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        ImageButton forward = (ImageButton) findViewById(R.id.forwardButton);
        ImageButton backward = (ImageButton) findViewById(R.id.backButton);
        ImageButton pausePlay = (ImageButton) findViewById(R.id.pausePlay);
        // Set a click listener on that View
        /**
         * Onclick, forward imageButton goes to Player activity with new song info. Dependant on more info.
         */
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@Link FamilyActivity}
                Intent forwardIntent = new Intent(PlayerActivity.this, PlayerActivity.class);
                startActivity(forwardIntent);
            }
        });
        /**
         * Onclick, backward imageButton goes to Player activity with new song info Dependant on more info.
        */
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backwardIntent = new Intent(PlayerActivity.this, PlayerActivity.class);
                startActivity(backwardIntent);

            }
        });
        /**
         * Onclick, pasue/play imageButton pauses or starts song. Dependant on more info.
         */
        pausePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pausePlayIntent = new Intent(PlayerActivity.this, PlayerActivity.class);
                startActivity(pausePlayIntent);

            }
        });
    }
}
