package com.example.aplicacion5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Button b1;
    EditText txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1= (TextView) findViewById(R.id.textView1);
        b1 = (Button) findViewById(R.id.button);
        txt1 = (EditText) findViewById(R.id.edittext1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar();
            }
        });
    }

    public void enviar(){
        Intent intento = new Intent(MainActivity.this,Activity2.class);
        intento.putExtra("valor",txt1.getText().toString());
        startActivity(intento);
    }
}
