package com.example.ryan.passoword_validator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Validates the input pasword

    public void buttonOnClick(View v)
    {
        //((Button) v).setText("");

        EditText edt = (EditText)findViewById(R.id.edtPassword);
        TextView txtView = (TextView)findViewById(R.id.textView);

        if(Validator.validate(edt.getText().toString()))
        {
            txtView.setText("Password is Valid");
        }
        else
        {

            txtView.setText("Invalid, please make a better password");
        }

    }
}
