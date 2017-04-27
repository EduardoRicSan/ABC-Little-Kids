package mx.edu.utng.login;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class NumeroActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btNumero0;
    private ImageButton btNumero1;
    private ImageButton btNumero2;
    private ImageButton btNumero3;
    private ImageButton btNumero4;
    private ImageButton btNumero5;
    private ImageButton btNumero6;
    private ImageButton btNumero7;
    private ImageButton btNumero8;
    private ImageButton btNumero9;
    private ImageButton btNumero10;
    private ImageButton btNumero20;
    private ImageButton btNumero30;
    private ImageButton btNumero40;
    private ImageButton btNumero50;
    private ImageButton btNumero60;
    private ImageButton btNumero70;
    private ImageButton btNumero80;
    private ImageButton btNumero90;
    private ImageButton btNumero100;


    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero);

        btNumero0 = (ImageButton) findViewById(R.id.ib_numero0);
        btNumero1 = (ImageButton) findViewById(R.id.ib_numero1);
        btNumero2 = (ImageButton) findViewById(R.id.ib_numero2);
        btNumero3 = (ImageButton) findViewById(R.id.ib_numero3);
        btNumero4 = (ImageButton) findViewById(R.id.ib_numero4);
        btNumero5 = (ImageButton) findViewById(R.id.ib_numero5);
        btNumero6 = (ImageButton) findViewById(R.id.ib_numero6);
        btNumero7 = (ImageButton) findViewById(R.id.ib_numero7);
        btNumero8 = (ImageButton) findViewById(R.id.ib_numero8);
        btNumero9 = (ImageButton) findViewById(R.id.ib_numero9);
        btNumero10 = (ImageButton) findViewById(R.id.ib_numero10);
        btNumero20 = (ImageButton) findViewById(R.id.ib_numero20);
        btNumero30 = (ImageButton) findViewById(R.id.ib_numero30);
        btNumero40 = (ImageButton) findViewById(R.id.ib_numero40);
        btNumero50 = (ImageButton) findViewById(R.id.ib_numero50);
        btNumero60 = (ImageButton) findViewById(R.id.ib_numero60);
        btNumero70 = (ImageButton) findViewById(R.id.ib_numero70);
        btNumero80 = (ImageButton) findViewById(R.id.ib_numero80);
        btNumero90 = (ImageButton) findViewById(R.id.ib_numero90);
        btNumero100 = (ImageButton) findViewById(R.id.ib_numero100);


        btNumero0.setOnClickListener(this);
        btNumero1.setOnClickListener(this);
        btNumero2.setOnClickListener(this);
        btNumero3.setOnClickListener(this);
        btNumero4.setOnClickListener(this);
        btNumero5.setOnClickListener(this);
        btNumero6.setOnClickListener(this);
        btNumero7.setOnClickListener(this);
        btNumero8.setOnClickListener(this);
        btNumero9.setOnClickListener(this);
        btNumero10.setOnClickListener(this);
        btNumero20.setOnClickListener(this);
        btNumero30.setOnClickListener(this);
        btNumero40.setOnClickListener(this);
        btNumero50.setOnClickListener(this);
        btNumero60.setOnClickListener(this);
        btNumero70.setOnClickListener(this);
        btNumero80.setOnClickListener(this);
        btNumero90.setOnClickListener(this);
        btNumero100.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        loader = soundPool.load(this, R.raw.one, 1);

        mediaPlayer = new MediaPlayer();
    }


    private void numeroCero() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.zero);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroUno() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.one);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroDos() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.two);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroTres() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.three);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroCuatro() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.four);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroCinco() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.five);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroSeis() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.six);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroSiete() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.seven);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroOcho() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.eight);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroNueve() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.nine);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroDiez() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.ten);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroVeinte() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.twenty);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroTreinta() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.thirty);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroCuarenta() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.fourty);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroCincuenta() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.fifty);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroSesenta() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.sixty);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroSetenta() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.seventy);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroOchenta() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.eigty);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroNoventa() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.ninty);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void numeroCien() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(NumeroActivity.this, R.raw.onehundred);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ib_numero0:
                numeroCero();
                break;
            case R.id.ib_numero1:
                numeroUno();
                break;
            case R.id.ib_numero2:
                numeroDos();
                break;
            case R.id.ib_numero3:
                numeroTres();
                break;
            case R.id.ib_numero4:
                numeroCuatro();
                break;
            case R.id.ib_numero5:
                numeroCinco();
                break;
            case R.id.ib_numero6:
                numeroSeis();
                break;
            case R.id.ib_numero7:
                numeroSiete();
                break;
            case R.id.ib_numero8:
                numeroOcho();
                break;
            case R.id.ib_numero9:
                numeroNueve();
                break;
            case R.id.ib_numero10:
                numeroDiez();
                break;
            case R.id.ib_numero20:
                numeroVeinte();
                break;
            case R.id.ib_numero30:
                numeroTreinta();
                break;
            case R.id.ib_numero40:
                numeroCuarenta();
                break;
            case R.id.ib_numero50:
                numeroCincuenta();
                break;
            case R.id.ib_numero60:
                numeroSesenta();
                break;
            case R.id.ib_numero70:
                numeroSetenta();
                break;
            case R.id.ib_numero80:
                numeroOchenta();
                break;
            case R.id.ib_numero90:
                numeroNoventa();
                break;
            case R.id.ib_numero100:
                numeroCien();
                break;

        }
    }
}