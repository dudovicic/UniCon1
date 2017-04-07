package hr.ferit.dudovicic.unicon1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class TemperatureActivity extends AppCompatActivity implements View.OnClickListener {

    EditText EditTextValue;
    double res;
    Button Button1;
    private String[] arraySpinner;
    public static final String INPUT="NumberIn";
    public static final String UNITIN="UnitIn";
    public static final String OUTPUT="NumberOut";
    public static final String UNITOUT="UnitOut";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        this.setUpUI();

        this.arraySpinner = new String[]{"C", "F"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner);
        Spinner s1 = (Spinner) findViewById(R.id.SpinnerFrom);
        Spinner s2 = (Spinner) findViewById(R.id.SpinnerTo);
        s1.setAdapter(adapter);
        s2.setAdapter(adapter);
    }

    private void setUpUI() {
        this.EditTextValue= (EditText) findViewById(R.id.EditTextValue);
        this.Button1= (Button) findViewById(R.id.Button1);
        this.Button1.setOnClickListener(this);
    }
    public void onClick(View v) {

        Spinner s1 = (Spinner) findViewById(R.id.SpinnerFrom);
        Spinner s2 = (Spinner) findViewById(R.id.SpinnerTo);
        double input = Double.parseDouble(EditTextValue.getText().toString());

        if ((s1.getSelectedItem().toString().equals("C")) && (s2.getSelectedItem().toString().equals("F"))) {
            res = (double)((input*9/5)+32);
        }
        if ((s1.getSelectedItem().toString().equals("F")) && (s2.getSelectedItem().toString().equals("C"))) {
            res = (double)((input-32)*5/9);
        }
        if (s1.getSelectedItem().toString().equals(s2.getSelectedItem().toString())) {
            res = input;
        }
        Intent intent = new Intent(TemperatureActivity.this,ResultsActivity.class);
        String NumberIn=String.valueOf(input);
        String UnitIn=s1.getSelectedItem().toString();
        String NumberOut=String.valueOf(res);
        String UnitOut=s2.getSelectedItem().toString();
        intent.putExtra(INPUT,NumberIn);
        intent.putExtra(UNITIN,UnitIn);
        intent.putExtra(OUTPUT,NumberOut);
        intent.putExtra(UNITOUT,UnitOut);
        this.startActivity(intent);
    }
}
