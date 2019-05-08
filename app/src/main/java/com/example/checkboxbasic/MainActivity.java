package com.example.checkboxbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox ob1,ob2,ob3,ob4,ob5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ob1=findViewById(R.id.checkandroid);
        ob1.setOnClickListener(this);

        ob2=findViewById(R.id.checkjava);
        ob2.setOnClickListener(this);

        ob3=findViewById(R.id.checkphp);
        ob3.setOnClickListener(this);

        ob4=findViewById(R.id.checkpython);
        ob4.setOnClickListener(this);

        ob5=findViewById(R.id.checkunity);
        ob5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.checkandroid:
                if(ob1.isChecked())
                    Toast.makeText(getApplicationContext(),"Android",Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkjava:
                if(ob2.isChecked())
                    Toast.makeText(getApplicationContext(),"Java",Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkphp:
                if(ob3.isChecked())
                    Toast.makeText(getApplicationContext(),"PHP",Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkpython:
                if(ob4.isChecked())
                    Toast.makeText(getApplicationContext(),"Python",Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkunity:
                if(ob5.isChecked())
                    Toast.makeText(getApplicationContext(),"Unity 3D",Toast.LENGTH_SHORT).show();
                break;


        }

    }
}
