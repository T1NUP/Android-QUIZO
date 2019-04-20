package com.example.quizo;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Math extends AppCompatActivity {

    Button b1;
    TextView t1,t2,q;
    RadioGroup g;
    RadioButton r1,r2,r3,r4,r5;
    public int sc=0,rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mq);

        //question/answer changer
        t1= findViewById(R.id.tm1);
        g= findViewById(R.id.rg);
        q= findViewById(R.id.q);
        t2= findViewById(R.id.s);
        r1= findViewById(R.id.o1);
        r2= findViewById(R.id.o2);
        r3= findViewById(R.id.o3);
        r4= findViewById(R.id.o4);
        r5= findViewById(R.id.o5);
        rnd= (int)(java.lang.Math.random()*3);
        switch (rnd) {
            case 1:
                q.setText("17+11= ");
                r1.setText("28");
                r2.setText("26");
                r3.setText("29");
                r4.setText("24");
                r5.setText("27");
                break;
            case 2:
                q.setText("19-11= ");
                r1.setText("8");
                r2.setText("7");
                r3.setText("9");
                r4.setText("5");
                r5.setText("10");
                break;
        }

        new CountDownTimer(20000,1000)
        {
            @Override
            public void onTick(long millisUntilFinished) {
                t1= findViewById(R.id.tm1);
                g= findViewById(R.id.rg);
                q= findViewById(R.id.q);
                t2= findViewById(R.id.s);
                r1= findViewById(R.id.o1);
                r2= findViewById(R.id.o2);
                r3= findViewById(R.id.o3);
                r4= findViewById(R.id.o4);
                r5= findViewById(R.id.o5);
                b1= findViewById(R.id.sbt);



                t1.setText("seconds remaining: " + millisUntilFinished / 1000);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selectedId = g.getCheckedRadioButtonId();
                        switch (selectedId) {
                            case R.id.o1:
                                sc++;

                                cancel();
                                onFinish();
                                break;
                            default:

                                cancel();
                                onFinish();
                        }
                    }
                });

            }

            @Override
            public void onFinish() {
                String c = Integer.toString(sc);
                t2.setText("CORRECT ANSWERS= "+c);
                mq2();
            }
        }.start();

    }

    public void mq2()
    {
        setContentView(R.layout.mq2);

        t1= findViewById(R.id.tm1);
        g= findViewById(R.id.rg);
        q= findViewById(R.id.q);
        t2= findViewById(R.id.s);
        r1= findViewById(R.id.o1);
        r2= findViewById(R.id.o2);
        r3= findViewById(R.id.o3);
        r4= findViewById(R.id.o4);
        r5= findViewById(R.id.o5);
        String c = Integer.toString(sc);
        t2.setText("CORRECT ANSWERS= "+c);
        rnd= (int)(java.lang.Math.random()*3);
        switch (rnd) {
            case 1:
                q.setText("364+79= ");
                r1.setText("486");
                r2.setText("454");
                r3.setText("443");
                r4.setText("446");
                r5.setText("431");
                break;
            case 2:
                q.setText("517/11= ");
                r1.setText("43");
                r2.setText("49");
                r3.setText("47");
                r4.setText("51");
                r5.setText("38");
                break;
        }
        new CountDownTimer(20000,1000)
        {
            @Override
            public void onTick(long millisUntilFinished) {

                t1.setText("seconds remaining: " + millisUntilFinished / 1000);
                b1= findViewById(R.id.sbt);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selectedId = g.getCheckedRadioButtonId();
                        switch (selectedId) {
                            case R.id.o3:
                                sc++;

                                cancel();
                                onFinish();
                                break;
                            default:

                                cancel();
                                onFinish();
                        }
                    }
                });

            }

            @Override
            public void onFinish() {
                String c = Integer.toString(sc);
                t2.setText("CORRECT ANSWERS= "+c);
                mq3();
            }
        }.start();
    }

    public void mq3()
    {
        setContentView(R.layout.mq3);
        t1= findViewById(R.id.tm1);
        g= findViewById(R.id.rg);
        q= findViewById(R.id.q);
        t2= findViewById(R.id.s);
        r1= findViewById(R.id.o1);
        r2= findViewById(R.id.o2);
        r3= findViewById(R.id.o3);
        r4= findViewById(R.id.o4);
        r5= findViewById(R.id.o5);
        String c = Integer.toString(sc);
        t2.setText("CORRECT ANSWERS= "+c);
        rnd= (int)(java.lang.Math.random()*3);
        switch (rnd) {
            case 1:
                q.setText("88*9= ");
                r1.setText("782");
                r2.setText("762");
                r3.setText("802");
                r4.setText("772");
                r5.setText("792");
                break;
            case 2:
                q.setText("1144/11= ");
                r1.setText("144");
                r2.setText("113");
                r3.setText("134");
                r4.setText("124");
                r5.setText("104");
                break;
        }
        new CountDownTimer(20000,1000)
        {
            @Override
            public void onTick(long millisUntilFinished) {

                t1.setText("seconds remaining: " + millisUntilFinished / 1000);
                b1= findViewById(R.id.sbt);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selectedId = g.getCheckedRadioButtonId();
                        switch (selectedId) {
                            case R.id.o5:
                                sc++;

                                cancel();
                                onFinish();
                                break;
                            default:

                                cancel();
                                onFinish();
                        }
                    }
                });

            }

            @Override
            public void onFinish() {
                String c = Integer.toString(sc);
                t2.setText("CORRECT ANSWERS= "+c);
                mq4();
            }
        }.start();

    }

    public void mq4()
    {
        setContentView(R.layout.mq4);

        t1= findViewById(R.id.tm1);
        g= findViewById(R.id.rg);
        q= findViewById(R.id.q);
        t2= findViewById(R.id.s);
        r1= findViewById(R.id.o1);
        r2= findViewById(R.id.o2);
        r3= findViewById(R.id.o3);
        r4= findViewById(R.id.o4);
        r5= findViewById(R.id.o5);
        String c = Integer.toString(sc);
        t2.setText("CORRECT ANSWERS= "+c);
        rnd= (int)(java.lang.Math.random()*3);
        switch (rnd) {
            case 1:
                q.setText("3649+79849= ");
                r1.setText("86598");
                r2.setText("78438");
                r3.setText("78948");
                r4.setText("83498");
                r5.setText("78968");
                break;
            case 2:
                q.setText("11146-283= ");
                r1.setText("10386");
                r2.setText("11263");
                r3.setText("11343");
                r4.setText("10863");
                r5.setText("15633");
                break;
        }
        new CountDownTimer(20000,1000)
        {
            @Override
            public void onTick(long millisUntilFinished) {

                t1.setText("seconds remaining: " + millisUntilFinished / 1000);
                b1= findViewById(R.id.sbt);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selectedId = g.getCheckedRadioButtonId();
                        switch (selectedId) {
                            case R.id.o4:
                                sc++;

                                cancel();
                                onFinish();
                                break;
                            default:

                                cancel();
                                onFinish();
                        }
                    }
                });

            }

            @Override
            public void onFinish() {
                String c = Integer.toString(sc);
                t2.setText("CORRECT ANSWERS= "+c);
                mq5();
            }
        }.start();

    }

    public void mq5()
    {
        setContentView(R.layout.mq5);

        t1= findViewById(R.id.tm1);
        g= findViewById(R.id.rg);
        q= findViewById(R.id.q);
        t2= findViewById(R.id.s);
        r1= findViewById(R.id.o1);
        r2= findViewById(R.id.o2);
        r3= findViewById(R.id.o3);
        r4= findViewById(R.id.o4);
        r5= findViewById(R.id.o5);
        String c = Integer.toString(sc);
        t2.setText("CORRECT ANSWERS= "+c);
        rnd= (int)(java.lang.Math.random()*3);
        switch (rnd) {
            case 1:
                q.setText("277+550/50*3= ");
                r1.setText("320");
                r2.setText("270");
                r3.setText("410");
                r4.setText("330");
                r5.setText("310");
                break;
            case 2:
                q.setText("8*(1+343/7)= ");
                r1.setText("500");
                r2.setText("450");
                r3.setText("550");
                r4.setText("350");
                r5.setText("400");
                break;
        }
        new CountDownTimer(20000,1000)
        {
            @Override
            public void onTick(long millisUntilFinished) {

                t1.setText("seconds remaining: " + millisUntilFinished / 1000);
                b1= findViewById(R.id.sbt);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selectedId = g.getCheckedRadioButtonId();
                        switch (selectedId) {
                            case R.id.o5:
                                sc++;

                                cancel();
                                onFinish();
                                break;
                            default:

                                cancel();
                                onFinish();
                        }
                    }
                });

            }

            @Override
            public void onFinish() {
                String c = Integer.toString(sc);
                t2.setText("CORRECT ANSWERS= "+c);
                mq6();
            }
        }.start();

    }
    public void mq6()
    {
        setContentView(R.layout.mq6);

        t1= findViewById(R.id.tm1);
        g= findViewById(R.id.rg);
        q= findViewById(R.id.q);
        t2= findViewById(R.id.s);
        r1= findViewById(R.id.o1);
        r2= findViewById(R.id.o2);
        r3= findViewById(R.id.o3);
        r4= findViewById(R.id.o4);
        r5= findViewById(R.id.o5);
        String c = Integer.toString(sc);
        t2.setText("CORRECT ANSWERS= "+c);
        rnd= (int)(java.lang.Math.random()*3);
        switch (rnd) {
            case 1:
                q.setText("10+9*6+98/7= ");
                r1.setText("43");
                r2.setText("78");
                r3.setText("67");
                r4.setText("57");
                r5.setText("63");
                break;
            case 2:
                q.setText("13*4/4+17= ");
                r1.setText("28");
                r2.setText("30");
                r3.setText("29");
                r4.setText("31");
                r5.setText("33");
                break;
        }
        new CountDownTimer(20000,1000)
        {
            @Override
            public void onTick(long millisUntilFinished) {

                t1.setText("seconds remaining: " + millisUntilFinished / 1000);
                b1= findViewById(R.id.sbt);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selectedId = g.getCheckedRadioButtonId();
                        switch (selectedId) {
                            case R.id.o2:
                                sc++;

                                cancel();
                                onFinish();
                                break;
                            default:

                                cancel();
                                onFinish();
                        }
                    }
                });

            }

            @Override
            public void onFinish() {
                String c = Integer.toString(sc);
                t2.setText("CORRECT ANSWERS= "+c);
                mq7();
            }
        }.start();

    }

    public void mq7()
    {
        setContentView(R.layout.mq7);

        t1= findViewById(R.id.tm1);
        g= findViewById(R.id.rg);
        q= findViewById(R.id.q);
        t2= findViewById(R.id.s);
        r1= findViewById(R.id.o1);
        r2= findViewById(R.id.o2);
        r3= findViewById(R.id.o3);
        r4= findViewById(R.id.o4);
        r5= findViewById(R.id.o5);
        String c = Integer.toString(sc);
        t2.setText("CORRECT ANSWERS= "+c);
        rnd= (int)(java.lang.Math.random()*3);
        switch (rnd) {
            case 1:
                q.setText("2*3*5*0+61= ");
                r1.setText("91");
                r2.setText("101");
                r3.setText("61");
                r4.setText("81");
                r5.setText("111");
                break;
            case 2:
                q.setText("(2*5+90/9)*20-50= ");
                r1.setText("250");
                r2.setText("300");
                r3.setText("350");
                r4.setText("400");
                r5.setText("450");
                break;
        }
        new CountDownTimer(20000,1000)
        {
            @Override
            public void onTick(long millisUntilFinished) {

                t1.setText("seconds remaining: " + millisUntilFinished / 1000);
                b1= findViewById(R.id.sbt);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selectedId = g.getCheckedRadioButtonId();
                        switch (selectedId) {
                            case R.id.o3:
                                sc++;

                                cancel();
                                onFinish();
                                break;
                            default:

                                cancel();
                                onFinish();
                        }
                    }
                });

            }

            @Override
            public void onFinish() {
                String c = Integer.toString(sc);
                t2.setText("CORRECT ANSWERS= "+c);
                mqe();
            }
        }.start();
    }

    public void mqe()
    {
        setContentView(R.layout.activity_last);
        t2= findViewById(R.id.txt1);
        b1= findViewById(R.id.bt);
        String c = Integer.toString(sc);
        t2.setText("MATHS SCORE= "+c+"/7");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob= new Intent(Math.this,MainActivity.class);
                startActivity(ob);
            }
        });

    }
}
