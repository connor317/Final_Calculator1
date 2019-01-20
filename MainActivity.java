package com.example.connor.grade;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view){

        float currentGrade = Float.valueOf(((EditText)findViewById(R.id.CurrentGrade)).getText().toString());
        float finalPercent = Float.valueOf(((EditText)findViewById(R.id.finalPercent)).getText().toString());
        float desiredGrade = Float.valueOf(((EditText)findViewById(R.id.desired_grade)).getText().toString());
        EditText gradeNeeded = findViewById(R.id.output);
        float amountCompleted = 1 - (finalPercent / 100);
        float percentDone = amountCompleted * currentGrade;
        float finalGrade = (desiredGrade - percentDone);
        finalGrade = (finalGrade / finalPercent) * 100;
        gradeNeeded.setText(String.format("%.2f", finalGrade) + "%");
    }
}
