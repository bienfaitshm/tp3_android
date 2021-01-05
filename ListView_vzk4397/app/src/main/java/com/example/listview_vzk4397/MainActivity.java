package com.example.listview_vzk4397;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.listView);
        UserAccount van = new UserAccount("van zengu","Etudiant bac+3 info");
        UserAccount Bienfait = new UserAccount("Bienfait shomari","Etudiant bac+3 info");
        UserAccount tom = new UserAccount("Teila ramazani","Etudiant bac+3 info");
        UserAccount jerry = new UserAccount("Bienfait shomari","Etudiant bac+3 info");
        UserAccount donald = new UserAccount("Julia Kabeya","Etudiant bac+3 info", false);
        UserAccount patric = new UserAccount("Patric Mukala","Professeur", false);

        UserAccount [] users = {van, Bienfait, tom, jerry, donald, patric};


        // android.R.layout.simple_list_item_1 is a constant predefined layout of Android.
        // used to create a ListView with simple ListItem (Only one TextView).

        ArrayAdapter<UserAccount> arrayAdapter
                = new ArrayAdapter<UserAccount>(this, android.R.layout.simple_list_item_1 , users);

        listView.setAdapter(arrayAdapter);
    }


}