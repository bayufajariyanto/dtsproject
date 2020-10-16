package com.bayufajariyanto.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bayufajariyanto.project.db.TaskContract;
import com.bayufajariyanto.project.db.TaskDbHelper;

public class TambahData extends AppCompatActivity {
    private TaskDbHelper mHelper;
    private EditText edtText;
    private Button btnSimpan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);

        edtText = findViewById(R.id.edt_tugas);
        btnSimpan = findViewById(R.id.btn_simpan);
    }

    public void btnSimpan(View view) {
        String hasil = edtText.getText().toString();

        Toast.makeText(this,"Berhasil di simpan", Toast.LENGTH_SHORT);
    }
}