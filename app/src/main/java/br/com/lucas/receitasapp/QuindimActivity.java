package br.com.lucas.receitasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class QuindimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quindim);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
