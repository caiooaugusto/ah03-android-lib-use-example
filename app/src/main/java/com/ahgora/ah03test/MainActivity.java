package com.ahgora.ah03test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;

import com.ahgora.ah03.Api;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();
    }

    private void test() {
        HashMap<String, String> cadastroFuncionario = Api.cadastroFuncionario("matricula","codEmpresa");

        Log.d("Ah03 Api", cadastroFuncionario.get("error"));
        Log.d("Ah03 Api", cadastroFuncionario.get("matricula"));
        Log.d("Ah03 Api", cadastroFuncionario.get("res"));

        HashMap<String, String> batidaFuncionario = Api.batidaFuncionario();

        Log.d("Ah03 Api", batidaFuncionario.get("error"));
        Log.d("Ah03 Api", batidaFuncionario.get("matricula"));
        Log.d("Ah03 Api", batidaFuncionario.get("res"));

        HashMap<String, String> cargaDados = Api.cargaDados();

        Log.d("Ah03 Api", cargaDados.get("error"));
    }
}

