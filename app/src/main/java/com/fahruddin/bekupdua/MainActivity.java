package com.fahruddin.bekupdua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Btn;
    private TextView Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kartu_nama);

        Btn = (Button) findViewById(R.id.button);
        Tv = (TextView) findViewById(R.id.textView11);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tv.setText(ambil_nilai());
            }
        });


    }

    public String ambil_nilai(){
        String data ="data dari fungsi";
        return data;
    }

}
