package com.example.willfisher.areyouanog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButtonOne;
    RadioButton radioButtonTwo;
    RadioButton radioButtonThree;
    RadioButton radioButtonFour;
    RadioButton radioButtonFive;
    RadioButton radioButtonSix;
    RadioButton radioButtonSeven;
    RadioButton radioButtonEight;
    TextView finalString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        finalString = (TextView)findViewById(R.id.finalNum);


        Button calcBtn = (Button)(findViewById(R.id.calculatorBtn));
        calcBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
             radioButtonOne = (RadioButton)findViewById(R.id.radioButton1);
             radioButtonTwo = (RadioButton)findViewById(R.id.radioButton2);
             radioButtonThree = (RadioButton)findViewById(R.id.radioButton3);
             radioButtonFour = (RadioButton)findViewById(R.id.radioButton4);
             radioButtonFive = (RadioButton)findViewById(R.id.radioButton5);
             radioButtonSix = (RadioButton)findViewById(R.id.radioButton6);
             radioButtonSeven = (RadioButton)findViewById(R.id.radioButton7);
             radioButtonEight = (RadioButton)findViewById(R.id.radioButton8);

            Integer count = 0;
            if(radioButtonOne.isChecked()) {
               count = count + 1;
            }
            if(radioButtonTwo.isChecked()) {
                count = count + 1;
            }
            if(radioButtonThree.isChecked()) {
                count = count + 1;
             }
            if(radioButtonFour.isChecked()) {
                count = count + 1;
             }
            if(radioButtonFive.isChecked()) {
                count = count + 1;
             }
            if(radioButtonSix.isChecked()) {
                 count = count + 1;
             }
            if(radioButtonSeven.isChecked()) {
                 count = count + 1;
             }
             if(radioButtonEight.isChecked()) {
                count = count + 1;
             }
             finalString.setText(count.toString());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
