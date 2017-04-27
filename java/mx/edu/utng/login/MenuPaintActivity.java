package mx.edu.utng.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuPaintActivity extends AppCompatActivity {
    private Button btPaint;
    private Button btRuleta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_paint);

        btPaint=(Button)findViewById(R.id.bt_paint);
        btRuleta=(Button)findViewById(R.id.bt_ruleta);

        btPaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuPaintActivity.this, PaintActivity.class));
            }
        });
        btRuleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuPaintActivity.this, ColorActivity.class));
            }
        });

    }
}
