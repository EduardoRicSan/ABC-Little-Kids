package mx.edu.utng.login;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class AbecedarioInglesActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageButton ibLetterA;
    private ImageButton ibLetterB;
    private ImageButton ibLetterC;
    private ImageButton ibLetterD;
    private ImageButton ibLetterE;
    private ImageButton ibLetterF;
    private ImageButton ibLetterG;
    private ImageButton ibLetterH;
    private ImageButton ibLetterI;
    private ImageButton ibLetterJ;
    private ImageButton ibLetterK;
    private ImageButton ibLetterL;
    private ImageButton ibLetterM;
    private ImageButton ibLetterN;
    private ImageButton ibLetterO;
    private ImageButton ibLetterP;
    private ImageButton ibLetterQ;
    private ImageButton ibLetterR;
    private ImageButton ibLetterS;
    private ImageButton ibLetterT;
    private ImageButton ibLetterU;
    private ImageButton ibLetterV;
    private ImageButton ibLetterW;
    private ImageButton ibLetterX;
    private ImageButton ibLetterY;
    private ImageButton ibLetterZ;


    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abecedario_ingles);
        ibLetterA=(ImageButton)findViewById(R.id.ib_lettera);
        ibLetterB=(ImageButton)findViewById(R.id.ib_letterb);
        ibLetterC=(ImageButton)findViewById(R.id.ib_letterc);
        ibLetterD=(ImageButton)findViewById(R.id.ib_letterd);
        ibLetterE=(ImageButton)findViewById(R.id.ib_lettere);
        ibLetterF=(ImageButton)findViewById(R.id.ib_letterf);
        ibLetterG=(ImageButton)findViewById(R.id.ib_letterg);
        ibLetterH=(ImageButton)findViewById(R.id.ib_letterh);
        ibLetterI=(ImageButton)findViewById(R.id.ib_letteri);
        ibLetterJ=(ImageButton)findViewById(R.id.ib_letterj);
        ibLetterK=(ImageButton)findViewById(R.id.ib_letterk);
        ibLetterL=(ImageButton)findViewById(R.id.ib_letterl);
        ibLetterM=(ImageButton)findViewById(R.id.ib_letterm);
        ibLetterN=(ImageButton)findViewById(R.id.ib_lettern);
        ibLetterO=(ImageButton)findViewById(R.id.ib_lettero);
        ibLetterP=(ImageButton)findViewById(R.id.ib_letterp);
        ibLetterQ=(ImageButton)findViewById(R.id.ib_letterq);
        ibLetterR=(ImageButton)findViewById(R.id.ib_letterr);
        ibLetterS=(ImageButton)findViewById(R.id.ib_letters);
        ibLetterT=(ImageButton)findViewById(R.id.ib_lettert);
        ibLetterU=(ImageButton)findViewById(R.id.ib_letteru);
        ibLetterV=(ImageButton)findViewById(R.id.ib_letterv);
        ibLetterW=(ImageButton)findViewById(R.id.ib_letterw);
        ibLetterX=(ImageButton)findViewById(R.id.ib_letterx);
        ibLetterY=(ImageButton)findViewById(R.id.ib_lettery);
        ibLetterZ=(ImageButton)findViewById(R.id.ib_letterz);


        ibLetterA.setOnClickListener(this);
        ibLetterB.setOnClickListener(this);
        ibLetterC.setOnClickListener(this);
        ibLetterD.setOnClickListener(this);
        ibLetterE.setOnClickListener(this);
        ibLetterF.setOnClickListener(this);
        ibLetterG.setOnClickListener(this);
        ibLetterH.setOnClickListener(this);
        ibLetterI.setOnClickListener(this);
        ibLetterJ.setOnClickListener(this);
        ibLetterK.setOnClickListener(this);
        ibLetterL.setOnClickListener(this);
        ibLetterM.setOnClickListener(this);
        ibLetterN.setOnClickListener(this);
        ibLetterO.setOnClickListener(this);
        ibLetterP.setOnClickListener(this);
        ibLetterQ.setOnClickListener(this);
        ibLetterR.setOnClickListener(this);
        ibLetterS.setOnClickListener(this);
        ibLetterT.setOnClickListener(this);
        ibLetterU.setOnClickListener(this);
        ibLetterV.setOnClickListener(this);
        ibLetterW.setOnClickListener(this);
        ibLetterX.setOnClickListener(this);
        ibLetterY.setOnClickListener(this);
        ibLetterZ.setOnClickListener(this);

        soundPool= new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);

        mediaPlayer = new MediaPlayer();
    }
    private void letterA(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_a_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterB(){

        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_b_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterC(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_c_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterD(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_d_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterE(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_e_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterF(){

        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_f_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterG(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_g_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterH(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_h_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterI(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_i_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterJ(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_j_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterK(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_k_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterL(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_l_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterM(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_m_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterN(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_n_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letterO(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_o_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterP(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_p_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterQ(){
        mediaPlayer.stop();
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_q_sound);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
    private void letterR(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_r_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterS(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_s_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterT(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_t_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterU(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_u_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterV(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_v_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterW(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_w_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterX(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_x_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterY(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_y_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void letterZ(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioInglesActivity.this, R.raw.letter_z_sound);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case  R.id.ib_lettera:
                letterA();
                break;
            case  R.id.ib_letterb:
                letterB();
                break;
            case  R.id.ib_letterc:
                letterC();
                break;
            case  R.id.ib_letterd:
                letterD();
                break;
            case  R.id.ib_lettere:
                letterE();
                break;
            case  R.id.ib_letterf:
                letterF();
                break;
            case  R.id.ib_letterg:
                letterG();
                break;
            case  R.id.ib_letterh:
                letterH();
                break;
            case  R.id.ib_letteri:
                letterI();
                break;
            case  R.id.ib_letterj:
                letterJ();
                break;
            case  R.id.ib_letterk:
                letterK();
                break;
            case  R.id.ib_letterl:
                letterL();
                break;
            case  R.id.ib_letterm:
                letterM();
                break;
            case  R.id.ib_lettern:
                letterN();
                break;
            case  R.id.ib_lettero:
                letterO();
                break;
            case  R.id.ib_letterp:
                letterP();
                break;
            case  R.id.ib_letterq:
                letterQ();
                break;
            case  R.id.ib_letterr:
                letterR();
                break;
            case  R.id.ib_letters:
                letterS();
                break;
            case  R.id.ib_lettert:
                letterT();
                break;
            case  R.id.ib_letteru:
                letterU();
                break;
            case  R.id.ib_letterv:
                letterV();
                break;
            case  R.id.ib_letterw:
                letterW();
                break;
            case  R.id.ib_letterx:
                letterX();
                break;
            case  R.id.ib_lettery:
               letterY();
                break;
            case  R.id.ib_letterz:
                letterZ();
                break;
            default:
                break;
        }
    }
}
