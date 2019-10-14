package com.example.healthon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dd.morphingbutton.MorphingButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MorphingButton login = findViewById(R.id.login_btn);
        MorphingButton reg = findViewById(R.id.reg_btn);

//        MorphingButton.Params circle = MorphingButton.Params.create()
//                .duration(500)
//                .cornerRadius(dimen(R.dimen.mb_height_56)) // 56 dp
//                .width(dimen(R.dimen.mb_height_56)) // 56 dp
//                .height(dimen(R.dimen.mb_height_56)) // 56 dp
//                .color(color(R.color.green)) // normal state color
//                .colorPressed(color(R.color.green_dark)) // pressed state color
//                .icon(R.drawable.ic_done_black_24dp); // icon
//        login.morph(circle);

//        MorphingButton.Params circle1 = MorphingButton.Params.create()
//                .duration(500)
//                .cornerRadius(dimen(R.dimen.mb_height_56)) // 56 dp
//                .width(dimen(R.dimen.mb_height_56)) // 56 dp
//                .height(dimen(R.dimen.mb_height_56)) // 56 dp
//                .color(color(R.color.green)) // normal state color
//                .colorPressed(color(R.color.green_dark)) // pressed state color
//                .icon(R.drawable.ic_done_black_24dp); // icon
//        reg.morph(circle1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Login.class);
                startActivity(a);
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Register.class);
                startActivity(a);
                }
        });


    }



    private int dimen(int mb_height_56) {
        return  mb_height_56;
    }

    private int color(int green) {
    return green;
    }
}

