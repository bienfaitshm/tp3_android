package com.example.partie_2_1_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frame_container, new FirstFragment());
        fragmentTransaction.commit();
//        Button btnGo  = (Button) findViewById(R.id.button2);
//        btnGo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//             FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//
//             if(actualId == R.id.first_fr){
//                  fragmentTransaction.replace(R.id.frame_container, new FirstFragment());
//                   fragmentTransaction.commit();
//                 btnGo.setText("Aller au premier Fragment");
//                  actualId = R.id.second_fr;
//              }else{
//                 fragmentTransaction.replace(R.id.frame_container, new SecondFragment());
//                  fragmentTransaction.commit();
//                 btnGo.setText("Aller au second Fragment");
//                   actualId = R.id.first_fr;
//             }
//            }
//        });


    }
}