package com.example.th3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openLayout(View view){
        int id = view.getId();
        Intent intent;
        if (id == R.id.show) {
            intent = new Intent(this, showActivity.class);
            startActivity(intent);

        } else if (id == R.id.group) {
            intent = new Intent(this, groupActivity.class);
            startActivity(intent);
        } else if (id == R.id.thesis) {
            intent = new Intent(this, thesisActivity.class);
            startActivity(intent);
        } else if (id == R.id.exit) {
            finish();
        }
    }
}