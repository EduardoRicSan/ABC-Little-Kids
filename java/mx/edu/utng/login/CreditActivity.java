package mx.edu.utng.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CreditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);
        RecyclerView rvList = (RecyclerView)findViewById(R.id.rv_list);
        rvList.setHasFixedSize(true);

        LinearLayoutManager manager= new LinearLayoutManager(this);
        rvList.setLayoutManager(manager);

        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Eduardo", "21 years old","lalo19jers.azul@gmail.com", R.drawable.lalo,R.color.color1));
        people.add(new Person("Felipe", "20 years old","relipex57@gmail.com", R.drawable.pandita,R.color.color2));
        people.add(new Person("Adela", "21 years old", "cris.adela29@gmail.com", R.drawable.adela, R.color.color3));


        RecyclerView.Adapter adapter = new RVAdapter(people);
        rvList.setAdapter(adapter);

    }
    }

