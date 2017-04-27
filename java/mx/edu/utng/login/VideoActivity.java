package mx.edu.utng.login;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    private Button btPlay;
    private VideoView video;
    private MediaController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        btPlay = (Button)findViewById(R.id.bt_play);

        video = (VideoView)findViewById(R.id.vv_video);
        controller = new MediaController(this);

    }

    public void videoPlay(View v){
        String videoPath = "android.resource://mx.edu.utng.login/"+R.raw.jobs;
        Uri uri = Uri.parse(videoPath);
        video.setVideoURI(uri);
        video.setMediaController(controller);
        controller.setAnchorView(video);
        video.start();
    }
}
