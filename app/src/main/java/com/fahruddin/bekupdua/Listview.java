package com.fahruddin.bekupdua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Listview extends AppCompatActivity {

    ListView lv;
    Button btn_add, btn_show;
    EditText ed_input;
    List<String> object = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        lv = (ListView) findViewById(R.id.listView);
        btn_add = (Button) findViewById(R.id.button3);
        btn_show = (Button) findViewById(R.id.button4);
        ed_input = (EditText) findViewById(R.id.editText);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ambil_nilai = ed_input.getText().toString();
                object.add(ambil_nilai);
                ed_input.setText("");
            }
        });

        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListviewAdapeter adapeter = new ListviewAdapeter(getApplicationContext(), android.R.layout.simple_list_item_1, object);
                lv.setAdapter(adapeter);
            }
        });

    }



}
