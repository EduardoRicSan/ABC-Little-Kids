package mx.edu.utng.login;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jesús Eduardo Rico Sandoval on 01/02/2017.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {

    List<Person> people;
    public RVAdapter(List<Person> people) {
        this.people=people;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        PersonViewHolder holder= new PersonViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.tvPersonName.setText(people.get(position).getName());
        holder.txPersonAge.setText(people.get(position).getAge());
        holder.tvPersonMail.setText(people.get(position).getEmail());
        holder.ivPersonPhoto.setImageResource(people.get(position).getPhotoId());
        holder.cvPerson.setBackgroundResource(people.get(position).getCardColor());

    }

    @Override
    public int getItemCount() {
        return people.size();
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder{
        CardView cvPerson;
        TextView tvPersonName;
        TextView txPersonAge;
        ImageView ivPersonPhoto;
        TextView tvPersonMail;

        PersonViewHolder(View v) {
            super(v);
            cvPerson = (CardView)v.findViewById(R.id.cv_data);
            tvPersonName = (TextView)v.findViewById(R.id.tv_person_name);
            txPersonAge = (TextView)v.findViewById(R.id.tv_person_age);
            ivPersonPhoto = (ImageView)v.findViewById(R.id.iv_person_photo);
            tvPersonMail = (TextView)v.findViewById(R.id.tv_email);
        }
    }
}
