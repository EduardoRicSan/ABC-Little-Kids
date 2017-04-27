package mx.edu.utng.login;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import mx.edu.utng.login.R;

public class SettingActivity extends AppCompatActivity {
    private ImageView ivSetting;
    private ImageView ivSound;
    private ImageView ivOn;
    private ImageView ivOff;
    private ImageView ivFb;
    private ImageView ivCredits;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        ivSetting = (ImageView)findViewById(R.id.iv_setting);
        ivSound = (ImageView)findViewById(R.id.iv_sound);
        ivOn = (ImageView)findViewById(R.id.iv_on);
        ivOff = (ImageView)findViewById(R.id.iv_off);
        ivFb = (ImageView)findViewById(R.id.iv_fb);
        ivCredits = (ImageView)findViewById(R.id.iv_credits);


        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        //add sound of principal main
        loader = soundPool.load(this, R.raw.sound_app, 1);
        //mediaPlayer = new MediaPlayer();



        ivOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound();

            }
        });
        ivOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopSound();
                mediaPlayer.stop();
            }
        });
        ivFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.facebook.com/RedSoft-1712891482060833/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });
        ivCredits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingActivity.this, CreditActivity.class));
            }
        });



    }

    public void stopSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();


            }
        };
        playThread.start();
    }
    public void playSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer = MediaPlayer.create(SettingActivity.this, R.raw.sound_app);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }




}
