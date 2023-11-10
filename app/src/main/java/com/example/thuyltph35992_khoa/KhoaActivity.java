package com.example.thuyltph35992_khoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.material.textfield.TextInputLayout;

public class KhoaActivity extends AppCompatActivity {
TextInputLayout ed_tenkhoa;
Button btn_add,btn_update,btn_delete;
ListView lv_khoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khoa);
        ed_tenkhoa=findViewById(R.id.ed_tenkhoa);
        btn_add=findViewById(R.id.btn_add);
        btn_update = findViewById(R.id.btn_update);
        btn_delete=findViewById(R.id.btn_delete);
        lv_khoa=findViewById(R.id.lv_khoa);

    }
}