package ekenya.app.flexipay.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import ekenya.app.flexipay.R;
import ekenya.app.flexipay.fragments.Intro1Fragment;
import ekenya.app.flexipay.fragments.Intro2Fragment;
import ekenya.app.flexipay.fragments.Intro3Fragment;
import ekenya.app.flexipay.utilities.Helpers;
import ekenya.app.flexipay.utilities.IndicatorLayout;
import muhia.dams.flexipay.slider.IntroSliderAdapter;

public class OnBoardingActivity extends AppCompatActivity implements View.OnClickListener {
    private ArrayList<Fragment> fragmentList = new ArrayList<>();
    private IntroSliderAdapter introSliderAdapter = new IntroSliderAdapter(this);
    private ViewPager2 viewPager;
    private IndicatorLayout indicatorLayout;
    private ViewDataBinding binding ;
    private Button registerButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
     //   binding = DataBindingUtil.setContentView(this, R.layout.activity_onboarding);

        indicatorLayout = findViewById(R.id.indicatorLayout);
        registerButton = findViewById(R.id.btn_register);
        viewPager = findViewById(R.id.vpIntroSlider);

        registerButton.setOnClickListener(this);
        viewPager.setAdapter(introSliderAdapter);
        fragmentList.addAll(List.of(new Intro1Fragment(),new Intro2Fragment(),new Intro3Fragment()));
        introSliderAdapter.setFragmentList(fragmentList);
        indicatorLayout.setIndicatorCount(introSliderAdapter.getItemCount());
        indicatorLayout.selectCurrentPosition(0);
        registerListeners();
    }

    private void registerListeners() {
        viewPager.registerOnPageChangeCallback(
                new ViewPager2.OnPageChangeCallback() {
                    @Override
                    public void onPageScrolled(int pos, float positionOffset, int positionOffsetPixels) {
                        super.onPageSelected(pos);
                        indicatorLayout.selectCurrentPosition(pos);
                    }
                }
        );


    }

    @Override
    public void onClick(View v)
    {
        startActivity(new Intent(this,RegisterAccountActivity.class));
    }
}


