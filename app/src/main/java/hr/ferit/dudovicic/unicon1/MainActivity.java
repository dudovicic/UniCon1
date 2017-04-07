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
    Toast.makeText(MainActivity.this,R.string.Toast1, Toast.LENGTH_SHORT).show();
}

public void thirdActivity(View view){
    Intent intent = new Intent(MainActivity.this, VolumenActivity.class);
    startActivity(intent);
    Toast.makeText(MainActivity.this,R.string.Toast2, Toast.LENGTH_SHORT).show();

}
public void fourthActivity(View view){
    Intent intent = new Intent(MainActivity.this, TemperatureActivity.class);
    startActivity(intent);
    Toast.makeText(MainActivity.this,R.string.Toast3, Toast.LENGTH_SHORT).show();

}
public void fifthActivity(View view){
    Intent intent = new Intent(MainActivity.this, WeightActivity.class);
    startActivity(intent);
    Toast.makeText(MainActivity.this,R.string.Toast4, Toast.LENGTH_SHORT).show();

}








}






