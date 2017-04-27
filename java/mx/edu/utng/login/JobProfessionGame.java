package mx.edu.utng.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class JobProfessionGame extends AppCompatActivity {
    private Button btVideo;
    private Button btActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_profession_game);

        btVideo=(Button)findViewById(R.id.bt_video);
        btActivity=(Button)findViewById(R.id.bt_job_activity);

        btVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JobProfessionGame.this, VideoActivity.class));
            }
        });

        btActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JobProfessionGame.this, JobActivity.class));
            }
        });
    }
}
