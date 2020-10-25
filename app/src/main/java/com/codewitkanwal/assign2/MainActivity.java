package com.codewitkanwal.assign2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.codewitkanwal.assign2.R.string.c1;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(MainActivity.this,SecondActivity.class);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCheckedBox(view);
                startActivity(intent);

            }
        });
    }
        public void onCheckedBox(View view){


            CheckBox c1 = findViewById(R.id.c1);
            if(c1.isChecked()){
                intent.putExtra("c1","check1");
            }

            CheckBox c2 = findViewById(R.id.c2);
            if(c2.isChecked()){
                intent.putExtra("c2","check2");
            }

            CheckBox c3 = findViewById(R.id.c3);
            if(c3.isChecked()){
                intent.putExtra("c3","check3");
            }

            CheckBox c4 = findViewById(R.id.c4);
            if(c4.isChecked()){
                intent.putExtra("c4","check4");
            }




        

    }



}


