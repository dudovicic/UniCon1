package hr.ferit.dudovicic.unicon1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class VolumenActivity extends AppCompatActivity implements View.OnClickListener {

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
        setContentView(R.layout.activity_volumen);
        this.setUpUI();

        this.arraySpinner = new String[]{"litre", "millilitre", "cubic m", "cubic cm"};
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

        if ((s1.getSelectedItem().toString().equals("litre")) && (s2.getSelectedItem().toString().equals("millilitre"))) {
            res = 1000 * input;
        }
        if ((s1.getSelectedItem().toString().equals("milllitre")) && (s2.getSelectedItem().toString().equals("litre"))) {
            res = input/1000;
        }
        if ((s1.getSelectedItem().toString().equals("litre")) && (s2.getSelectedItem().toString().equals("cubic m"))) {
            res = 0.001 * input;
        }
        if ((s1.getSelectedItem().toString().equals("cubic m")) && (s2.getSelectedItem().toString().equals("litre"))) {
            res = input / 1000;
        }
        if ((s1.getSelectedItem().toString().equals("litre")) && (s2.getSelectedItem().toString().equals("cubic cm"))) {
            res = 1000 * input;
        }
        if ((s1.getSelectedItem().toString().equals("cubic cm")) && (s2.getSelectedItem().toString().equals("litre"))) {
            res = 0.001 * input;
        }
        if ((s1.getSelectedItem().toString().equals("cubic m")) && (s2.getSelectedItem().toString().equals("cubic cm"))) {
            res = input*100*100*100;
        }
        if ((s1.getSelectedItem().toString().equals("cubic cm")) && (s2.getSelectedItem().toString().equals("cubic m"))) {
            res =  input/1000000;
        }
        if ((s1.getSelectedItem().toString().equals("cubic m")) && (s2.getSelectedItem().toString().equals("millilitre"))) {
            res = input*1000000;
        }
        if ((s1.getSelectedItem().toString().equals("millilitre")) && (s2.getSelectedItem().toString().equals("cubic m"))) {
            res = input/1000000;
        }
        if ((s1.getSelectedItem().toString().equals("cubic cm")) && (s2.getSelectedItem().toString().equals("millilitre"))) {
            res = input;
        }
        if ((s1.getSelectedItem().toString().equals("millilitre")) && (s2.getSelectedItem().toString().equals("cubic cm"))) {
            res = input;
        }
        if (s1.getSelectedItem().toString().equals(s2.getSelectedItem().toString())) {
            res = input;
        }
        Intent intent = new Intent(VolumenActivity.this,ResultsActivity.class);
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
