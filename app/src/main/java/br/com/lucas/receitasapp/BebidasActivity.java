package br.com.lucas.receitasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BebidasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);
    }

    public void telaTequila (View view){
        Intent intentTequila = new Intent(getApplicationContext(), TequilaActivity.class);
        startActivity(intentTequila);
    }

    public void telaMargarita (View view){
        Intent intentMargarita = new Intent(getApplicationContext(), MargaritaActivity.class);
        startActivity(intentMargarita);
    }

    public void telaMojito (View view){
        Intent intentMojito = new Intent(getApplicationContext(), MojitoActivity.class);
        startActivity(intentMojito);
    }

    public void telaCaipirinha (View view){
        Intent intentCaipirinha = new Intent(getApplicationContext(), CaipirinhaActivity.class);
        startActivity(intentCaipirinha);
    }


}
