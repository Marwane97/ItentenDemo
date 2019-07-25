package com.example.itentendemo3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Date;
import java.util.List;

public class ListAdapter extends android.widget.ArrayAdapter<Model> {
    private List<Model> model;
    private  Context context;
    private ImageView image;
    private TextView name;
    private LinearLayout layout;
    private Activity activity;

   // private TextView details;


    public ListAdapter(Context context,List<Model> model,Activity activity) {
        super(context, R.layout.list_item, model);
        this.context = context;
        this.model = model;
        this.activity = activity;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item,null,true);
         image = (ImageView) view.findViewById(R.id.image);
         name = (TextView) view.findViewById(R.id.name);
         layout = (LinearLayout) view.findViewById(R.id.linear);

         image.setImageResource(model.get(position).getImage());
         name.setText(model.get(position).getName());

         final String surname = model.get(position).getSurname();
         final String email = model.get(position).getEmail();
         final String phone = model.get(position).getPhone();
         final String tc = model.get(position).getTc();
         final String adress = model.get(position).getAdress();
         final String birthDate = model.get(position).getBirthDate();
         final String birthPlace = model.get(position).getBirthPlace();
         final int imageId = model.get(position).getImage();
         final String nom = model.get(position).getName();


        layout.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(context,DetailActivity.class);
                 intent.putExtra("NAME",nom);
                 intent.putExtra("SURNAME",surname);
                 intent.putExtra("EMAIL",email);
                 intent.putExtra("PHONE",phone);
                 intent.putExtra("ADDRESS",adress);
                 intent.putExtra("BIRTHDATE",birthDate);
                 intent.putExtra("BIRTHPLACE",birthPlace);
                 intent.putExtra("TC",tc);
                 intent.putExtra("IMAGE",imageId);

                 activity.startActivity(intent);
             }
         });
        return view;
    }
}
