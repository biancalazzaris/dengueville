package br.com.dengueville;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirTelefone(View novaView) {
        String numeroTelefone = getString(R.string.numero_telefone);
        Intent intencao = new Intent(Intent.ACTION_DIAL);
        intencao.setData(Uri.parse(numeroTelefone));
        startActivity(intencao);
    }
    public void abrirTelaSintoma(View novaView) {
        Intent intencao = new Intent(this,SintomasActivity.class);
        startActivity(intencao);
    }

    public void voltarTelaMain(View novaView) {
        Intent intencao = new Intent(this,MainActivity.class);
        startActivity(intencao);
    }
}