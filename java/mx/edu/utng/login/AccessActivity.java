package mx.edu.utng.login;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AccessActivity extends AppCompatActivity {
    private Button btLogout;
    private Session session;
    private ImageView ivSetting;
    private ImageView ivEntrar;
    private ImageView ivPregunta;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access);

        ivSetting = (ImageView)findViewById(R.id.iv_setting);
        ivEntrar = (ImageView)findViewById(R.id.iv_entrar);
        ivPregunta = (ImageView)findViewById(R.id.iv_pregunta);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        //add sound of principal main
        loader = soundPool.load(this, R.raw.sound_app, 1);




        //Session Start
        session = new Session(this);
        if (!session.loggedin()){
            logout();
        }
        btLogout = (Button)findViewById(R.id.bt_logout);
        btLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout();
                stopSound();
               mediaPlayer.stop();

            }
        });

        ivSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AccessActivity.this, SettingActivity.class));
            }
        });
        ivEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AccessActivity.this, MenuActivity.class));
            }
        });

        ivPregunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AccessActivity.this, QuestionActivity.class));
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





    private void logout() {
        session.setLoggedin(false);
        startActivity(new Intent(AccessActivity.this, LoginActivity.class));
    }
}
