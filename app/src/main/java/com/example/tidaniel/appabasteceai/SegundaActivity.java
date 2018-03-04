package com.example.tidaniel.appabasteceai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// nova programação quando mudar a tela
// programa os eventos associados a essa tela
// NAO ESQUECER DE FAZER O BRINDING DOS BOTOES!!!!

public class SegundaActivity extends AppCompatActivity {

    Button btn;
    final static int OK = 1; // quando for um, o sistema vai identificar que é OK

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);


        binding();

        // cria o setOnClick, automaticamente ele vai da o Override
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setResult(OK); // cria a constante la encima para saber o que é esse 1
                finish(); // fecha a tela
            }
        });

    }

    private void binding() {
        // PARA CRIAR O BINDING: seleciona vai em: refactor, extract, method
        btn.findViewById(R.id.botaoOk);
    }
}
