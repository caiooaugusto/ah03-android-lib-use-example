package com.ahgora.ah03test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ahgora.ah03.Api;
import com.ahgora.ah03.Response;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();
    }

    private void test() {
        Gson gson = new Gson();

        String cadastroFuncionario = Api.cadastroFuncionario("0606060606");
        Response cadastroFuncionarioResponse = gson.fromJson(cadastroFuncionario, Response.class);
        Log.d("Ah03 Api => cadastroFuncionarioResponse Error:", Boolean.toString(cadastroFuncionarioResponse.getError()));
        Log.d("Ah03 Api => cadastroFuncionarioResponse Matricula:", cadastroFuncionarioResponse.getMatricula());
        Log.d("Ah03 Api => cadastroFuncionarioResponse Biometria:", cadastroFuncionarioResponse.getBio());

        String batidaFuncionario = Api.batidaFuncionario();
        Response batidaFuncionarioResponse = gson.fromJson(batidaFuncionario, Response.class);
        Log.d("Ah03 Api => batidaFuncionarioResponse Error:", Boolean.toString(batidaFuncionarioResponse.getError()));
        Log.d("Ah03 Api => batidaFuncionarioResponse Matricula:", batidaFuncionarioResponse.getMatricula());

        String configura = Api.configura("0606060606", "hash da biometria");
        Response configuraResponse = gson.fromJson(configura, Response.class);
        Log.d("Ah03 Api => configuraResponse Error:", Boolean.toString(configuraResponse.getError()));
    }
}

