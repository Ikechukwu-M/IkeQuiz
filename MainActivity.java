package com.example.android.ikequiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText enterName;
    private RadioGroup radioGroup;
    private RadioButton Male, Female;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.rgroup);
        Male = (RadioButton) findViewById(R.id.male_radio_button);
        Female = (RadioButton) findViewById(R.id.female_radio_button);
        enterName = (EditText) findViewById(R.id.name_view);
        button = (Button) findViewById(R.id.btnId);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int selectedId = radioGroup.getCheckedRadioButtonId();
                //Find out which button is checked or selected
                if (selectedId == Male.getId() && enterName.length() >= 1) {
                    Intent myIntent = new Intent(MainActivity.this, TriviaActivity.class);
                    MainActivity.this.startActivity(myIntent);
                } else if (selectedId == Female.getId() && enterName.length() >= 1) {
                    Intent myIntent = new Intent(MainActivity.this, TriviaActivity.class);
                    MainActivity.this.startActivity(myIntent);
                } else if (selectedId != Female.getId() && selectedId != Male.getId() && enterName.length() < 1) {
                    Toast.makeText(MainActivity.this, "Please enter your name and gender", Toast.LENGTH_SHORT).show();
                } else if (enterName.length() < 1) {
                    Toast.makeText(MainActivity.this, "Please enter Name", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Please select a gender", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
