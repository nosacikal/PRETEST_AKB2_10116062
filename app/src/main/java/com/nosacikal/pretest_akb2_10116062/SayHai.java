package com.nosacikal.pretest_akb2_10116062;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SayHai extends AppCompatActivity {

    TextView beres;
    String nama;
    String key = "nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hai);

        beres = findViewById(R.id.beres);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(key);
        beres.setText("Beres! Sekarang "+ nama +" udah bisa ngecek penggunaan HP mu tiap hari buat bantu "+ nama +" ngatur waktu :)");
    }
}
