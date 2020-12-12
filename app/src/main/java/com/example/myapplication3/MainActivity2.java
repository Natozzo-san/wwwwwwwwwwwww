package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button but;
    TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        but = findViewById(R.id.button);
        tw = findViewById(R.id.textView);
        int r = getIntent().getIntExtra("kek",0);
        tw.setText(Integer.toString(r));
        but.setOnClickListener(v->{
            Toast.makeText(this,"Закрываю вторую активность", Toast.LENGTH_SHORT).show();
            Intent i = new Intent();
            i.putExtra("kek2","coffee");
            setResult(RESULT_OK, i);
            finish();
        });
    }
}