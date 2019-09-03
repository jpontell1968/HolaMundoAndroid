package com.example.aplicacion5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        t2 = (TextView) findViewById(R.id.textView2);

        Intent intento = this.getIntent();
        Bundle extra = intento.getExtras();
        String cadena = extra.getString("valor");
        t2.setText(cadena);

    }
}
