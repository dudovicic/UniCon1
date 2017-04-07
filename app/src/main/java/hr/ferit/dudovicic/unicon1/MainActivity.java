package hr.ferit.dudovicic.unicon1;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


public void secondActivity(View view){
    Intent intent = new Intent(MainActivity.this, LengthActivity.class);
    startActivity(intent);
}

public void thirdActivity(View view){
    Intent intent = new Intent(MainActivity.this, VolumenActivity.class);
    startActivity(intent);
}
public void fourthActivity(View view){
    Intent intent = new Intent(MainActivity.this, TemperatureActivity.class);
    startActivity(intent);
}
public void fifthActivity(View view){
    Intent intent = new Intent(MainActivity.this, WeightActivity.class);
    startActivity(intent);
}








}






