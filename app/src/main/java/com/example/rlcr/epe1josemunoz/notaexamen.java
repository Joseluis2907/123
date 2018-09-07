package com.example.rlcr.epe1josemunoz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class notaexamen extends AppCompatActivity {
    EditText etnotapre;
    EditText etexamen;
    Button button2;
    TextView tvresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notaexamen);
        this.etnotapre=(EditText)findViewById(R.id.etnotapre);
        this.etexamen=(EditText)findViewById(R.id.etexamen);
        this.button2=(Button)findViewById(R.id.button2);
        this.tvresultado=(TextView)findViewById(R.id.tvresultado);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String presentacion = etnotapre.getText().toString();
                String examen = etexamen.getText().toString();

                int notapresentacion=Integer.parseInt(presentacion);
                int notaexamen=Integer.parseInt(examen);

                double nota1=notapresentacion*0.7;
                double nota2=notaexamen*0.3;

                double suma=nota1+nota2;

                tvresultado.setText(String.format("%.1f", suma/10));

            }
        });
    }
}
