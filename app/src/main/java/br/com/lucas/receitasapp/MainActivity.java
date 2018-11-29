package br.com.lucas.receitasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void telaDoce (View view){
        Intent intentDoce = new Intent(getApplicationContext(), DocesActivity.class);
        startActivity(intentDoce);
    }

    public void telaSalgado (View view){
        Intent intentSalgado = new Intent(getApplicationContext(), SalgadoActivity.class);
        startActivity(intentSalgado);
    }

    public void telaBebida (View view){
        Intent intentBebida = new Intent(getApplicationContext(), BebidasActivity.class);
        startActivity(intentBebida);
    }
}
