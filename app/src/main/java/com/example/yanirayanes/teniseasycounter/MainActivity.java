package com.example.yanirayanes.teniseasycounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView w, x, y, z;
    private int ptsa, ptsb, ca, cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ptsa = 0;
        ptsb = 0;
        ca = 0;
        cb = 0;
        w = findViewById(R.id.auno);
        x = findViewById(R.id.buno);
        y = findViewById(R.id.ados);
        z = findViewById(R.id.bdos);
    }
    public void a(View View){
        ptsa = ptsa + 1;
        w.setText(ptsa + "");
    }
    public void b(View View){
        ptsb = ptsb + 1;
        x.setText(ptsb + "");
    }
    public void c(View View){
        switch ( ca ) {
            case 0:
                y.setText(15+"");
                ca = ca + 1;
                break;
            case 1:
                y.setText(30+"");
                ca = ca + 1;
                break;
            case 2:
                y.setText(40+"");
                ca = ca + 1;
                break;
            case 3:
                if(cb == 4){
                    cb = 3;
                    z.setText(40+"");
                }else{
                    if(cb != 3){
                        cb = 0;
                        ca = 0;
                        ptsa = ptsa + 1;
                        w.setText(ptsa + "");
                        y.setText(0+"");
                        z.setText(0+"");
                    }else{
                        if(ca == 3 && cb == 3){
                            y.setText("A");
                            ca = ca + 1;
                        }
                    }
                }
                break;
            case 4:
                cb = 0;
                ca = 0;
                ptsa = ptsa + 1;
                w.setText(ptsa + "");
                y.setText(0+"");
                z.setText(0+"");
                break;
        }
        }
    public void d(View View){
        switch ( cb ) {
            case 0:
                z.setText(15+"");
                cb = cb + 1;
                break;
            case 1:
                z.setText(30+"");
                cb = cb + 1;
                break;
            case 2:
                z.setText(40+"");
                cb = cb + 1;
                break;
            case 3:
                if(ca == 4){
                    ca = 3;
                    y.setText(40+"");
                }else{
                    if(ca != 3){
                        cb = 0;
                        ca = 0;
                        ptsb = ptsb + 1;
                        x.setText(ptsb + "");
                        y.setText(0+"");
                        z.setText(0+"");
                    }else{
                        if(ca == 3 && cb == 3){
                            z.setText("A");
                            cb = cb + 1;
                        }
                    }
                }
                break;
            case 4:
                cb = 0;
                ca = 0;
                ptsb = ptsb + 1;
                x.setText(ptsb + "");
                y.setText(0+"");
                z.setText(0+"");
                break;
        }
    }
    public void r(View View){
        ptsa = 0;
        ptsb = 0;
        ca = 0;
        cb = 0;
        w.setText(ptsa + "");
        x.setText(ptsb + "");
        y.setText(0 + "");
        z.setText(0 + "");
    }
}

