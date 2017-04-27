package mx.edu.utng.login;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class QuestionActivity extends AppCompatActivity {
    private TextView tvManual;
    private ImageView ivManual;
    private ImageView ivBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        tvManual = (TextView)findViewById(R.id.tv_manual);
        ivManual = (ImageView)findViewById(R.id.iv_user);
        ivBack = (ImageView)findViewById(R.id.iv_back);


        ivManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/0B3lCxoD-nTw7N2lLbFZjcTNwME0/view");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuestionActivity.this, AccessActivity.class));
                finish();

            }
        });



    }


}
