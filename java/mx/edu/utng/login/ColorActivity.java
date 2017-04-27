package mx.edu.utng.login;

import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

public class ColorActivity extends AppCompatActivity {
    private CircleMenu circleMenu;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        circleMenu = (CircleMenu) findViewById(R.id.cm_main);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.paleta, R.drawable.paleta);
        circleMenu.addSubMenu(Color.parseColor("#FFEF3B"), R.drawable.amarillo)
                .addSubMenu(Color.parseColor("#BBDEFE"), R.drawable.azul)
                .addSubMenu(Color.parseColor("#FFFFFF"), R.drawable.blanco)
                .addSubMenu(Color.parseColor("#440000"), R.drawable.cafe)
                .addSubMenu(Color.parseColor("#990099"), R.drawable.morado)
                .addSubMenu(Color.parseColor("#FF9933"), R.drawable.naranja)
                .addSubMenu(Color.parseColor("#000000"), R.drawable.negro)
                .addSubMenu(Color.parseColor("#FF0000"), R.drawable.rojo)
                .addSubMenu(Color.parseColor("#FF00CC"), R.drawable.rosa)
                .addSubMenu(Color.parseColor("#00CC00"), R.drawable.verde);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        loader = soundPool.load(this, R.raw.red, 1);
        mediaPlayer = new MediaPlayer();


        circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {

                                                 @Override
                                                 public void onMenuSelected(int index) {
                                                     switch (index) {

                                                         case 0:
                                                             yellowSound();
                                                             Toast.makeText(ColorActivity.this, "YELLOW - AMARILLO", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 1:
                                                             blueSound();
                                                             Toast.makeText(ColorActivity.this, "BLUE - AZUL", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 2:
                                                             whiteSound();
                                                             Toast.makeText(ColorActivity.this, "WHITE - BLANCO", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 3:
                                                             brownSound();
                                                             Toast.makeText(ColorActivity.this, "BROWN - CAFE", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 4:
                                                             purpleSound();
                                                             Toast.makeText(ColorActivity.this, "PURPLE - PURPURA", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 5:
                                                             orangeSound();
                                                             Toast.makeText(ColorActivity.this, "ORANGE - NARANJA", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 6:
                                                             blackSound();
                                                             Toast.makeText(ColorActivity.this, "BLACK - NEGRO", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 7:
                                                             redSound();
                                                             Toast.makeText(ColorActivity.this, "RED - ROJO", Toast.LENGTH_SHORT).show();
                                                             break;



                                                     }
                                                 }
                                             }

        );



        circleMenu.setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

                                                     @Override
                                                     public void onMenuOpened() {
                                                         ruletaSound();
                                                         Toast.makeText(ColorActivity.this, "Menu Opend", Toast.LENGTH_SHORT).show();
                                                     }

                                                     @Override
                                                     public void onMenuClosed() {
                                                         Toast.makeText(ColorActivity.this, "Menu Closed", Toast.LENGTH_SHORT).show();
                                                     }
                                                 }
        );

    }


    public void redSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorActivity.this, R.raw.red);
                mediaPlayer.start();


            }
        };
        playThread.start();
    }

    public void blueSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorActivity.this, R.raw.blue);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
    public void blackSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorActivity.this, R.raw.black);
                mediaPlayer.start();


            }
        };
        playThread.start();
    }

    public void brownSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorActivity.this, R.raw.brown);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }

    public void orangeSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorActivity.this, R.raw.orange);
                mediaPlayer.start();


            }
        };
        playThread.start();
    }

    public void purpleSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorActivity.this, R.raw.purple);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }

    public void ruletaSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorActivity.this, R.raw.ruleta);
                mediaPlayer.start();


            }
        };
        playThread.start();
    }

    public void whiteSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorActivity.this, R.raw.white);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
    public void yellowSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorActivity.this, R.raw.yellow);
                mediaPlayer.start();


            }
        };
        playThread.start();
    }




    @Override
    public void onBackPressed() {
        if (circleMenu.isOpened())
            circleMenu.closeMenu();
        else
            finish();
    }


}
