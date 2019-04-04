package com.nosacikal.pretest_akb2_10116062;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginCode extends AppCompatActivity {

    private Button btnmasuk;
    private TextView deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);

        btnmasuk = findViewById(R.id.btnmasuk);
        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigatorBiodata();
            }
        });

        boldText();
    }

    public void navigatorBiodata() {
        Intent intent = new Intent(this, Biodata.class);
        startActivity(intent);
    }

    public void boldText() {
        deskripsi = findViewById(R.id.deskripsi);
        String teks = "Dengan menekan tombol masuk berarti Anda menyetujui Ketentuan Pengguna dan Kebijakan Data Kami";
        SpannableString spannableString = new SpannableString(teks);

        StyleSpan bold1 = new StyleSpan(Typeface.BOLD);
        StyleSpan bold2 = new StyleSpan(Typeface.BOLD);

        spannableString.setSpan(bold1, 52, 71, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(bold2, 75, 90, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        deskripsi.setText(spannableString);
    }
}
