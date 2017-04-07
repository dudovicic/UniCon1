package hr.ferit.dudovicic.unicon1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    TextView NumberIn, UnitIn, NumberOut, UnitOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        this.setUpUI();

    }

    private void setUpUI()
    {
        Intent intent = this.getIntent();

        this.NumberIn = (TextView) findViewById(R.id.NumberIn);
        this.UnitIn = (TextView) findViewById(R.id.UnitIn);
        this.NumberOut = (TextView) findViewById(R.id.NumberOut);
        this.UnitOut = (TextView) findViewById(R.id.UnitOut);

        if(intent.hasExtra(LengthActivity.INPUT)){
            String inputNumber = intent.getStringExtra(LengthActivity.INPUT);
            NumberIn.setText(inputNumber);
        }
        if(intent.hasExtra(LengthActivity.UNITIN)){
            String inputUnit = intent.getStringExtra(LengthActivity.UNITIN);
            UnitIn.setText(inputUnit);
        }
        if(intent.hasExtra(LengthActivity.OUTPUT)){
            String outputNumber = intent.getStringExtra(LengthActivity.OUTPUT);
            NumberOut.setText(outputNumber);
        }
        if(intent.hasExtra(LengthActivity.UNITOUT)){
            String outputUnit = intent.getStringExtra(LengthActivity.UNITOUT);
            UnitOut.setText(outputUnit);
        }
    }
}
