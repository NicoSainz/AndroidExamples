package com.example.nicolas.timer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private long inicio=0, fin=0, res=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean onTouchEvent(MotionEvent event) {
        int action = MotionEventCompat.getActionMasked(event);

        switch (action) {
            case (MotionEvent.ACTION_DOWN):
                inicio = System.currentTimeMillis();
                return true;

            case (MotionEvent.ACTION_UP):
                fin = System.currentTimeMillis();
                res = (fin-inicio);
                Toast.makeText(this.getApplicationContext(),"Presionaste " + res + " Milisegundos",Toast.LENGTH_SHORT).show();
                return true;

            default:
                return true;
        }
    }
}
