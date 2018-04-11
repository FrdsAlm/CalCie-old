package com.mfacorp.calcie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class AboutActivity extends AppCompatActivity {

   private android.widget.EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        editText2=findViewById(R.id.editText2);

        editText2.setText("+918474883944");




    }
}
