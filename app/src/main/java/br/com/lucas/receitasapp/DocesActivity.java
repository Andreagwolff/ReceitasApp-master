package br.com.lucas.receitasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DocesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doces);
    }

    public void telaBolo (View view){
        Intent intentBolo = new Intent(getApplicationContext(), BoloActivity.class);
        startActivity(intentBolo);
    }

    public void telaCookie (View view){
        Intent intentCookie = new Intent(getApplicationContext(), CookieActivity.class);
        startActivity(intentCookie);
    }

    public void telaSorvete (View view){
        Intent intentSorvete = new Intent(getApplicationContext(), SorveteActivity.class);
        startActivity(intentSorvete);
    }

    public void telaTorta (View view){
        Intent intentTorta = new Intent(getApplicationContext(), TortaActivity.class);
        startActivity(intentTorta);
    }

    public void telaQuindim (View view){
        Intent intentQuindim = new Intent(getApplicationContext(), QuindimActivity.class);
        startActivity(intentQuindim);
    }
}
