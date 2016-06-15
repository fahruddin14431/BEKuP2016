package com.fahruddin.bekupdua;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Fahruddin on 6/15/2016.
 */
public class Kalkulator extends AppCompatActivity {

    EditText nil1, nil2;
    TextView hasil;
    Button proses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_kalkulator);

        nil1 = (EditText) findViewById(R.id.editText1);
        nil2 = (EditText) findViewById(R.id.editText2);

        hasil = (TextView) findViewById(R.id.textView14);

        proses = (Button) findViewById(R.id.button2);

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilai1 = Integer.parseInt(nil1.getText().toString());
                int nilai2 = Integer.parseInt(nil2.getText().toString());

                int keluaran = nilai1 + nilai2;

                hasil.setText(String.valueOf(keluaran));
            }
        });
    }


}
