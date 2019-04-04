package com.nosacikal.pretest_akb2_10116062;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Biodata extends AppCompatActivity {

    private Button btnselanjutnya;
    private EditText txtnama;
    private String key = "nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        btnselanjutnya = findViewById(R.id.btnselanjutnya);
        txtnama = findViewById(R.id.txtnama);

        btnselanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigatorSayHai();
            }
        });
    }

    public void navigatorSayHai() {
        String nama = txtnama.getText().toString();

        if (nama.length() > 0) {
            Intent intent = new Intent(this, SayHai.class);
            intent.putExtra(key, nama);
            startActivity(intent);
        } else {
            Toast.makeText(getApplication(), "Nama Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        }
    }
}
