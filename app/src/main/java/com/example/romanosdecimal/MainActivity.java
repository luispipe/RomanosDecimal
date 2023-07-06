package com.example.romanosdecimal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView romano;
    TextView decimal;
    Button i;
    Button v;
    Button x;
    Button l;
    Button c;
    Button d;
    Button m;
    Button calcular;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        romano= findViewById(R.id.tvRomanos);
        decimal= findViewById(R.id.tvDecimal);
        i=findViewById(R.id.buttonI);
        v=findViewById(R.id.buttonV);
        x=findViewById(R.id.buttonX);
        l=findViewById(R.id.buttonL);
        c=findViewById(R.id.buttonC);
        d=findViewById(R.id.buttonD);
        m=findViewById(R.id.buttonM);
        calcular=findViewById(R.id.buttonCalcular);
        reset=findViewById(R.id.buttonReset);

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String actual= romano.getText().toString();
                romano.setText(actual+"I");
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String actual= romano.getText().toString();
                romano.setText(actual+"V");
            }
        });

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String actual= romano.getText().toString();
                romano.setText(actual+"X");
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String actual= romano.getText().toString();
                romano.setText(actual+"L");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String actual= romano.getText().toString();
                romano.setText(actual+"C");
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String actual= romano.getText().toString();
                romano.setText(actual+"D");
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String actual= romano.getText().toString();
                romano.setText(actual+"M");
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado=0;
                String numero= romano.getText().toString();
                for(int i=0; i< numero.length(); i++){
                    if(i == numero.length()-1){
                        resultado+= romanoValor((char)numero.charAt(i));
                    }else{
                        if((romanoValor((char)numero.charAt(i))) < romanoValor((char)numero.charAt(i+1))){
                            resultado-= romanoValor((char)numero.charAt(i));
                        }else{
                            resultado+= romanoValor((char)numero.charAt(i));
                        }
                    }
                }
                decimal.setText(resultado+"");
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decimal.setText("");
                romano.setText("");
            }
        });

    }

    public static int romanoValor(char roman){
        int resultado;
        switch(roman){
            case 'I':
                resultado=1;
                break;
            case 'V':
                resultado=5;
                break;
            case 'X':
                resultado=10;
                break;
            case 'L':
                resultado=50;
                break;
            case 'C':
                resultado=100;
                break;
            case 'D':
                resultado=500;
                break;
            case 'M':
                resultado=1000;
                break;
            default:
                resultado=0;
        }
        return resultado;
    }

    /*Hacer una función que valide que un número romano es correcto

    ejemplo: XXXX --> Mal , XXL -->Mal , CCCCC-->Mal
             XXX --> Bien , XL -->Bien

    MCMXCIX --> Mal
    MIM     --> Bien
    * */
    public boolean valorIngresadoCorrecto(String valorRomano){

        return true;

    }


}