package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button but;
    TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = findViewById(R.id.button2);
        tw = findViewById(R.id.hello);
        but.setOnClickListener(v->{
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra("kek", 34);
            startActivityForResult(i, 1);
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                tw.setText(data.getStringExtra("kek2"));
                break;
        }
    }
}