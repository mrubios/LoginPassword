package org.iesch.practica1.loginpassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import org.iesch.practica1.loginpassword.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding building = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(building.getRoot());
        getSupportActionBar().setTitle("Iniciar Sesión");

        Button btn = building.btnEnter;

        building.btnEnter.setOnClickListener(v->{
            String email = String.valueOf(building.txtEmail.getText());
            String passwd = String.valueOf(building.txtPasswd.getText());

            if (email.isEmpty()||passwd.isEmpty())
            {
                Toast.makeText(this, "No puedes dejar ningún campo en blanco", Toast.LENGTH_LONG).show();
            }
            else{
            Intent irDetalle = new Intent(this, ActivityDetail.class);
            irDetalle.putExtra("email", email);
            irDetalle.putExtra("passwd", passwd);
            startActivity(irDetalle);
            }
                });

    }


}