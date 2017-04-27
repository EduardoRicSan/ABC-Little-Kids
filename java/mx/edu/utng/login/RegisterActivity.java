package mx.edu.utng.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity  implements View.OnClickListener{
    private EditText etName;
    private EditText etPass;
    private TextView tvBackLogin;
    private Button btRegister;
    private BDHelper db;
    private Spinner spGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);




        db= new BDHelper(this);
        etName = (EditText)findViewById(R.id.et_name);
        etPass = (EditText)findViewById(R.id.et_pass);
        spGender = (Spinner) findViewById(R.id.sp_gender);
        tvBackLogin= (TextView) findViewById(R.id.tv_back_login);
        btRegister = (Button)findViewById(R.id.bt_register);
        tvBackLogin.setOnClickListener(this);
        btRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_register:
                register();
                break;
            case  R.id.tv_back_login:
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();
                break;
            default:

                break;

        }
    }

    public void register(){
        String name = etName.getText().toString();
        String gen = spGender.getSelectedItem().toString();
        String pass = etPass.getText().toString();


        if (name.isEmpty()) {
            displayToast("name is empty");
            onStop();
        }
        if (gen.isEmpty()){
            displayToast("gender is empty");
            onStop();
        }
        if (pass.isEmpty()){
          displayToast("pass is empty");
            onStop();
        }else{
            db.addUser(name,gen,pass);
            displayToast("User registered");
            finish();
        }
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

}
