package com.example.android.ikequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TriviaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);
    }

    public void getSummary(View view){
        RadioGroup Towerg = (RadioGroup) findViewById(R.id.rgroup);
        int Rg1 = Towerg.getCheckedRadioButtonId();
        RadioGroup tenDaysg = (RadioGroup) findViewById(R.id.r2group);
        int Rg2 = tenDaysg.getCheckedRadioButtonId();
        RadioGroup Crashg = (RadioGroup) findViewById(R.id.r3group);
        int Rg3 = Crashg.getCheckedRadioButtonId();
        RadioGroup three65Daysg = (RadioGroup) findViewById(R.id.r4group);
        int Rg4 = three65Daysg.getCheckedRadioButtonId();
        RadioGroup Clickg = (RadioGroup) findViewById(R.id.r5group);
        int Rg5 = Clickg.getCheckedRadioButtonId();

        RadioButton Tower = (RadioButton) findViewById(R.id.giraffe_radio_button);
        boolean Rb1 = Tower.isChecked();
        RadioButton tenDays = (RadioButton) findViewById(R.id.mosq_radio_button);
        boolean Rb2 = tenDays.isChecked();
        RadioButton Crash = (RadioButton) findViewById(R.id.rhino_radio_button);
        boolean Rb3 = Crash.isChecked();
        RadioButton three65Days = (RadioButton) findViewById(R.id.donkey_radio_button);
        boolean Rb4 = three65Days.isChecked();
        RadioButton Click = (RadioButton) findViewById(R.id.dolphin_radio_button);
        boolean Rb5 = Click.isChecked();
        EditText enterName = (EditText) findViewById(R.id.name_view);
        Button button = (Button) findViewById(R.id.btnId);

        //To ensure no question is skipped
        if (Rg1==-1 || Rg2==-1 || Rg3==-1 || Rg4==-1 || Rg5==-1){
            Toast.makeText(this, "Please answer all questions before proceeding", Toast.LENGTH_LONG).show();
            return;
        }

         // Result for the first quiz question
        if (Rb1 == true){
            Toast.makeText(this, "Q1:Correct! TOWER is the answer", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Q1:Incorrect! TOWER is the right answer", Toast.LENGTH_LONG).show();
        }

        //For the second quiz question
        if (Rb2 == true){
            Toast.makeText(this, "Q2:Correct! 10DAYS is the answer", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Q2:Incorrect! 10DAYS is the right answer", Toast.LENGTH_LONG).show();
        }
        // Result for the third quiz question
        if (Rb3 == true){
            Toast.makeText(this, "Q3:Correct! CRASH is the answer", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Q3:Incorrect! CRASH is the right answer", Toast.LENGTH_LONG).show();
        }

        //For the fourth quiz question
        if (Rb4 == true){
            Toast.makeText(this, "Q4:Correct! 365DAYS is the answer", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Q4:Incorrect! 365DAYS is the right answer", Toast.LENGTH_LONG).show();
        }
        //For the fifth quiz question
        if (Rb5 == true){
            Toast.makeText(this, "Q5:Correct! CLICK is the answer", Toast.LENGTH_LONG).show();
            String Message = setVisibility();
        } else {
            Toast.makeText(this, "Q5:Incorrect! CLICK is the right answer", Toast.LENGTH_LONG).show();
            String Message = setVisibility();
        }

    }


    public String setVisibility() {
        ImageView result = (ImageView) findViewById(R.id.result_view);
        result.setVisibility(View.VISIBLE);

        LinearLayout textView = (LinearLayout) findViewById(R.id.quiz_view);
        textView.setVisibility(View.GONE);
        return null;
    }
}

