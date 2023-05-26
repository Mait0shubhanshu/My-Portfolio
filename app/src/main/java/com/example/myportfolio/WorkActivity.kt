package com.example.myportfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView

class WorkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work)

         val videoView : VideoView = findViewById(R.id.videoView);  //casting to VideoView is not Strictly required above API level 26
         videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video); //set the path of the video that we need to use in our VideoView
         videoView.start();  //start() method of the VideoView class will start the video to play

//        val MediaController = mediaController MediaController(this);
//        //link mediaController to videoView
//        mediaController.(videoView);
//        //allow mediaController to control our videoView
//        videoView.setMediaController(mediaController);
//        videoView.start();

        val mediaController = MediaController(this);

        // sets the anchor view
        // anchor view for the videoView
        mediaController.setAnchorView(videoView)

        // sets the media player to the videoView
        mediaController.setMediaPlayer(videoView)

        // sets the media controller to the videoView
        videoView.setMediaController(mediaController);

        // starts the video
        videoView.start();

    }
}