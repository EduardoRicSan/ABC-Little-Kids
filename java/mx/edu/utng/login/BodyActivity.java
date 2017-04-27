package mx.edu.utng.login;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BodyActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivBody;
    private Button btEyes;
    private Button btHead;
    private Button btHair;
    private Button btShoulder;
    private Button btArm;
    private Button btHand;
    private Button btLeg;
    private Button btFoot;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);
        initComponents();


    }

    private void initComponents() {

        ivBody = (ImageView)findViewById(R.id.iv_body);
        btArm = (Button)findViewById(R.id.bt_arm);
        btEyes = (Button)findViewById(R.id.bt_eyes);
        btFoot = (Button)findViewById(R.id.bt_foot);
        btHair = (Button)findViewById(R.id.bt_hair);
        btHand = (Button)findViewById(R.id.bt_hand);
        btHead = (Button)findViewById(R.id.bt_head);
        btLeg = (Button)findViewById(R.id.bt_leg);
        btShoulder = (Button)findViewById(R.id.bt_shoulder);


        btShoulder.setOnClickListener(this);
        btLeg.setOnClickListener(this);
        btHead.setOnClickListener(this);
        btHand.setOnClickListener(this);
        btArm.setOnClickListener(this);
        btEyes.setOnClickListener(this);
        btFoot.setOnClickListener(this);
        btHair.setOnClickListener(this);
        ivBody.setOnClickListener(this);


        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        loader = soundPool.load(this, R.raw.body, 1);
        mediaPlayer = new MediaPlayer();




    }

    @Override
    public void onClick(View v) {

        Vibrator vib = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        switch (v.getId()){
            case R.id.bt_arm:
                vib.vibrate(1500);
                armSound();
                break;
            case R.id.bt_eyes:
                vib.vibrate(1500);
                eyesSound();
                break;
            case R.id.bt_foot:
                vib.vibrate(1500);
                footSound();
                break;
            case R.id.bt_hair:
                vib.vibrate(1500);
                hairSound();
                break;
            case R.id.bt_hand:
                vib.vibrate(1500);
                handSound();
                break;
            case R.id.bt_head:
                vib.vibrate(1500);
                headSound();
                break;
            case R.id.bt_leg:
                vib.vibrate(1500);
                legSound();
                break;
            case R.id.bt_shoulder:
                vib.vibrate(1500);
                shouSound();
                break;
            case R.id.iv_body:
                vib.vibrate(1500);
                bodySound();
                break;

            default:
                break;
        }

    }

    public void bodySound() {
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(BodyActivity.this, R.raw.body);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    public void armSound() {
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(BodyActivity.this, R.raw.brazo);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    public void eyesSound() {
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(BodyActivity.this, R.raw.ojos);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    public void footSound() {
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(BodyActivity.this, R.raw.pie);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    public void hairSound() {
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(BodyActivity.this, R.raw.cabello);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    public void handSound() {
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(BodyActivity.this, R.raw.mano);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    public void headSound() {
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(BodyActivity.this, R.raw.cabeza);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    public void legSound() {
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(BodyActivity.this, R.raw.pierna);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    public void shouSound() {
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(BodyActivity.this, R.raw.hombro);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
}

