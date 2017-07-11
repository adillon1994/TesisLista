package com.alberto.tesisjunta;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.VideoView;

public class VideoGrande extends AppCompatActivity {

    public Intent ir;
    VideoView videoG;
    int camara;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_grande);

        ActionBar flecha= getSupportActionBar();
        flecha.setDisplayHomeAsUpEnabled(true);

        Bundle extra = getIntent().getExtras();
        camara = extra.getInt("camara");
        progressBar= (ProgressBar)findViewById(R.id.myprogressbar);
        progressBar.setVisibility(View.VISIBLE);
    }

    protected void onResume() {
        super.onResume();


        switch (camara) {
            case 1: {
                videoG = (VideoView) findViewById(R.id.video);
                final Uri uri1 = Uri.parse("RTSP://192.168.198.136:5554/vs");
                videoG.setVideoURI(uri1);
                videoG.requestFocus();
                videoG.start();
            }
            case 2: {
                videoG = (VideoView) findViewById(R.id.video);
                final Uri uri2 = Uri.parse("RTSP://192.168.198.136:5554/vs");
                videoG.setVideoURI(uri2);
                videoG.requestFocus();
                videoG.start();
            }
            case 3: {
                videoG = (VideoView) findViewById(R.id.video);
                final Uri uri3 = Uri.parse("RTSP://192.168.198.136:5554/vs");
                videoG.setVideoURI(uri3);
                videoG.requestFocus();
                videoG.start();
            }
            case 4: {
                videoG = (VideoView) findViewById(R.id.video);
                final Uri uri4 = Uri.parse("RTSP://192.168.198.127:5554/vs");
                videoG.setVideoURI(uri4);
                videoG.requestFocus();
                videoG.start();
            }
            case 5: {
                videoG = (VideoView) findViewById(R.id.video);
                Uri uri5 = Uri.parse("RTSP://192.168.198.127:5554/vs");
                videoG.setVideoURI(uri5);
                videoG.requestFocus();
                videoG.start();

            }

        }
        videoG.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
                mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                        progressBar.setVisibility(View.GONE);
                        mp.start();
                    }
                });
            }
        });


    }
}
