package hr.ferit.dudovicic.unicon1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class WeightActivity extends AppCompatActivity implements View.OnClickListener {

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
        setContentView(R.layout.activity_weight);
        this.setUpUI();


        this.arraySpinner = new String[]{"Kg", "gm", "lb", "ounce", "mg"};
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

        if ((s1.getSelectedItem().toString().equals("Kg")) && (s2.getSelectedItem().toString().equals("gm"))) {
            res = (double)(1000*input);
        }
        if ((s1.getSelectedItem().toString().equals("gm")) && (s2.getSelectedItem().toString().equals("Kg"))) {
            res = (double)(input/1000);
        }
        if ((s1.getSelectedItem().toString().equals("Kg")) && (s2.getSelectedItem().toString().equals("lb"))) {
            res = 2.2046*input;
        }
        if ((s1.getSelectedItem().toString().equals("lb")) && (s2.getSelectedItem().toString().equals("Kg"))) {
            res = 0.454*input;
        }
        if ((s1.getSelectedItem().toString().equals("Kg")) && (s2.getSelectedItem().toString().equals("ounce"))) {
            res = input*35.27396;
        }
        if ((s1.getSelectedItem().toString().equals("ounce")) && (s2.getSelectedItem().toString().equals("Kg"))) {
            res = input*0.02835;
        }
        if ((s1.getSelectedItem().toString().equals("Kg")) && (s2.getSelectedItem().toString().equals("mg"))) {
            res = input*1000000;
        }
        if ((s1.getSelectedItem().toString().equals("mg")) && (s2.getSelectedItem().toString().equals("Kg"))) {
            res = input/1000000;
        }
        if ((s1.getSelectedItem().toString().equals("gm")) && (s2.getSelectedItem().toString().equals("lb"))) {
            res = 0.0022*input;
        }
        if ((s1.getSelectedItem().toString().equals("lb")) && (s2.getSelectedItem().toString().equals("gm"))) {
            res = 453.6*input;
        }
        if ((s1.getSelectedItem().toString().equals("gm")) && (s2.getSelectedItem().toString().equals("mg"))) {
            res = input*1000;
        }
        if ((s1.getSelectedItem().toString().equals("mg")) && (s2.getSelectedItem().toString().equals("gm"))) {
            res = input/1000;
        }
        if ((s1.getSelectedItem().toString().equals("gm")) && (s2.getSelectedItem().toString().equals("ounce"))) {
            res = input*0.03527;
        }
        if ((s1.getSelectedItem().toString().equals("ounce")) && (s2.getSelectedItem().toString().equals("gm"))) {
            res = input*28.34952;
        }
        if ((s1.getSelectedItem().toString().equals("lb")) && (s2.getSelectedItem().toString().equals("mg"))) {
            res = input*453592.37;
        }
        if ((s1.getSelectedItem().toString().equals("mg")) && (s2.getSelectedItem().toString().equals("lb"))) {
            res = input/453592.37;
        }
        if ((s1.getSelectedItem().toString().equals("ounce")) && (s2.getSelectedItem().toString().equals("mg"))) {
            res = input*28349.52313;
        }
        if ((s1.getSelectedItem().toString().equals("mg")) && (s2.getSelectedItem().toString().equals("ounce"))) {
            res = input/28349;
        }
        if ((s1.getSelectedItem().toString().equals("lb")) && (s2.getSelectedItem().toString().equals("ounce"))) {
            res = 16*input;
        }
        if ((s1.getSelectedItem().toString().equals("ounce")) && (s2.getSelectedItem().toString().equals("lb"))) {
            res = input/16;
        }
        if (s1.getSelectedItem().toString().equals(s2.getSelectedItem().toString())) {
            res = input;
        }
        Intent intent = new Intent(WeightActivity.this,ResultsActivity.class);
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
