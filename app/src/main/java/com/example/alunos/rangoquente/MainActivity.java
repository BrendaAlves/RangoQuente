package com.example.alunos.rangoquente;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void discarClick (View v){
        //intenção de telefonar
        Intent numero = new Intent(Intent.ACTION_DIAL);
        //passo o número de telefone para URI (similar a URL)
        Uri uri = Uri.parse("tel://03133335678");
        //uri = numero
        numero.setData(uri);
        //abre teclado do telefone com o número do telefone
        startActivity(numero);
    }
    public void internetClick (View v){
        Intent site = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("http://www.gaiaservices.ga");
        site.setData(uri);
        startActivity(site);
    }
    public void compartilharClick (View v){
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Olá Mãe!");
        share.setType("text/plain");
        startActivity(share);

    }
}
