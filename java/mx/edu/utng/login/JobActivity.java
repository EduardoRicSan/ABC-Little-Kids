package mx.edu.utng.login;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class JobActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivArtist;
    private ImageView ivCook;
    private ImageView ivDentist;
    private ImageView ivDoctor;
    private ImageView ivElectrician;
    private ImageView ivFireman;
    private ImageView ivMechanic;
    private ImageView ivMusician;
    private ImageView ivNurse;
    private ImageView ivPoliceman;
    private ImageView ivScientist;
    private ImageView ivTeacher;
    private ImageView ivVeterinary;
    private ImageView ivPaint;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);
        ivArtist = (ImageView)findViewById(R.id.iv_artist);
        ivCook = (ImageView)findViewById(R.id.iv_cook);
        ivDoctor = (ImageView)findViewById(R.id.iv_doctor);
        ivDentist = (ImageView)findViewById(R.id.iv_dentist);
        ivElectrician = (ImageView)findViewById(R.id.iv_electrician);
        ivFireman = (ImageView)findViewById(R.id.iv_fireman);
        ivMechanic = (ImageView)findViewById(R.id.iv_mechanic);
        ivMusician = (ImageView)findViewById(R.id.iv_musician);
        ivNurse = (ImageView)findViewById(R.id.iv_nurse);
        ivPoliceman = (ImageView)findViewById(R.id.iv_policeman);
        ivScientist = (ImageView)findViewById(R.id.iv_scientist);
        ivTeacher = (ImageView)findViewById(R.id.iv_teacher);
        ivVeterinary = (ImageView)findViewById(R.id.iv_veterinary);
        ivPaint = (ImageView)findViewById(R.id.iv_paint);

        ivArtist.setOnClickListener(this);
        ivCook.setOnClickListener(this);
        ivDoctor.setOnClickListener(this);
        ivDentist.setOnClickListener(this);
        ivElectrician.setOnClickListener(this);
        ivFireman.setOnClickListener(this);
        ivMechanic.setOnClickListener(this);
        ivMusician.setOnClickListener(this);
        ivNurse.setOnClickListener(this);
        ivPoliceman.setOnClickListener(this);
        ivScientist.setOnClickListener(this);
        ivTeacher.setOnClickListener(this);
        ivVeterinary.setOnClickListener(this);
        ivPaint.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        loader = soundPool.load(this, R.raw.doctor, 1);
        mediaPlayer = new MediaPlayer();



    }

    public void artistSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.artist);
                mediaPlayer.start();


            }
        };
        playThread.start();
    }


    public void chefSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.chef);
                mediaPlayer.start();


            }
        };
        playThread.start();
    }
    public void dentistSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.dentist);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
    public void doctorSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.doctor);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
    public void elecSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.electrician);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }

    public void fireSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.fireman);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
    public void mechaSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.mechanic);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
    public void musiSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.musician);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
    public void nurseSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.nurse);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
    public void painterSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.painter);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
    public void policeSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.policeman);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
    public void scienSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.scientist);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
    public void teachSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.teacher);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
    public void veteSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(JobActivity.this, R.raw.veterinary);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }












    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_artist:
                artistSound();
                break;
            case R.id.iv_cook:
                chefSound();
                break;
            case R.id.iv_dentist:
                dentistSound();
                break;
            case R.id.iv_doctor:
                doctorSound();
                break;
            case R.id.iv_electrician:
                elecSound();
                break;
            case R.id.iv_fireman:
                fireSound();
                break;
            case R.id.iv_mechanic:
                mechaSound();
                break;
            case R.id.iv_musician:
                musiSound();
                break;
            case R.id.iv_nurse:
                nurseSound();
                break;
            case R.id.iv_paint:
                painterSound();
                break;
            case R.id.iv_policeman:
                policeSound();
                break;
            case R.id.iv_scientist:
                scienSound();
                break;
            case R.id.iv_teacher:
                teachSound();
                break;
            case R.id.iv_veterinary:
               veteSound();
                break;
            default:
                break;

        }
    }
}