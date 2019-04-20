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

public class Quiz extends AppCompatActivity {

    TextView tv1,tv2,tv21,tv22,tv23,t,tt;
    Button b1,b2,b;
    RadioGroup p,p1;
    RadioButton r1,r2,r3,r4;
    long mt= 11000;
    public int pts=0,rnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tv1 = findViewById(R.id.v);
        b1 = findViewById(R.id.s);
        p = findViewById(R.id.radio);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        rnd= (int)(java.lang.Math.random()*3);
        switch (rnd)
        {
            case 1:
                tt= findViewById(R.id.q1);
                tt.setText("Who is the Rail minister of India?");
                r1.setText("Mr. Hemant Singh");
                r2.setText("Mr. Piyush Goyal");
                r3.setText("Mr. Rajnath Singh");
                r4.setText("Mrs. Sushma Swaraj");
                break;
            case 2:
                tt= findViewById(R.id.q1);
                tt.setText("Who is the Home minister of India?");
                r1.setText("Mr. Hemant Singh");
                r2.setText("Mr. Rajnath Singh");
                r3.setText("Mrs. Smriti Irani");
                r4.setText("Mrs. Sushma Swaraj");
        }
        //Timer
        new CountDownTimer(mt, 1000) {

            public void onTick( long  millisUntilFinished) {
                tv1 = findViewById(R.id.v);
                b1 = findViewById(R.id.s);
                p = findViewById(R.id.radio);
                r1 = findViewById(R.id.r1);
                r2 = findViewById(R.id.r2);
                r3 = findViewById(R.id.r3);
                r4 = findViewById(R.id.r4);
                tv1.setText("seconds remaining: " + millisUntilFinished / 1000);


                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selectedId = p.getCheckedRadioButtonId();
                        switch (selectedId) {
                            case R.id.r2:
                                pts++;
                                String c = Integer.toString(pts);
                                Toast.makeText(Quiz.this, "CORRECT!", Toast.LENGTH_LONG).show();
                                cancel();
                                onFinish();
                                break;
                              default:
                                 String c1 = Integer.toString(pts);
                                Toast.makeText(Quiz.this, "WRONG", Toast.LENGTH_LONG).show();
                                cancel();
                                onFinish();
                        }
                    }
                });
            }

            public void onFinish() {
                qu2();
            }
        }.start();
    }
        public void qu2 () {
            setContentView(R.layout.activity_quiz2);
            tv2 = findViewById(R.id.vv);
            r1 = findViewById(R.id.r11);
            r2 = findViewById(R.id.r22);
            r3 = findViewById(R.id.r33);
            r4 = findViewById(R.id.r44);
            p1 = findViewById(R.id.radio1);
            rnd= (int)(java.lang.Math.random()*3);
            switch (rnd)
            {
                case 1:
                    tt= findViewById(R.id.q1);
                    tt.setText("Who is the ODI captain of Australia ?");
                    r1.setText("David Warner");
                    r2.setText("Ricky Ponting");
                    r3.setText("Smith");
                    r4.setText("Aron Finch");
                    break;
                case 2:
                    tt= findViewById(R.id.q1);
                    tt.setText("Who is the ODI captain of South Africa?");
                    r1.setText("JP Duminy");
                    r2.setText("De Cock");
                    r3.setText("AB De Villers");
                    r4.setText("Faf Du Plessis");
            }

            new CountDownTimer(11000, 1000) {

                public void onTick(long millisUntilFinished) {
                    b2 = findViewById(R.id.ss);
                    tv2 = findViewById(R.id.vv);
                    r1 = findViewById(R.id.r11);
                    r2 = findViewById(R.id.r22);
                    r3 = findViewById(R.id.r33);
                    r4 = findViewById(R.id.r44);
                    p1 = findViewById(R.id.radio1);
                    tv2.setText("seconds remaining: " + millisUntilFinished / 1000);
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int si2 = p1.getCheckedRadioButtonId();
                            switch (si2) {
                                case R.id.r44:
                                    pts++;
                                    String c = Integer.toString(pts);
                                    Toast.makeText(Quiz.this, "CORRECT!", Toast.LENGTH_LONG).show();
                                    cancel();
                                    onFinish();
                                    break;
                                    default:
                                        String c1 = Integer.toString(pts);
                                        Toast.makeText(Quiz.this, "WRONG", Toast.LENGTH_LONG).show();
                                        cancel();
                                        onFinish();
                            }


                        }
                    });
                }

                @Override
                public void onFinish() {
                q3();
                }
            }.start();
        }
        public void q3(){

            setContentView(R.layout.activity_quiz3);
            mt=11000;
            tv2 = findViewById(R.id.vv);
            r1 = findViewById(R.id.r11);
            r2 = findViewById(R.id.r22);
            r3 = findViewById(R.id.r33);
            r4 = findViewById(R.id.r44);
            p1 = findViewById(R.id.radio1);
            rnd= (int)(java.lang.Math.random()*3);
            switch (rnd)
            {
                case 1:
                    tt= findViewById(R.id.q1);
                    tt.setText("What is the capital of Jharkhand ?");
                    r1.setText("Dhanbad");
                    r2.setText("Ranchi");
                    r3.setText("Jamshedpur");
                    r4.setText("Bokaro");
                    break;
                case 2:
                    tt= findViewById(R.id.q1);
                    tt.setText("What is the capital of Nagaland?");
                    r1.setText("Koderma");
                    r2.setText("Kohima");
                    r3.setText("Kanchipuram");
                    r4.setText("Tripura");
            }

            new CountDownTimer(mt, 1000) {

                public void onTick(long millisUntilFinished) {
                    b2 = findViewById(R.id.ss);
                    tv21 = findViewById(R.id.vv3);
                    r1 = findViewById(R.id.r11);
                    r2 = findViewById(R.id.r22);
                    r3 = findViewById(R.id.r33);
                    r4 = findViewById(R.id.r44);
                    p1 = findViewById(R.id.radio1);
                    tv21.setText("seconds remaining: " + millisUntilFinished / 1000);
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int si2 = p1.getCheckedRadioButtonId();
                            switch (si2) {
                                case R.id.r22:
                                    pts++;
                                    String c = Integer.toString(pts);
                                    Toast.makeText(Quiz.this, "CORRECT!", Toast.LENGTH_LONG).show();
                                    cancel();
                                    onFinish();
                                    break;
                                    default:
                                    String c1 = Integer.toString(pts);
                                    Toast.makeText(Quiz.this, "WRONG", Toast.LENGTH_LONG).show();
                                    cancel();
                                    onFinish();
                            }

                        }
                    });
                }

                @Override
                public void onFinish() {
                  q4();
                }
            }.start();

        }

        public void q4(){

            setContentView(R.layout.activity_quiz4);
            mt= 11000;

            tv2 = findViewById(R.id.vv);
            r1 = findViewById(R.id.r11);
            r2 = findViewById(R.id.r22);
            r3 = findViewById(R.id.r33);
            r4 = findViewById(R.id.r44);
            p1 = findViewById(R.id.radio1);
            rnd= (int)(java.lang.Math.random()*3);
            switch (rnd)
            {
                case 1:
                    tt= findViewById(R.id.q1);
                    tt.setText("In which state river Ganga don't flow?");
                    r1.setText("West Bengal");
                    r2.setText("Uttar Pradesh");
                    r3.setText("Bihar");
                    r4.setText("Odisha");
                    break;
                case 2:
                    tt= findViewById(R.id.q1);
                    tt.setText("Which city/town is not in Maharashtra?");
                    r1.setText("Andheri");
                    r2.setText("Nasik");
                    r3.setText("Nagpur");
                    r4.setText("Kochi");
            }
            new CountDownTimer(mt, 1000) {

                public void onTick(long millisUntilFinished) {
                    b2 = findViewById(R.id.ss);
                    tv22 = findViewById(R.id.vv4);
                    r1 = findViewById(R.id.r11);
                    r2 = findViewById(R.id.r22);
                    r3 = findViewById(R.id.r33);
                    r4 = findViewById(R.id.r44);
                    p1 = findViewById(R.id.radio1);
                    tv22.setText("seconds remaining: " + millisUntilFinished / 1000);
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int si2 = p1.getCheckedRadioButtonId();
                            switch (si2) {
                                case R.id.r44:
                                    pts++;
                                    String c = Integer.toString(pts);
                                    Toast.makeText(Quiz.this, "CORRECT!", Toast.LENGTH_LONG).show();
                                    cancel();
                                    onFinish();
                                    break;
                                    default:

                                    String c1 = Integer.toString(pts);
                                    Toast.makeText(Quiz.this, "WRONG", Toast.LENGTH_LONG).show();
                                    cancel();
                                    onFinish();
                            }

                        }
                    });
                }

                @Override
                public void onFinish() {
                    q5();
                }
            }.start();


        }
        public void q5(){

            setContentView(R.layout.activity_quiz5);
            mt=11000;

            tv2 = findViewById(R.id.vv);
            r1 = findViewById(R.id.r11);
            r2 = findViewById(R.id.r22);
            r3 = findViewById(R.id.r33);
            r4 = findViewById(R.id.r44);
            p1 = findViewById(R.id.radio1);
            rnd= (int)(java.lang.Math.random()*3);
            switch (rnd)
            {
                case 1:
                    tt= findViewById(R.id.q1);
                    tt.setText("Who is the president of Russia?");
                    r1.setText("Nikita Khrushchev");
                    r2.setText("Boris Yeltsin");
                    r3.setText("Valdimir Putin");
                    r4.setText("Dmitry Medvedev");
                    break;
                case 2:
                    tt= findViewById(R.id.q1);
                    tt.setText("What is the prime minister of Pakistan?");
                    r1.setText("Imran Hasmi");
                    r2.setText("Nawas Sharif");
                    r3.setText("Perwaiz Ashraf");
                    r4.setText("Imran Khan");
            }
            new CountDownTimer(mt, 1000) {

                public void onTick(long millisUntilFinished) {
                    b2 = findViewById(R.id.ss);
                    tv23 = findViewById(R.id.vv5);
                    r1 = findViewById(R.id.r11);
                    r2 = findViewById(R.id.r22);
                    r3 = findViewById(R.id.r33);
                    r4 = findViewById(R.id.r44);
                    p1 = findViewById(R.id.radio1);
                    tv23.setText("seconds remaining: " + millisUntilFinished / 1000);
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int si2 = p1.getCheckedRadioButtonId();
                            switch (si2) {
                                case R.id.r33:
                                    pts++;
                                    String c = Integer.toString(pts);
                                    Toast.makeText(Quiz.this, "CORRECT!", Toast.LENGTH_LONG).show();
                                    cancel();
                                    onFinish();
                                    break;
                                  default:
                                    String c1 = Integer.toString(pts);
                                    Toast.makeText(Quiz.this, "WRONG", Toast.LENGTH_LONG).show();
                                    cancel();
                                    onFinish();
                            }

                        }
                    });
                }

                @Override
                public void onFinish() {
                 q6();
                }
            }.start();


        }
          public void q6(){

              setContentView(R.layout.activity_quiz6);
              mt=11000;

              tv2 = findViewById(R.id.vv);
              r1 = findViewById(R.id.r11);
              r2 = findViewById(R.id.r22);
              r3 = findViewById(R.id.r33);
              r4 = findViewById(R.id.r44);
              p1 = findViewById(R.id.radio1);
              rnd= (int)(java.lang.Math.random()*3);
              switch (rnd)
              {
                  case 1:
                      tt= findViewById(R.id.q1);
                      tt.setText("What is the national bird of India?");
                      r1.setText("Peacock");
                      r2.setText("Crow");
                      r3.setText("Pigeon");
                      r4.setText("Sparrow");
                      break;
                  case 2:
                      tt= findViewById(R.id.q1);
                      tt.setText("What is the national animal of India?");
                      r1.setText("Tiger");
                      r2.setText("Lion");
                      r3.setText("Leopard");
                      r4.setText("Cheetah");
              }
              new CountDownTimer(mt, 1000) {

                  public void onTick(long millisUntilFinished) {
                      b2 = findViewById(R.id.ss);
                      tv23 = findViewById(R.id.vv6);
                      r1 = findViewById(R.id.r11);
                      r2 = findViewById(R.id.r22);
                      r3 = findViewById(R.id.r33);
                      r4 = findViewById(R.id.r44);
                      p1 = findViewById(R.id.radio1);
                      tv23.setText("seconds remaining: " + millisUntilFinished / 1000);
                      b2.setOnClickListener(new View.OnClickListener() {
                          @Override
                          public void onClick(View v) {
                              int si2 = p1.getCheckedRadioButtonId();
                              switch (si2) {
                                  case R.id.r11:
                                      pts++;
                                      String c = Integer.toString(pts);
                                      Toast.makeText(Quiz.this, "CORRECT!", Toast.LENGTH_LONG).show();
                                      cancel();
                                      onFinish();
                                      break;
                                  default:
                                      String c1 = Integer.toString(pts);
                                      Toast.makeText(Quiz.this, "WRONG", Toast.LENGTH_LONG).show();
                                      cancel();
                                      onFinish();
                              }

                          }
                      });
                  }

                  @Override
                  public void onFinish() {
                    qu7();
                  }
              }.start();



          }
          public void qu7()
          {
              setContentView(R.layout.activity_quiz7);
              mt=11000;
              tv2 = findViewById(R.id.vv);
              r1 = findViewById(R.id.r11);
              r2 = findViewById(R.id.r22);
              r3 = findViewById(R.id.r33);
              r4 = findViewById(R.id.r44);
              p1 = findViewById(R.id.radio1);
              rnd= (int)(java.lang.Math.random()*3);
              switch (rnd)
              {
                  case 1:
                      tt= findViewById(R.id.q1);
                      tt.setText("Which team has winner of most IPL seasons?");
                      r1.setText("Royal Challengers Bangalore");
                      r2.setText("Rajasthan Royals");
                      r3.setText("Chennai Super Kings");
                      r4.setText("Mumbai Indians");
                      break;
                  case 2:
                      tt= findViewById(R.id.q1);
                      tt.setText("Which is the first IPL season winner?");
                      r1.setText("Deccan Chargers");
                      r2.setText("Mumbai Indians");
                      r3.setText("Chennai Super Kings");
                      r4.setText("Rajasthan Royals");
              }

              new CountDownTimer(mt, 1000) {

                  public void onTick(long millisUntilFinished) {
                      b2 = findViewById(R.id.ss);
                      tv23 = findViewById(R.id.vv7);
                      r1 = findViewById(R.id.r11);
                      r2 = findViewById(R.id.r22);
                      r3 = findViewById(R.id.r33);
                      r4 = findViewById(R.id.r44);
                      p1 = findViewById(R.id.radio1);
                      tv23.setText("seconds remaining: " + millisUntilFinished / 1000);
                      b2.setOnClickListener(new View.OnClickListener() {
                          @Override
                          public void onClick(View v) {
                              int si2 = p1.getCheckedRadioButtonId();
                              switch (si2) {
                                  case R.id.r44:
                                      pts++;
                                      String c = Integer.toString(pts);
                                      Toast.makeText(Quiz.this, "CORRECT!", Toast.LENGTH_LONG).show();
                                      cancel();
                                      onFinish();
                                      break;
                                  default:
                                      String c1 = Integer.toString(pts);
                                      Toast.makeText(Quiz.this, "WRONG", Toast.LENGTH_LONG).show();
                                      cancel();
                                      onFinish();
                              }

                          }
                      });
                  }

                  @Override
                  public void onFinish() {
                      over();

                  }
              }.start();



          }

          public void over()
          {
              setContentView(R.layout.activity_last);
              t=findViewById(R.id.txt1);
              b= findViewById(R.id.bt);
              String c = Integer.toString(pts);
              t.setText("G.K. SCORE: "+c+"/7");
              b.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      Intent ob= new Intent(Quiz.this,MainActivity.class);
                      startActivity(ob);
                  }
              });
          }


}
