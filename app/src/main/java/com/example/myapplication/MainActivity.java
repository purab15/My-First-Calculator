package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,clr,sub,add,div,mul,dot,equal;
    EditText op;
    TextView text;
    float res1=0,res2=0,result1;
    Boolean addition=false,subtraction=false,multiplication=false,division=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        clr=(Button)findViewById(R.id.clr);
        sub=(Button)findViewById(R.id.sub);
        add=(Button)findViewById(R.id.add);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        dot=(Button)findViewById(R.id.dot);
        equal=(Button)findViewById(R.id.equal);
        op=(EditText) findViewById(R.id.op);
        text=(TextView)findViewById(R.id.text);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText(op.getText()+"1");
                res1=1;
                res2=1;
                text.setText("");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText(op.getText()+"2");
                res1=1;
                res2=1;
                text.setText("");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText(op.getText()+"3");
                res1=1;
                res2=1;
                text.setText("");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText(op.getText()+"4");
                res1=1;
                res2=1;
                text.setText("");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText(op.getText()+"5");
                res1=1;
                res2=1;
                text.setText("");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText(op.getText()+"6");
                res1=1;
                res2=1;
                text.setText("");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText(op.getText()+"0");
                res1=1;
                res2=1;
                text.setText("");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText(op.getText()+".");
                text.setText("");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText(op.getText()+"7");
                res1=1;
                res2=1;
                text.setText("");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText(op.getText()+"8");
                res1=1;
                res2=1;
                text.setText("");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText(op.getText()+"9");
                res1=1;
                res2=1;
                text.setText("");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res1==0)
                {
                    text.setText("ENTER THE FIRST VALUE");
                }
                else
                {
                    res1=Float.parseFloat(op.getText().toString()+ "");
                    result1=res1;
                    res2=0;
                    addition=true;
                    op.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res1==0)
                {
                    text.setText("ENTER THE FIRST VALUE");
                }
                else
                {
                    res1=Float.parseFloat(op.getText().toString()+ "");
                    subtraction=true;
                    res2=0;
                    result1=res1;
                    op.setText(null);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res1==0)
                {
                    text.setText("ENTER THE FIRST VALUE");
                }
                else
                {
                    res1=Float.parseFloat(op.getText().toString()+ "");
                    multiplication=true;
                    res2=0;
                    result1=res1;
                    op.setText(null);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res1==0)
                {
                    text.setText("ENTER THE FIRST VALUE");
                }
                else
                {
                    res1=Float.parseFloat(op.getText().toString()+ "");
                    division=true;
                    res2=0;
                    result1=res1;
                    op.setText(null);
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res1==0 && res2==0)
                {
                    text.setText("SYNTAX ERROR");
                }
                else if (res2 == 0)
                {
                    text.setText("ENTER THE SECOND VALUE");
                }
                else
                {
                    res2 = Float.parseFloat(op.getText().toString() + "");
                    if (addition) {
                        op.setText(String.valueOf(result1 + res2 + ""));
                        addition = false;

                    } else if (subtraction) {
                        op.setText(String.valueOf(result1 - res2 + ""));
                        subtraction = false;

                    } else if (multiplication) {
                        op.setText(String.valueOf(result1 * res2 + ""));
                        multiplication = false;

                    } else {
                        op.setText(String.valueOf(result1 / res2 + ""));
                        division = false;

                    }
                }
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText(null);
                res1=0;
                res2=0;
                text.setText(null);
            }
        });

    }
}



