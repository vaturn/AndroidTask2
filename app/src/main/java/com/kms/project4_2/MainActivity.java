package com.kms.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn;
    CheckBox cb;
    RadioButton rb_dog, rb_cat, rb_rabbit;
    RadioGroup rb_g;
    ImageView img;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.BtnOK);
        cb = findViewById(R.id.ChkAgree);
        rb_cat = findViewById(R.id.RdoCat);
        rb_dog = findViewById(R.id.RdoDog);
        rb_rabbit = findViewById(R.id.RdoRabbit);
        img = findViewById(R.id.ImgPet);
        rb_g = findViewById(R.id.Rgroup1);
        tx = findViewById(R.id.Text2);

        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb.isChecked() == true){
                    btn.setVisibility(View.VISIBLE);
                    rb_g.setVisibility(View.VISIBLE);
                    tx.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                }
                else{
                    btn.setVisibility(View.INVISIBLE);
                    rb_g.setVisibility(View.INVISIBLE);
                    tx.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int choice = rb_g.getCheckedRadioButtonId();
                if(choice == R.id.RdoDog){
                    img.setImageResource(R.drawable.dog);
                }
                else if(choice == R.id.RdoCat){
                    img.setImageResource(R.drawable.cat);
                }
                else if(choice == R.id.RdoRabbit){
                    img.setImageResource(R.drawable.rabbit);
                }
                else{
                    Toast.makeText(getApplicationContext(), "동물을 먼저 선택하십쇼", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}