package com.example.razor.intent_explicit_biodata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    RadioGroup genderRadioGroup;
    EditText nama;
    EditText umur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAllViewsId();

        button.setOnClickListener(this);
    }

    private void findAllViewsId() {
        button = (Button) findViewById(R.id.kirimdata);
        nama = (EditText) findViewById(R.id.nama);
        umur = (EditText) findViewById(R.id.umur);
        genderRadioGroup = (RadioGroup) findViewById(R.id.jeniskelamin);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), TampilData.class);
        //Membuat obyek bundle
        Bundle b = new Bundle();

        //Menyisipkan tipe data String ke dalam obyek bundle
        b.putString("nama", nama.getText().toString());
        b.putString("umur", umur.getText().toString());
        int id = genderRadioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(id);
        b.putString("jeniskelamin", radioButton.getText().toString());

        //Menambahkan bundle intent
        intent.putExtras(b);

        //memulai Activity kedua
        startActivity(intent);
    }
}
