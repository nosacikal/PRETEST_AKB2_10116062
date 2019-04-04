package com.nosacikal.pretest_akb2_10116062;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
* Nosa Cikal Daputra
* 10116062
* AKB-2 (IF-2)
*
* */

public class MainActivity extends AppCompatActivity {

    Button btnmulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmulai = findViewById(R.id.btnmulai);
        btnmulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigatorLoginCode();
            }
        });
    }

    public void navigatorLoginCode() {
        Intent intent = new Intent(this, LoginCode.class);
        startActivity(intent);
    }
}
