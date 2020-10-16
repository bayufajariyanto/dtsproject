package com.bayufajariyanto.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HalamanDepan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_depan);
    }

    public void clickTambah(View view) {
        Intent i = new Intent(this, TambahData.class);
        startActivity(i);
    }
    public void clickLihat(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
