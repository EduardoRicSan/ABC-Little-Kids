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

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView ivNumeros;
    private ImageView ivAbecedario;
    private ImageView ivMusica;
    private ImageView ivColores;
    private ImageView ivJob;
    private ImageView ivTic;
    private ImageView ivMemorama;
    private ImageView ivEntrada;
    private ImageView ivBody;
    private Button btNumeros;
    private Button btAbecedario;
    private Button btMusica;
    private Button btColores;
    private Button btJob;
    private Button btTic;
    private Button btMemorama;
    private Button btEntrada;
    private Button btBody;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initComponents();


    }

    private void initComponents() {
        ivAbecedario = (ImageView)findViewById(R.id.iv_abecedario);
        ivNumeros = (ImageView)findViewById(R.id.iv_numeros);
        ivColores = (ImageView)findViewById(R.id.iv_colores);
        ivMusica = (ImageView)findViewById(R.id.iv_musica);
        ivJob = (ImageView)findViewById(R.id.iv_trabajo);
        ivTic = (ImageView)findViewById(R.id.iv_tic);
        ivMemorama = (ImageView)findViewById(R.id.iv_memorama);
        ivEntrada = (ImageView)findViewById(R.id.iv_entrada);
        ivBody = (ImageView)findViewById(R.id.iv_the_body);



        btAbecedario = (Button)findViewById(R.id.bt_abedecario);
        btBody = (Button)findViewById(R.id.bt_body);
        btColores = (Button)findViewById(R.id.bt_dibujar);
        btJob = (Button)findViewById(R.id.bt_jobs);
        btMemorama = (Button)findViewById(R.id.bt_memorama);
        btMusica = (Button)findViewById(R.id.bt_musica);
        btNumeros = (Button)findViewById(R.id.bt_numeros);
        btTic = (Button)findViewById(R.id.bt_tictac);

        ivMemorama.setOnClickListener(this);
        ivNumeros.setOnClickListener(this);
        ivColores.setOnClickListener(this);
        ivMusica.setOnClickListener(this);
        ivJob.setOnClickListener(this);
        ivTic.setOnClickListener(this);
        ivAbecedario.setOnClickListener(this);
        ivBody.setOnClickListener(this);


        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        loader = soundPool.load(this, R.raw.menu, 1);
        mediaPlayer = new MediaPlayer();




    }

    public void menuSound(){
        Thread playThread = new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(MenuActivity.this, R.raw.menu);
                mediaPlayer.start();


            }
        };
        playThread.start();
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_memorama:
                menuSound();
               startActivity(new Intent(MenuActivity.this, MemoramaActivity.class));
                break;
            case R.id.iv_abecedario:
                menuSound();
               startActivity(new Intent(MenuActivity.this, AbecedarioInglesActivity.class));
                break;
            case R.id.iv_colores:
                menuSound();
                startActivity(new Intent(MenuActivity.this, MenuPaintActivity.class));
                break;
            case R.id.iv_musica:
                menuSound();
                startActivity(new Intent(MenuActivity.this, MusicaActivity.class));
                break;
            case R.id.iv_numeros:
                menuSound();
                startActivity(new Intent(MenuActivity.this, NumeroActivity.class));
                break;
            case R.id.iv_tic:
                menuSound();
                startActivity(new Intent(MenuActivity.this, TicTacToeActivity.class));
                break;
            case R.id.iv_trabajo:
                menuSound();
                startActivity(new Intent(MenuActivity.this, JobProfessionGame.class));
                break;
            case R.id.iv_the_body:
                menuSound();
                startActivity(new Intent(MenuActivity.this, BodyActivity.class));
                break;
            default:
                break;

        }

    }
}
