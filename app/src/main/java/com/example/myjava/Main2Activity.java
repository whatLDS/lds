package com.example.myjava;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvShow=(TextView)findViewById(R.id.textView);

        Intent intent=getIntent();
        String message=intent.getStringExtra("result");
        tvShow.setText(message);
    }
}
