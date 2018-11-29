package br.com.lucas.receitasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SalgadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salgado);
    }

    public void telaEsfiha (View view){
        Intent intentEsfiha = new Intent(getApplicationContext(), EsfihaActivity.class);
        startActivity(intentEsfiha);
    }

    public void telaEnroladinho (View view){
        Intent intentEnroladinho = new Intent(getApplicationContext(), EnroladinhoActivity.class);
        startActivity(intentEnroladinho);
    }

    public void telaCoxinha (View view){
        Intent intentCoxinha = new Intent(getApplicationContext(), CoxinhaActivity.class);
        startActivity(intentCoxinha);
    }

    public void telaBife (View view){
        Intent intentBife = new Intent(getApplicationContext(), BifeActivity.class);
        startActivity(intentBife);
    }

    public void telaPernil (View view){
        Intent intentPernil= new Intent(getApplicationContext(), PernilActivity.class);
        startActivity(intentPernil);
    }
}
