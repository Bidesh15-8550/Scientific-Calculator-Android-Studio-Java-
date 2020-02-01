package com.bideshbiswasbiki.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, btnPlus, btnMinus, btnDivided, btnMul, btnEqual, btnDot, btnAC, btnDel, btnSin, btnLog, btnExc,
                    btnCos, btnTan, btnFirstB, btnSecondB, btnSquare, btnShift, btnLn, btnAns, btnPower;
    private TextView displayOne, displaySec, notification;
    private boolean square, shift, sin, cos, tan, ans, equal, pi, power;
    private double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        displayOne=findViewById(R.id.display1);
        displaySec=findViewById(R.id.display2);

        b0=findViewById(R.id.btn0);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        btnDot=findViewById(R.id.btnDot);
        btnEqual=findViewById(R.id.btnEqual);
        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMin);
        btnMul=findViewById(R.id.btnMul);
        btnDivided=findViewById(R.id.btnDiv);
        btnAC=findViewById(R.id.btnAC);
        btnSin=findViewById(R.id.btnSin);
        btnLog=findViewById(R.id.btnLog);
        btnExc=findViewById(R.id.btnExc);
        btnCos=findViewById(R.id.btnCos);
        btnTan=findViewById(R.id.btnTan);
        btnFirstB=findViewById(R.id.btnFirstB);
        btnSecondB=findViewById(R.id.btnSecondB);
        btnDel=findViewById(R.id.btnDel);
        btnSquare=findViewById(R.id.btnSquare);
        btnShift=findViewById(R.id.btnShift);
        notification=findViewById(R.id.notification);
        btnLn=findViewById(R.id.btnLn);
        btnAns=findViewById(R.id.btnAns);
        btnPower=findViewById(R.id.btnPower);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDivided.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnSin.setOnClickListener(this);
        btnLog.setOnClickListener(this);
        btnExc.setOnClickListener(this);
        btnCos.setOnClickListener(this);
        btnTan.setOnClickListener(this);
        btnFirstB.setOnClickListener(this);
        btnSecondB.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnSquare.setOnClickListener(this);
        btnShift.setOnClickListener(this);
        btnLn.setOnClickListener(this);
        btnAns.setOnClickListener(this);
        btnPower.setOnClickListener(this);

        readNotification();
    }

    private void readNotification() {
        if (shift){
            notification.setText("Shift");
        } else {
            notification.setText("");
        }
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View click) {
        if (click==b0){
            if (equal){
                displaySec.setText("0");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "0");
            }
        } else if (click==b1){
            if (equal){
                displaySec.setText("1");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "1");
            }
        } else if (click==b2){
            if (equal){
                displaySec.setText("2");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "2");
            }
        } else if (click==b3){
            if (equal){
                displaySec.setText("3");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "3");
            }
        } else if (click==b4){
            if (equal){
                displaySec.setText("4");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "4");
            }
        } else if (click==b5){
            if (equal){
                displaySec.setText("5");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "5");
            }
        } else if (click==b6){
            if (equal){
                displaySec.setText("6");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "6");
            }
        } else if (click==b7){
            if (equal){
                displaySec.setText("7");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "7");
            }
        } else if (click==b8){
            if (equal){
                displaySec.setText("8");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "8");
            }
        } else if (click==b9){
            if (equal){
                displaySec.setText("9");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "9");
            }
        } else if (click==btnDot){
            if (equal){
                displaySec.setText(".");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + ".");
            }
        } else if (click==btnPlus){
            if (equal){
                displaySec.setText("+");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "+");
            }
        } else if (click==btnMinus){
            if (equal){
                displaySec.setText("-");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "-");
            }
        } else if (click==btnDivided){
            if (equal){
                displaySec.setText("÷");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "÷");
            }
        } else if (click==btnMul){
            if (equal){
                displaySec.setText("×");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "×");
            }
        } else if (click==btnFirstB){
            if (equal){
                displaySec.setText("(");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "(");
            }
        } else if (click==btnSecondB){
            if (equal){
                displaySec.setText(")");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + ")");
            }
        } else if (click==btnAns){

            if (equal){
                //displaySec.setText(")");
                if (displaySec.getText()==""){
                    answer=0;
                } else {
                    answer=Double.parseDouble(displayOne.getText().toString());
                }
                ans=true;
                displaySec.setText("Ans");
                equal=false;
            }else {
                if (displaySec.getText()==""){
                    answer=0;
                } else {
                    answer=Double.parseDouble(displayOne.getText().toString());
                }
                ans=true;
                displaySec.setText(displaySec.getText()+"Ans");
            }


            /*if (displaySec.getText()==""){
                answer=0;
            } else {
                answer=Double.parseDouble(displayOne.getText().toString());
            }
            ans=true;
            displaySec.setText(displaySec.getText()+"Ans");*/
        } else if (click==btnSquare){
            displaySec.setText(displaySec.getText()+ "²");
            square=true;
            //displayOne.setText(String.valueOf(displaySec.getText().subSequence(0, displaySec.getText().length() - 1)+"mul"));
            //displayOne.setText(String.valueOf(eval(displaySec.getText().toString())));
        } else if (click==btnShift){
            if (!shift){
                shift=true;
            } else {
                shift = false;
            }
            readNotification();
        } else if (click==btnDel){
            displaySec.setText(displaySec.getText().subSequence(0, displaySec.getText().length() - 1));
            ans=false;
        }



        else if (click==btnSin){
            sin=true;
            if (equal){
                if (shift){
                    displaySec.setText("sin⁻¹");
                } else {
                    displaySec.setText("sin");
                }
                equal=false;
            }else {
                if (shift){
                    displaySec.setText(displaySec.getText()+"sin⁻¹");
                } else {
                    displaySec.setText(displaySec.getText() + "sin");
                }
            }
            readNotification();
        }  else if (click==btnCos){
            cos=true;
            if (equal){
                cos=true;
                if (shift){
                    displaySec.setText("cos⁻¹");
                } else {
                    displaySec.setText("cos");
                }
                equal=false;
            }else {
                cos=true;
                if (shift){
                    displaySec.setText(displaySec.getText()+"cos⁻¹");
                } else {
                    displaySec.setText(displaySec.getText() + "cos");
                }
            }
            readNotification();
        }  else if (click==btnTan){
            tan=true;

            if (equal){
                tan=true;
                if (shift){
                    displaySec.setText("tan⁻¹");
                } else {
                    displaySec.setText("tan");
                }
                equal=false;
            }else {
                tan=true;
                if (shift){
                    displaySec.setText(displaySec.getText()+"tan⁻¹");
                } else {
                    displaySec.setText(displaySec.getText() + "tan");
                }
            }

            /*if (shift){
                displaySec.setText(displaySec.getText()+"tan⁻¹");
            } else {
                displaySec.setText(displaySec.getText() + "tan");
            }*/
            readNotification();
        }



        else if (click==btnAC){
            displaySec.setText(null);
            shift=false;
            sin=false;
            cos=false;
            tan=false;
            readNotification();
            ans=false;
            displayOne.setText(null);
        } else if (click==btnLog){
            if (equal){
                displaySec.setText("log");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "log");
            }
        } else if (click==btnLn){
            if (equal){
                displaySec.setText("ln");
                equal=false;
            }else {
                displaySec.setText(displaySec.getText() + "ln");
            }
            //displaySec.setText(displaySec.getText()+"ln");
        } else if (click==btnExc){  //TODO exe button
            pi=true;
            //shift=false;
            if (equal){
                if (shift){
                    displaySec.setText("π");
                } else {
                    displaySec.setText("exp");
                }
                equal=false;
            }else {
                if (shift){
                    displaySec.setText(displaySec.getText()+"π");
                } else {
                    displaySec.setText(displaySec.getText() + "exp");
                }
            }

            /*if (shift){
                displaySec.setText(displaySec.getText()+"π");
            } else {
                displaySec.setText(displaySec.getText() + "exp");
            }*/
            readNotification();

        } else if (click==btnPower){ //TODO
            power=true;
            displaySec.setText(displaySec.getText()+"^");
        }



        else if (click==btnEqual){
            if (ans){
                displayOne.setText(String.valueOf(eval(displaySec.getText().toString().replace("Ans", String.valueOf(answer)))));
            } else {
                if (square){
                    displayOne.setText(String.valueOf(eval("mul"+displaySec.getText().toString().replace("²", ""))));
                    square=false;
                } else if (shift && (sin || cos || tan || pi)){
                    //displayOne.setText(String.valueOf(eval("mul"+displaySec.getText().toString().replace("²", ""))));
                    if (sin){
                        displayOne.setText(String.valueOf(eval("sini"+displaySec.getText().toString().replace("sin⁻¹", ""))));
                        sin=false;
                    } else if (cos){
                        displayOne.setText(String.valueOf(eval("cosi"+displaySec.getText().toString().replace("cos⁻¹", ""))));
                        cos=false;
                    } else if (tan){
                        displayOne.setText(String.valueOf(eval("tani"+displaySec.getText().toString().replace("tan⁻¹", ""))));
                        tan=false;
                    } else {
                        displayOne.setText(String.valueOf(eval("tt"+displaySec.getText().toString().replace("π", ""))));
                        pi=false;
                    }
                    shift=false;
                } else {
                        displayOne.setText(String.valueOf(eval(displaySec.getText().toString())));

                }
                readNotification();
            }
            answer=Double.parseDouble(displayOne.getText().toString());
            equal=true;
            }
    }


    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                try {
                    if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                    return x;
                } catch (Exception e){
                    return 0;
                }
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('×')) x *= parseFactor();
                    else if (eat('÷')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                try {

                    if (eat('+')) return parseFactor();
                    if (eat('-')) return -parseFactor();

                    double x;
                    int startPos = this.pos;
                    if (eat('(')) {
                        x = parseExpression();
                        eat(')');
                    } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                        while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                        x = Double.parseDouble(str.substring(startPos, this.pos));
                    } else if (ch >= 'a' && ch <= 'z') { // functions
                        while (ch >= 'a' && ch <= 'z') nextChar();
                        String func = str.substring(startPos, this.pos);
                        x = parseFactor();
                        try {
                            if (func.equals("sqrt")) x = Math.sqrt(x);
                            else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                            else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                            else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                            else if (func.equals("sini")) x = Math.toDegrees(Math.asin(x));
                            else if (func.equals("cosi")) x = Math.toDegrees(Math.acos(x));
                            else if (func.equals("tani")) x = Math.toDegrees(Math.atan(x));

                                //else if (func.equals("sin")) x = Math.toDegrees(Math.asin(x));
                            else if (func.equals("ln")) x = Math.log(x);
                            else if (func.equals("log")) x = Math.log10(x);
                            else if (func.equals("mul")) x = Math.pow(x, 2);
                            else if (func.equals("exp")) x = Math.pow(10, x);
                            else if (func.equals("t")) x = Math.PI;
                            else if (func.equals("tt")) x = x*Math.PI;  //TODO PI
                            else throw new RuntimeException("Unknown function: " + func);
                        } catch (Exception e){
                            x=0;
                        }
                    } else {
                        throw new RuntimeException("Unexpected: " + (char)ch);
                    }

                    if (eat('^')) x = Math.pow(x, parseFactor());

                    return x;
                } catch (Exception e){
                    return 0.0;
                }
            }
        }.parse();
    }
}
