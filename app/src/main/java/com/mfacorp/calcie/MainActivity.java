package com.mfacorp.calcie;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;

import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;





public class MainActivity extends AppCompatActivity {

    private EditText quiz1, quiz2, quiz3, quiz4, assignment, test1, test2;
    private Button button;
    private TextView Result,Result2;
    private TextInputLayout quiz1Lay1, quiz2Lay2, quiz3Lay3, quiz4Lay4, test1Lay1, test2Lay2, assLay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeWidgets();
        initializeListeners();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

     @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();

        switch (id){

            case R.id.about:


                Intent intent = new Intent(this, AboutActivity.class);
                this.startActivity(intent);
                break;

            case R.id.feedback:
                Intent intent2 = new Intent(Intent.ACTION_SENDTO, android.net.Uri.fromParts(
                        "mailto","firdous.alam247@gmail.com", null));

                startActivity(Intent.createChooser(intent2, "Choose an Email client :"));

            case R.id.reset:
                    quiz1.getText().clear();
                    quiz2.getText().clear();
                    quiz3.getText().clear();
                    quiz4.getText().clear();
                    test1.getText().clear();
                    test2.getText().clear();
                    assignment.getText().clear();
                     quiz1Lay1.setErrorEnabled(false);
                     quiz2Lay2.setErrorEnabled(false);
                     quiz3Lay3.setErrorEnabled(false);
                     quiz4Lay4.setErrorEnabled(false);
                     test1Lay1.setErrorEnabled(false);
                     test2Lay2.setErrorEnabled(false);
                     assLay.setErrorEnabled(false);
                    Result.setText("");
                    Result2.setText("");
        }

