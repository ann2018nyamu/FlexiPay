package ekenya.app.flexipay.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import ekenya.app.flexipay.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler(Looper.getMainLooper()).postDelayed(this::toOnboadingActivity, 1500);
    }

    private void toOnboadingActivity()
    {
        startActivity(new Intent(MainActivity.this,OnBoardingActivity.class));
    }
}