package org.iesch.practica1.loginpassword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.iesch.practica1.loginpassword.databinding.ActivityDetailBinding;
import org.iesch.practica1.loginpassword.databinding.ActivityMainBinding;

public class ActivityDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_detail);
        Bundle extras = getIntent().getExtras();
        String email = extras.getString("email");
        String passwd = extras.getString("passwd");

        ActivityDetailBinding building = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(building.getRoot());
        getSupportActionBar().setTitle(email);


        building.txtBienvenida.setText("Hola, " + email);


    }
}