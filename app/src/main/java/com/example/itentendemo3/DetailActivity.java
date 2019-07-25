package com.example.itentendemo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
TextView titleView;
TextView detailView;
String title;
String details;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        titleView = (TextView) findViewById(R.id.txt);
        detailView = (TextView) findViewById(R.id.txtt);
        img = (ImageView) findViewById(R.id.img);

        Bundle bundle = getIntent().getExtras();
         String name =  bundle.getString("NAME") ;
         String surname = bundle.getString("SURNAME");
         String email = bundle.getString("EMAIL");
         String phone = bundle.getString("PHONE");
         String tc = bundle.getString("TC");
         String birthPlace = bundle.getString("BIRTHPLACE");
         String birthDate = bundle.getString("BIRTHDATE");
         String adress = bundle.getString("ADDRESS");
         int image = bundle.getInt("IMAGE");

        title = "I'm " + name + " " + surname ;
        details = "Name : " + name +"\nSurname : " + surname +"\nEmail : " + email +"\nPhone : " + phone
          +"\nTc : " + tc +"\nBirth Place : " + birthPlace +"\nBirth Date : " + birthDate +"\nAddress : " + adress ;
        titleView.setText(title);
        detailView.setText(details);
        img.setImageResource(image);
    }
}
