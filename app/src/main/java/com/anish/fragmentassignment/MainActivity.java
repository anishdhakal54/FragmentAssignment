package com.anish.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anish.fragmentassignment.fragments.ArmstrongFragment;
import com.anish.fragmentassignment.fragments.AutomorphicFragment;
import com.anish.fragmentassignment.fragments.CircleFragment;
import com.anish.fragmentassignment.fragments.PalendromeFragment;
import com.anish.fragmentassignment.fragments.SimpleInterestFragment;
import com.anish.fragmentassignment.fragments.SwappingFragment;

public class MainActivity extends AppCompatActivity {
    private Button btnCircle, btnArmstrong, btnAutomorphic, btnPalindrome, btnSimpleinterest, btnSwap;
    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCircle = findViewById(R.id.btnCircle);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAutomorphic = findViewById(R.id.btnAutomorphic);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSimpleinterest = findViewById(R.id.btnSimpleinterest);
        btnSwap = findViewById(R.id.btnSwap);

        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();



                CircleFragment circleFragment= new CircleFragment();
                fragmentTransaction.replace(R.id.fragView,circleFragment);
                fragmentTransaction.commit();

            }
        });

        btnArmstrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();



                ArmstrongFragment armstrongFragment= new ArmstrongFragment();
                fragmentTransaction.replace(R.id.fragView,armstrongFragment);
                fragmentTransaction.commit();

            }
        });

        btnAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();



                AutomorphicFragment automorphicFragment= new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragView,automorphicFragment);
                fragmentTransaction.commit();

            }
        });

        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();



                PalendromeFragment palendromeFragment= new PalendromeFragment();
                fragmentTransaction.replace(R.id.fragView,palendromeFragment);
                fragmentTransaction.commit();

            }
        });

        btnSimpleinterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();



                SimpleInterestFragment simpleInterestFragment= new SimpleInterestFragment();
                fragmentTransaction.replace(R.id.fragView,simpleInterestFragment);
                fragmentTransaction.commit();

            }
        });

        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

                SwappingFragment swappingFragment= new SwappingFragment();
                fragmentTransaction.replace(R.id.fragView,swappingFragment);
                fragmentTransaction.commit();

            }
        });

    }
}