        return true;
        }

    private void initializeWidgets() {
        quiz1 = findViewById(R.id.quiz1);
        quiz2 = findViewById(R.id.quiz2);
        quiz3 = findViewById(R.id.quiz3);
        quiz4 = findViewById(R.id.quiz4);
        assignment = findViewById(R.id.ass);
        test1 = findViewById(R.id.test1);
        test2 = findViewById(R.id.test2);
        button = findViewById(R.id.button);
        quiz1Lay1 = findViewById(R.id.quiz1Lay1);
        quiz2Lay2 = findViewById(R.id.quiz1Lay2);
        quiz3Lay3 = findViewById(R.id.quiz1Lay3);
        quiz4Lay4 = findViewById(R.id.quiz1Lay4);
        test1Lay1 = findViewById(R.id.testLay1);
        test2Lay2 = findViewById(R.id.testLay2);
        assLay = findViewById(R.id.assLay);
        Result = findViewById(R.id.Result);
        Result2=findViewById(R.id.Result2);

        quiz1.setTextSize(TypedValue.COMPLEX_UNIT_DIP,25);
        quiz2.setTextSize(TypedValue.COMPLEX_UNIT_DIP,25);
        quiz3.setTextSize(TypedValue.COMPLEX_UNIT_DIP,25);
        quiz4.setTextSize(TypedValue.COMPLEX_UNIT_DIP,25);
        test1.setTextSize(TypedValue.COMPLEX_UNIT_DIP,25);
        test2.setTextSize(TypedValue.COMPLEX_UNIT_DIP,25);
        assignment.setTextSize(TypedValue.COMPLEX_UNIT_DIP,25);

    }


    private void initializeListeners() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputWArn();
            }
        });
    }

    private void inputWArn() {

        boolean isVailed = true;

        String q1 = quiz1.getText().toString();
        String q2 = quiz2.getText().toString();
        String q3 = quiz3.getText().toString();
        String q4 = quiz4.getText().toString();
        String t1 = test1.getText().toString();
        String t2 = test2.getText().toString();
        String a1 = assignment.getText().toString();

        int qm1;
        int qm2;
        int qm3;
        int qm4;
        int tm1;
        int tm2;
        int as1;
        float quiztot;
        float testtot;
        int total;

//---------------------------------------------------------------

        if (q1.isEmpty()) {

            quiz1Lay1.setError("¯\\_(ツ)_/¯  Empty=0");
            qm1=0;
        }
        else {
            qm1 = Integer.parseInt(q1);
            if (qm1>15)
            {

                quiz1Lay1.setError("ಠ_ಠ");
                isVailed = false;



            }
            else {
                    quiz1Lay1.setErrorEnabled(false);
                    isVailed = true;
                }
            }


//----------------------------------------------------------------
        if (q2.isEmpty()) {

            quiz2Lay2.setError("¯\\_(ツ)_/¯  Empty=0");
            qm2=0;
        }
        else {
            qm2 = Integer.parseInt(q2);
            if (qm2>15)
            {

                quiz2Lay2.setError("ಠ_ಠ");
                isVailed = false;


            }
            else {
                quiz2Lay2.setErrorEnabled(false);
                isVailed = true;
            }
        }


//----------------------------------------------------------------
        if (q3.isEmpty()) {

            quiz3Lay3.setError("¯\\_(ツ)_/¯  Empty=0");
            qm3=0;
        }
        else {
            qm3 = Integer.parseInt(q3);
            if (qm3>15)
            {

                quiz3Lay3.setError("ಠ_ಠ");
                isVailed = false;


            }
            else {
                quiz3Lay3.setErrorEnabled(false);
                isVailed = true;
            }
        }

//------------------------------------------------------------------
        if (q4.isEmpty()) {

            quiz4Lay4.setError("¯\\_(ツ)_/¯  Empty=0");
            qm4=0;
        }
        else {
            qm4 = Integer.parseInt(q4);
            if (qm4>15)
            {

                quiz4Lay4.setError("ಠ_ಠ");
                isVailed = false;


            }
            else {
                quiz4Lay4.setErrorEnabled(false);
                isVailed = true;
            }
        }
//---------------------------------------------------------------
        if (t1.isEmpty()) {

            test1Lay1.setError("¯\\_(ツ)_/¯  Empty=0");
            tm1=0;
        }
        else {
            tm1 = Integer.parseInt(t1);
            if (tm1>50)
            {

                test1Lay1.setError("ಠ_ಠ");
                isVailed = false;


            }
            else {
                test1Lay1.setErrorEnabled(false);
                isVailed = true;
            }
        }

//----------------------------------------------------------------
        if (t2.isEmpty()) {

            test2Lay2.setError("¯\\_(ツ)_/¯  Empty=0");
            tm2=0;
        }
        else {
            tm2 = Integer.parseInt(t2);
            if (tm2>50)
            {

                test2Lay2.setError("ಠ_ಠ");
                isVailed = false;


            }
            else {
                test2Lay2.setErrorEnabled(false);
                isVailed = true;
            }
        }
//----------------------------------------------------------------
        if (a1.isEmpty()) {

            assLay.setError("¯\\_(ツ)_/¯  Empty=0");
            as1=0;
        }
        else {
            as1 = Integer.parseInt(a1);
            if (as1>4)
            {

                assLay.setError("ಠ_ಠ No..no..no");
                isVailed = false;


            }
            else {
                assLay.setErrorEnabled(false);
                isVailed = true;
            }
        }
//----------------------------------------------------------------
        if (isVailed) {




            quiztot = (float) (Math.ceil(qm1 / 5.0) + Math.ceil((qm2 + qm3)/ 5.0) + Math.ceil(qm4 / 5.0));
            testtot = (float) (Math.ceil(tm1 / 2.941176471) + Math.ceil(tm2 / 2.941176471));

            total =(int) Math.ceil(quiztot + testtot + as1);

                Result2.setText("Quiz total = "+String.valueOf(quiztot)+"\n"+"Test total ="+String.valueOf(testtot));
                Result.setText("Cie is "+String.valueOf(total));


        }
    }
}

























