package com.example.a38_nguyenxuanloc_day06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText tk;
    EditText mk;
    Button btndn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tk=findViewById(R.id.idname);
        mk=findViewById(R.id.idpass);
        btndn=findViewById(R.id.btndn);
        btndn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),NewNote.class);
                //intent.putExtra("")
                startActivity(intent);

            }
        });
    }
}
