package com.example.itentendemo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
ListView listView ;
List<Model> model = new ArrayList<Model>(){};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadArray();
        ListAdapter adapter = new ListAdapter(this,model,this);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
    void LoadArray(){
        model.add(new Model(
           "Ahmet",
           "Kara",
           "mahab@gmail.com",
           "517620",
           "99451426",
           "Trabzon",
           R.drawable.gb,
           "17.05.1997",
           "Samsun Turkey"
        ));
        model.add(new Model(
                "Julien",
                "Rossert",
                "julien@gmail.com",
                "594268",
                "426854",
                "Toulouse",
                R.drawable.mb,
                "17.05.1998",
                "Paris France"
        ));
        model.add(new Model(
                "Joseph",
                "John",
                "joseph@gmail.com",
                "90594268",
                "9426854",
                "New York",
                R.drawable.ib,
                "1.05.1990",
                "New York City"
        ));
        model.add(new Model(
                "Said",
                "Yasir",
                "said@gmail.com",
                "78965421",
                "252515452",
                "Riad",
                R.drawable.kb,
                "7.01.1995",
                "Medina City"
        ));
        model.add(new Model(
                "Khan",
                "Ali",
                "ali@gmail.com",
                "901633712",
                "656586535",
                "Islamabad",
                R.drawable.hb,
                "3.10.2000",
                "Islamabad City"
        ));
        model.add(new Model(
                "Foussena",
                "Aladji",
                "foussena@gmail.com",
                "0315403",
                "94264747",
                "Abuja",
                R.drawable.lb,
                "17.09.1975",
                "Lagos Nigeria"
        ));
        model.add(new Model(
                "Sun",
                "Kachi",
                "sun@gmail.com",
                "858564231",
                "123654789",
                "Pekin",
                R.drawable.nb,
                "27.11.1965",
                "Pekin City "
        ));
        model.add(new Model(
                "Bud",
                "Chiva",
                "bud@gmail.com",
                "5456985424",
                "321654854",
                "New Dehli",
                R.drawable.jb,
                "15.12.1994",
                "New Dehli City"
        ));
    }
}
