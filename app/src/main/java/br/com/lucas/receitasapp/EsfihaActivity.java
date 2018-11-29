package br.com.lucas.receitasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EsfihaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfiha);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
