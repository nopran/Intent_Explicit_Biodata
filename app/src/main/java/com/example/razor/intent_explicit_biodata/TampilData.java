package com.example.razor.intent_explicit_biodata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TampilData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampildata);

        Bundle b = getIntent().getExtras();
        //membuat obyek dari widget textview
        TextView nama = (TextView) findViewById(R.id.namaValue);
        TextView umur = (TextView) findViewById(R.id.umurValue);
        TextView jeniskelamin = (TextView) findViewById(R.id.jeniskelaminValue);
        //menset nilai dari widget textview
        nama.setText(b.getCharSequence("nama"));
        umur.setText(b.getCharSequence("umur"));
        jeniskelamin.setText(b.getCharSequence("jeniskelamin"));

    }
}
