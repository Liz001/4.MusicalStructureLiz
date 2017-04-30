package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Liz on 26/04/2017.
 */

public class TrackActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        // Find the View that shows the album category
        TextView album = (TextView) findViewById(R.id.album);

        // Set a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(TrackActivity.this, AlbumActivity.class);
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
                Intent artistIntent = new Intent(TrackActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });


        //Find the view which shows the playlist category.
        TextView playlist = (TextView) findViewById(R.id.playlist);

        //Set a click listener on that view.
        playlist.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be called when the playlist view is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(TrackActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });


    }
}
