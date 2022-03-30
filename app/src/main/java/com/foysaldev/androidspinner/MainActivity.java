package com.foysaldev.androidspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    String [] mymensinghdistrict;
    private Spinner spinner;
    MaterialButton button;
    TextInputEditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.SpinnerId);
        button = findViewById(R.id.Buttonid);
        editText = findViewById(R.id.EditTextid);

        mymensinghdistrict = getResources().getStringArray(R.array.mymensingh_district);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout,R.id.TextViewSample,mymensinghdistrict);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = spinner.getSelectedItem().toString();
                editText.setText(value);
            }
        });
    }
}