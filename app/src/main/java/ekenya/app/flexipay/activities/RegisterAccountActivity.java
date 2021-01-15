package ekenya.app.flexipay.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;

import ekenya.app.flexipay.R;

public class RegisterAccountActivity extends AppCompatActivity {
    private NavHostFragment navHostFragment;
    private NavController navController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_account);


        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host);
        if(navHostFragment.getNavController() != null)
        {
            navController = navHostFragment.getNavController();
        }
        navController.navigate(R.id.mobileNumberFragment);

    }

    public void openPersonalInfoFragment(){
        navController.navigate(R.id.personalInfoFragment);
    }

    public void openJustOneFragment(){
        navController.navigate(R.id.action_personalInfoFragment_to_justOneStepFragment);
    }

    public void openDocumentFragment(){
        navController.navigate(R.id.documentPhotoFragment);
    }

    public void openVerificationFragment(){
        navController.navigate(R.id.verificationCodeFragment);
    }

    public void openPinFragment(){
        navController.navigate(R.id.pinFragment);
    }
}