package com.example.btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText edname,edpass;
    Button btndn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edname=findViewById(R.id.idname);
        edpass=findViewById(R.id.idpass);
        btndn=findViewById(R.id.btndn);
        btndn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pattern pattern = Pattern.compile("^[a-zA-Z0_9]{6,}+$");
                Matcher matcher = pattern.matcher(edpass.getText());
                if(matcher.find()) {
                    Intent intent = new Intent(getBaseContext(), NewNote.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getBaseContext(),"Nhập kiểu pass k đúng",Toast.LENGTH_LONG);
                }
            }
        });
    }
}
