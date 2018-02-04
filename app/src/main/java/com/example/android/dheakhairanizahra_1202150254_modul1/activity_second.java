package com.example.android.dheakhairanizahra_1202150254_modul1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class activity_second extends AppCompatActivity {

    TextView tTempat;
    TextView tMenu;
    TextView tJumlah;
    TextView tHarga;

    String tempat, menu;
    int jumlah, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tTempat = (TextView) findViewById(R.id.tTempat);
        tMenu = (TextView) findViewById(R.id.tMenu);
        tJumlah = (TextView) findViewById(R.id.tJumlah);
        tHarga = (TextView) findViewById(R.id.tHarga);

        Intent intent = getIntent();
        tempat = intent.getStringExtra("Restoran");
        menu = intent.getStringExtra("Menu");
        harga = intent.getIntExtra("Harga", 0);
        jumlah = intent.getIntExtra("Jumlah",0);

        tTempat.setText(tempat);
        tMenu.setText(menu);
        tJumlah.setText("" + jumlah);
        tHarga.setText("" + harga);

        if (harga > 65000) {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Jangan Makan Malam Disini. Uang Kamu Tidak Cukup :(", Toast.LENGTH_LONG);
            toast.show();

        } else {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Nah! Makan Malam Disini Aja :)", Toast.LENGTH_LONG);
            toast.show();

        }

    }
}