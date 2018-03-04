package com.example.tidaniel.appabasteceai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {

    //cria primeiramente o Brinding do botao, para mudar de pagina

    Button btn;
    final static int Segunda_tela = 1; // voce esta chamando a outra tela(segunda tela no caso)

    // cria uma constante para lembrar do "1" que esta em startActivityForResult(itn, 1);
    // para nao gerar confusao

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        binding();
        // cria o setOnClick, automaticamente ele vai da o Override
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // intent é o mecanismo que serve para te levar a outra actitivy(trocar)
                Intent itn = new Intent(getApplicationContext(),SegundaActivity.class);

                //da o start para a segunda tela ser chamada
                // requestCode serve para saber de onde foi chamada determinada tela

                startActivityForResult(itn, Segunda_tela); // voce esta chamando a outra tela(segunda tela no caso)
            }
        });
    }


    //
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void binding() {
        // seleciona vai em: refactor, extract, method
        btn = findViewById(R.id.botaoProximo);
    }
}
