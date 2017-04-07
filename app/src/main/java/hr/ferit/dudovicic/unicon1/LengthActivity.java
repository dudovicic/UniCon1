package hr.ferit.dudovicic.unicon1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public  class LengthActivity extends AppCompatActivity implements View.OnClickListener {

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
        setContentView(R.layout.activity_length);
        this.setUpUI();

        this.arraySpinner = new String[]{"cm", "m", "mm", "km", "ft", "mile", "inch"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner);
        Spinner s1 = (Spinner) findViewById(R.id.SpinnerFrom);
        Spinner s2 = (Spinner) findViewById(R.id.SpinnerTo);
        s1.setAdapter(adapter);
        s2.setAdapter(adapter);

//        Intent intent = getIntent();

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

           if ((s1.getSelectedItem().toString().equals("km")) && (s2.getSelectedItem().toString().equals("mile"))) {
                res = 0.62137 * input;
            }
            if ((s1.getSelectedItem().toString().equals("mile")) && (s2.getSelectedItem().toString().equals("km"))) {
                res = 1.60934 * input;
            }
            if ((s1.getSelectedItem().toString().equals("mile")) && (s2.getSelectedItem().toString().equals("m"))) {
                res = 1609.34 * input;
            }
            if ((s1.getSelectedItem().toString().equals("m")) && (s2.getSelectedItem().toString().equals("mile"))) {
                res = input / 1609.34;
            }
            if ((s1.getSelectedItem().toString().equals("mile")) && (s2.getSelectedItem().toString().equals("cm"))) {
                res = 160934 * input;
            }
            if ((s1.getSelectedItem().toString().equals("cm")) && (s2.getSelectedItem().toString().equals("mile"))) {
                res = input / 160934;
            }
            if ((s1.getSelectedItem().toString().equals("mile")) && (s2.getSelectedItem().toString().equals("mm"))) {
                res = input * 1609340;
            }
            if ((s1.getSelectedItem().toString().equals("mm")) && (s2.getSelectedItem().toString().equals("mile"))) {
                res = input / 1609340;
            }
            if ((s1.getSelectedItem().toString().equals("mile")) && (s2.getSelectedItem().toString().equals("inch"))) {
                res = 63360 * input;
            }
            if ((s1.getSelectedItem().toString().equals("inch")) && (s2.getSelectedItem().toString().equals("mile"))) {
                res = input / 63360;
            }
            if ((s1.getSelectedItem().toString().equals("mile")) && (s2.getSelectedItem().toString().equals("ft"))) {
                res = 5280 * input;
            }
            if ((s1.getSelectedItem().toString().equals("ft")) && (s2.getSelectedItem().toString().equals("mile"))) {
                res = input / 5280;
            }
            if ((s1.getSelectedItem().toString().equals("km")) && (s2.getSelectedItem().toString().equals("m"))) {
                res = input * 1000;
            }
            if ((s1.getSelectedItem().toString().equals("m")) && (s2.getSelectedItem().toString().equals("km"))) {
                res = 0.001 * input;
            }
            if ((s1.getSelectedItem().toString().equals("km")) && (s2.getSelectedItem().toString().equals("cm"))) {
                res = 100000 * input;
            }
            if ((s1.getSelectedItem().toString().equals("cm")) && (s2.getSelectedItem().toString().equals("km"))) {
                res = input / 100000;
            }
            if ((s1.getSelectedItem().toString().equals("km")) && (s2.getSelectedItem().toString().equals("mm"))) {
                res = 1000000 * input;
            }
            if ((s1.getSelectedItem().toString().equals("mm")) && (s2.getSelectedItem().toString().equals("km"))) {
                res = input / 1000000;
            }
            if ((s1.getSelectedItem().toString().equals("km")) && (s2.getSelectedItem().toString().equals("ft"))) {
                res = input * 3280.84;
            }
            if ((s1.getSelectedItem().toString().equals("ft")) && (s2.getSelectedItem().toString().equals("km"))) {
                res = input / 3280.84;
            }
            if ((s1.getSelectedItem().toString().equals("km")) && (s2.getSelectedItem().toString().equals("inch"))) {
                res = input * 39370.1;
            }
            if ((s1.getSelectedItem().toString().equals("inch")) && (s2.getSelectedItem().toString().equals("km"))) {
                res = input / 39370.1;
            }
            if ((s1.getSelectedItem().toString().equals("m")) && (s2.getSelectedItem().toString().equals("cm"))) {
                res = 100 * input;
            }
            if ((s1.getSelectedItem().toString().equals("cm")) && (s2.getSelectedItem().toString().equals("m"))) {
                res = input / 100;
            }
            if ((s1.getSelectedItem().toString().equals("m")) && (s2.getSelectedItem().toString().equals("mm"))) {
                res = 1000 * input;
            }
            if ((s1.getSelectedItem().toString().equals("mm")) && (s2.getSelectedItem().toString().equals("m"))) {
                res = input / 1000;
            }
            if ((s1.getSelectedItem().toString().equals("m")) && (s2.getSelectedItem().toString().equals("inch"))) {
                res = 100 * input / 2.54;
            }
            if ((s1.getSelectedItem().toString().equals("inch")) && (s2.getSelectedItem().toString().equals("m"))) {
                res = 2.54 * input / 100;
            }
            if ((s1.getSelectedItem().toString().equals("m")) && (s2.getSelectedItem().toString().equals("ft"))) {
                res = input * 3.28084;
            }
            if ((s1.getSelectedItem().toString().equals("ft")) && (s2.getSelectedItem().toString().equals("m"))) {
                res = input / 3.28084;
            }
            if ((s1.getSelectedItem().toString().equals("cm")) && (s2.getSelectedItem().toString().equals("mm"))) {
                res = 10 * input;
            }
            if ((s1.getSelectedItem().toString().equals("mm")) && (s2.getSelectedItem().toString().equals("cm"))) {
                res = input / 10;
            }
            if ((s1.getSelectedItem().toString().equals("inch")) && (s2.getSelectedItem().toString().equals("cm"))) {
                res = 2.54 * input;
            }
            if ((s1.getSelectedItem().toString().equals("cm")) && (s2.getSelectedItem().toString().equals("inch"))) {
                res = input / 2.54;
            }
            if ((s1.getSelectedItem().toString().equals("cm")) && (s2.getSelectedItem().toString().equals("ft"))) {
                res = input * 0.03281;
            }
            if ((s1.getSelectedItem().toString().equals("ft")) && (s2.getSelectedItem().toString().equals("cm"))) {
                res = input * 30.48;
            }
            if ((s1.getSelectedItem().toString().equals("mm")) && (s2.getSelectedItem().toString().equals("ft"))) {
                res = 0.00328 * input;
            }
            if ((s1.getSelectedItem().toString().equals("ft")) && (s2.getSelectedItem().toString().equals("mm"))) {
                res = input * 304.8;
            }
            if ((s1.getSelectedItem().toString().equals("mm")) && (s2.getSelectedItem().toString().equals("inch"))) {
                res = input / 25.4;
            }
            if ((s1.getSelectedItem().toString().equals("inch")) && (s2.getSelectedItem().toString().equals("mm"))) {
                res = input * 25.4;
            }
            if ((s1.getSelectedItem().toString().equals("ft")) && (s2.getSelectedItem().toString().equals("inch"))) {
                res = 12 * input;
            }
            if ((s1.getSelectedItem().toString().equals("inch")) && (s2.getSelectedItem().toString().equals("ft"))) {
                res = input / 12;
            }
            if (s1.getSelectedItem().toString().equals(s2.getSelectedItem().toString())) {
                res = input;
            }
        Intent intent = new Intent(LengthActivity.this,ResultsActivity.class);
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