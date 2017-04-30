package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Liz on 26/04/2017.
 */

public class PlaylistActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Find the View that shows the album category
        TextView album = (TextView) findViewById(R.id.album);

        // Set a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(PlaylistActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });


        //Find the view which shows the artist category.
        TextView artist = (TextView) findViewById(R.id.artist);

        //Set a click listener on that view.
        artist.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be called when the artist view is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(PlaylistActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });


        //Find the view which shows the track category.
        TextView track = (TextView) findViewById(R.id.track);

        //Set a click listener on that view.
        track.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be called when the track view is clicked on.
            @Override
            public void onClick(View view) {
                Intent trackIntent = new Intent(PlaylistActivity.this, TrackActivity.class);
                startActivity(trackIntent);
            }

        });

    }

}
