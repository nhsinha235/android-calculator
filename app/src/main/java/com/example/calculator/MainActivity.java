package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText display;
    TextView one1,two2,three3,four4,five5,six6,seven7,eight8,nine9,zero0,decimal,clear;
    Button addittion,subtraction,division,multilpication,resultequalto;
     double input1, input2;
      boolean add ,div,sub,mul;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display=findViewById(R.id.editText);
        one1=findViewById(R.id.one);
        two2=findViewById(R.id.two);
        three3=findViewById(R.id.three);
        four4=findViewById(R.id.four);
        five5=findViewById(R.id.five);
        six6=findViewById(R.id.six);
        seven7=findViewById(R.id.seven);
        eight8=findViewById(R.id.eight);
        nine9=findViewById(R.id.nine);
        zero0=findViewById(R.id.zero);
        clear=findViewById(R.id.clear);
        addittion=findViewById(R.id.add);
        subtraction=findViewById(R.id.sub);
        multilpication=findViewById(R.id.mul);
        division=findViewById(R.id.div);
        decimal=findViewById(R.id.decimal);
        resultequalto=findViewById(R.id.result);


        one1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"1");
            }
        });
        two2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"2");
            }
        });
       three3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"3");
            }
        });
        four4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"4");
            }
        });
        five5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"5");
            }
        });
        six6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"6");

            }

        });
        seven7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"7");

            }

        });
        eight8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"8");

            }
        });
        nine9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"9");

            }

        });
        zero0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"0");

            }

        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+".");

            }

        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(null);

            }
        });

        addittion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( display.getText()+"" != null &&  display.getText().length() > 0) {
                    try {
                        input1 = Double.parseDouble(display.getText() + "");
                        add=true;
                        display.setText(null);
                    }
                    catch(Exception e) {
                        System.out.println(e.getMessage());

                    }
                }






            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( display.getText()+"" != null &&  display.getText().length() > 0) {
                    try {
                        input1 = Double.parseDouble(display.getText() + "");
                        sub=true;
                        display.setText(null);
                    }
                    catch(Exception e) {
                        System.out.println(e.getMessage());

                    }
                }
            }
            });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( display.getText()+"" != null &&  display.getText().length() > 0) {
                    try {
                        input1 = Double.parseDouble(display.getText() + "");
                        div=true;
                        display.setText(null);
                    }
                    catch(Exception e) {
                        System.out.println(e.getMessage());

                    }
                }
            }
        });
        multilpication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( display.getText()+"" != null &&  display.getText().length() > 0) {
                    try {
                        input1 = Double.parseDouble(display.getText() + "");
                       mul=true;
                        display.setText(null);
                    }
                    catch(Exception e) {
                        System.out.println(e.getMessage());

                    }
                }
            }
        });


        resultequalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( display.getText()+"" != null &&  display.getText().length() > 0) {
                    try { input2=Double.parseDouble(display.getText()+"");
                        if(add==true)
                        {
                            display.setText(input1+input2+"");
                            add=false;
                        }
                        if(sub==true)
                        {
                            display.setText(input1-input2+"");
                            sub=false;
                        }
                        if(div==true)
                        {
                            display.setText(input1/input2+"");
                            div=false;
                        }
                        if(mul==true)
                        {
                            display.setText(input1*input2+"");
                            mul=false;
                        }


                    }
                    catch(Exception e) {
                        System.out.println(e.getMessage());

                    }
                }






            }
        });

    }

}
