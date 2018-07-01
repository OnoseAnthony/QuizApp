package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    int finalScore = 0;
    String display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked
     */
    public void submitQuiz(View view) {

        /**
         * The code below is for question 1 answer. The correct option is choice 2
         */

        RadioButton question1Answer = (RadioButton) findViewById(R.id.question1_choice2);
        boolean ischecked = question1Answer.isChecked();
        if (ischecked) {
            finalScore += 1;
        }

        question2();                //calling question 2 method
        question3();                //calling question 3 method
        question4();                //calling question 4 method
        question5();                //calling question 5 method
        question6();                //calling question 6 method
        question7();                //calling question 7 method
        question8();                //calling question 8 method
        question9();                //calling question 9 method
        question10();               //calling question 10 method


        if (finalScore == 10) {
            display = getString(R.string.displayToast1);
        } else {
            display = getString(R.string.displaytoast2) + getString(R.string.emptydisplaytoast) + finalScore + getString(R.string.emptydisplaytoast) + getString(R.string.displayToast3);
        }


        /**
         * The code below generates a toast message
         */
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, display, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

        finalScore = 0;

    }


    /**
     * The question 2 method .
     */
    public void question2() {
        EditText question2Answer = (EditText) findViewById(R.id.question2_choice);
        String answer2Choice = question2Answer.getText().toString().toLowerCase();
        String wordQuestion2 = getString(R.string.question2stringa);
        String wordQuestion2a = getString(R.string.question2stringb);

        if (answer2Choice.equals(wordQuestion2.toLowerCase())) {
            finalScore += 1;
        } else if (answer2Choice.equals(wordQuestion2a.toLowerCase())) {
            finalScore += 1;
        }
    }


    /**
     * Question 3 method. Checkbox 3 and 4 holds the right answer
     */
    public void question3() {
        CheckBox question3Answer1 = (CheckBox) findViewById(R.id.question3_choice1);
        CheckBox question3Answer2 = (CheckBox) findViewById(R.id.question3_choice2);
        CheckBox question3Answer3 = (CheckBox) findViewById(R.id.question3_choice3);
        CheckBox question3Answer4 = (CheckBox) findViewById(R.id.question3_choice4);
        boolean ischecked = question3Answer1.isChecked();
        boolean ischecked1 = question3Answer2.isChecked();
        boolean ischecked2 = question3Answer3.isChecked();
        boolean ischecked3 = question3Answer4.isChecked();

        if (!ischecked && !ischecked1 && ischecked2 && ischecked3) {
            finalScore += 1;
        }
    }


    /**
     * Question 4 method. Radiobutton 3  holds the right answer
     */
    public void question4() {
        RadioButton question4Answer = (RadioButton) findViewById(R.id.question4_choice3);
        boolean ischecked = question4Answer.isChecked();
        if (ischecked) {
            finalScore += 1;
        }
    }


    /**
     * question 5 method. Checkbox 1 and 4 holds the right answer
     */

    public void question5() {
        CheckBox question5Answer1 = (CheckBox) findViewById(R.id.question5_choice1);
        CheckBox question5Answer2 = (CheckBox) findViewById(R.id.question5_choice2);
        CheckBox question5Answer3 = (CheckBox) findViewById(R.id.question5_choice3);
        CheckBox question5Answer4 = (CheckBox) findViewById(R.id.question5_choice4);
        boolean ischecked = question5Answer1.isChecked();
        boolean ischecked1 = question5Answer2.isChecked();
        boolean ischecked2 = question5Answer3.isChecked();
        boolean ischecked3 = question5Answer4.isChecked();

        if (ischecked && !ischecked1 && !ischecked2 && ischecked3) {
            finalScore += 1;
        }
    }


    /**
     * Question 6 method. Checkbox 2 and 3 holds the right answer
     */

    public void question6() {
        CheckBox question6Answer1 = (CheckBox) findViewById(R.id.question6_choice1);
        CheckBox question6Answer2 = (CheckBox) findViewById(R.id.question6_choice2);
        CheckBox question6Answer3 = (CheckBox) findViewById(R.id.question6_choice3);
        CheckBox question6Answer4 = (CheckBox) findViewById(R.id.question6_choice4);
        boolean ischecked = question6Answer1.isChecked();
        boolean ischecked1 = question6Answer2.isChecked();
        boolean ischecked2 = question6Answer3.isChecked();
        boolean ischecked3 = question6Answer4.isChecked();

        if (!ischecked && ischecked1 && ischecked2 && !ischecked3) {
            finalScore += 1;

        }
    }


    /**
     * question 7 method. RadioButton 4 holds the right answer
     */

    public void question7() {
        RadioButton question7Answer = (RadioButton) findViewById(R.id.question7_choice4);
        boolean ischecked = question7Answer.isChecked();
        if (ischecked) {
            finalScore += 1;
        }
    }


    /**
     * Question 8 method.
     */

    public void question8() {
        EditText question8Answer = (EditText) findViewById(R.id.question8_choice);
        String answer8Choice = question8Answer.getText().toString().toLowerCase();
        String wordQuestion8 = getString(R.string.question8stringa);
        String wordQuestion8a = getString(R.string.question8stringb);

        if (answer8Choice.equals(wordQuestion8.toLowerCase())) {
            finalScore += 1;
        } else if (answer8Choice.equals(wordQuestion8a.toLowerCase())) {
            finalScore += 1;
        }
    }


    /**
     * Question 9 method. The correct option is button 2
     */

    public void question9() {
        RadioButton question9Answer = (RadioButton) findViewById(R.id.question9_choice2);
        boolean ischecked = question9Answer.isChecked();
        if (ischecked) {
            finalScore += 1;
        }
    }


    /**
     * Question 10 method. The correct option is button 4
     */

    public void question10() {
        RadioButton question10Answer = (RadioButton) findViewById(R.id.question10_choice4);
        boolean ischecked = question10Answer.isChecked();
        if (ischecked) {
            finalScore += 1;
        }
    }

}

