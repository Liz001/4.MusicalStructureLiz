package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Liz on 26/04/2017.
 */

public class ArtistActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);


        // Find the View that shows the album category
        TextView album = (TextView) findViewById(R.id.album);

        // Set a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(ArtistActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });


        //Find the view which shows the playlist category.
        TextView playlist = (TextView) findViewById(R.id.playlist);

        //Set a click listener on that view.
        playlist.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be called when the playlist view is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(ArtistActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });


        //Find the view which shows the track category.
        TextView track = (TextView) findViewById(R.id.track);

        //Set a click listener on that view.
        track.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be called when the track view is clicked on.
            @Override
            public void onClick(View view) {
                Intent trackIntent = new Intent(ArtistActivity.this, TrackActivity.class);
                startActivity(trackIntent);
            }

        });

    }

}
