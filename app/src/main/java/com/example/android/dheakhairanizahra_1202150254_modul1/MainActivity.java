package com.example.android.DHEAKHAIRANIZAHRA_1202150254_MODUL1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.android.dheakhairanizahra_1202150254_modul1.R;
import com.example.android.dheakhairanizahra_1202150254_modul1.activity_second;

public class MainActivity extends AppCompatActivity {

    EditText Jumlah;
    EditText Makan;

    String Restoran, Menu;
    int Porsi, Harga;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Makan = (EditText)findViewById(R.id.makan);
        Jumlah = (EditText)findViewById(R.id.jumlah);
    }

    public void eatbus(View view){
        Intent intent  = new Intent(this, activity_second.class);
        Restoran = "eatbus";
        Menu = Makan.getText().toString();
        Porsi = Integer.parseInt(Jumlah.getText().toString());
        Harga = 50000*Porsi;

        Log.d("total harga","Rp."+Harga);

        intent.putExtra("Restoran",Restoran);
        intent.putExtra("Menu",Menu);
        intent.putExtra("Jumlah",Porsi);
        intent.putExtra("Harga",Harga);
        startActivity(intent);
    }

    public void abnormal(View view) {
        Intent intent  = new Intent(this, activity_second.class);
        Restoran = "abnormal";
        Menu = Makan.getText().toString();
        Porsi = Integer.parseInt(Jumlah.getText().toString());
        Harga = 30000*Porsi;

        intent.putExtra("Restoran",Restoran);
        intent.putExtra("Menu",Menu);
        intent.putExtra("Jumlah",Porsi);
        intent.putExtra("Harga",Harga);
        startActivity(intent);

    }

}
