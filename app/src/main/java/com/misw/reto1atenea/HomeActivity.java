package com.misw.reto1atenea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button categorias;
    Button consejos;
    Button estadisticas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        categorias= findViewById(R.id.button);
        Intent categoria= new Intent(this,RegisterActivity.class);
        categorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(categoria);
            }
        });

        consejos= findViewById(R.id.button3);
        Intent consejo= new Intent(this,TipsActivity.class);
        consejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(consejo);
            }
        });


        estadisticas= findViewById(R.id.button4);
        Intent estadistica= new Intent(this,StatisticsActivity.class);
        estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(estadistica);
            }
        });

    }
}