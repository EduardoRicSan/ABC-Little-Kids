package mx.edu.utng.login;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etName;
    private EditText etPass;
    private Button btLogin;
    private Button btRegister;
    private BDHelper db;
    private Session session;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        soundPool = new SoundPool(8,AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        loader = soundPool.load(this, R.raw.doctor, 1);
        mediaPlayer = new MediaPlayer();



        db= new BDHelper(this);
        session = new Session(this);
        etName = (EditText)findViewById(R.id.et_name);
        etPass = (EditText)findViewById(R.id.et_pass);
        btLogin= (Button)findViewById(R.id.bt_login);
        btRegister = (Button)findViewById(R.id.bt_register);

        btLogin.setOnClickListener(this);
        btRegister.setOnClickListener(this);

        if (session.loggedin()){
            startActivity(new Intent(LoginActivity.this, AccessActivity.class));
            finish();
        }
    }


    public void sound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer = MediaPlayer.create(LoginActivity.this, R.raw.sound_app);
                mediaPlayer.start();


            }
        };
        playThread.start();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_login:
                login();

                break;
            case  R.id.bt_register:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;

            default:

                break;

        }
    }

    public void login(){
        String email = etName.getText().toString();
        String pass = etPass.getText().toString();

        if(db.getUser(email,pass)){
            session.setLoggedin(true);
            sound();
            startActivity(new Intent(LoginActivity.this, AccessActivity.class));
            finish();
        }else{
            Toast.makeText(getApplicationContext(), "Wrong name/password",Toast.LENGTH_SHORT).show();
        }

    }
}
