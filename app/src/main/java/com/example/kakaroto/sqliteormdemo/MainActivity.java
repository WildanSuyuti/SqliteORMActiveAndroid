package com.example.kakaroto.sqliteormdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    private EditText etMenu, etHarga, etStok;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMenu = (EditText) findViewById(R.id.et_menu);
        etHarga = (EditText) findViewById(R.id.et_harga);
        etStok = (EditText) findViewById(R.id.et_stok);
        tvResult = (TextView) findViewById(R.id.tv_result);


    }

    public void save(View vew) {
/*        Makanan makanan = new Makanan(etMenu.getText().toString(),
                Integer.valueOf(etHarga.getText().toString()),
                Integer.valueOf(etStok.getText().toString()));*/

        Makanan makanan = new Makanan();
        makanan.setMenu(etMenu.getText().toString());
        makanan.setHarga(Integer.valueOf(etHarga.getText().toString()));
        makanan.setStok(Integer.valueOf(etStok.getText().toString()));
        makanan.save();

        Log.d(TAG, "onlick success : " + makanan.toString());

        for (Makanan makanan1 : Makanan.getAll()) {
            tvResult.append(makanan1.toString());
        }
    }


}
