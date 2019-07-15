package com.example.myjava;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    private EditText editNum1;
    private EditText editNum2;
    private EditText editOperator;
    private TextView resultNum;
    private Button btnResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNum1=findViewById(R.id.editText1);
        editNum2=findViewById(R.id.editText3);
        editOperator=findViewById(R.id.editText2);
        btnResult=findViewById(R.id.button);
        resultNum=findViewById(R.id.textView);
    }
    public void calculate(View view)
    {
        double numFirst=0;
        double numSecond=0;
        double numResult=0;

        String strFirst=editNum1.getText().toString();
        String strSecond=editNum2.getText().toString();
        String strOperator=editOperator.getText().toString();
        numFirst=Double.parseDouble(strFirst);
        numSecond=Double.parseDouble(strSecond);
        if(strOperator.equals("+")) numResult=numFirst+numSecond;
        if(strOperator.equals("-")) numResult=numFirst-numSecond;
        if(strOperator.equals("*")) numResult=numFirst*numSecond;
        if(strOperator.equals("/")) numResult=numFirst/numSecond;
//
//        resultNum.setText(String.valueOf(numResult));
        Intent intent=new Intent(this,Main2Activity .class);
        intent.putExtra("result",String.valueOf(numResult));
        startActivity(intent);

    }
}
