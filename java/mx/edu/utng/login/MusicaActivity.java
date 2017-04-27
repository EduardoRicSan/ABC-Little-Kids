package mx.edu.utng.login;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MusicaActivity extends AppCompatActivity {

    Button button_stop;
    Button button_play;
    private String STREAM_URL ="http://91.121.202.224:7266/;stream.mp3";
    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);

        button_stop=(Button) findViewById(R.id.btnStop);
        button_play=(Button) findViewById(R.id.btnPlay);

        mPlayer=new MediaPlayer();

        button_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                try{
                    mPlayer.reset();
                    mPlayer.setDataSource(STREAM_URL);
                    mPlayer.prepareAsync();

                    mPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
                        @Override
                        public void onPrepared(MediaPlayer mp){
                            mp.start();

                        }
                    });

                } catch (IOException e){
                    e.printStackTrace();

                }

            }

        });

        button_stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mPlayer.stop();

            }

        });
    }
}
