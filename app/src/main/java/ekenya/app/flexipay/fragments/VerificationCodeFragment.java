package ekenya.app.flexipay.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import ekenya.app.flexipay.R;
import ekenya.app.flexipay.activities.RegisterAccountActivity;
import ekenya.app.flexipay.utilities.Helpers;

public class VerificationCodeFragment extends Fragment {

    private Button continueBtn;
    private TextInputLayout otp1,otp2,otp3,otp4;
    public VerificationCodeFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_verification_code, container, false);
        continueBtn = v.findViewById(R.id.btn_continue_verification);
        otp1 = v.findViewById(R.id.otp_1);
        otp2 = v.findViewById(R.id.otp_2);
        otp3 = v.findViewById(R.id.otp_3);
        otp4 = v.findViewById(R.id.otp_4);

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        continueBtn.setOnClickListener(
                v ->
                        ((RegisterAccountActivity)getActivity()).openPinFragment()
        );

        addListenersToOTPInput();
    }

    private void addListenersToOTPInput()
    {
        otp1.getEditText().addTextChangedListener(new TextWatcher()
        {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                new Helpers().showToast(getActivity(),s.toString());
            }
        });

        otp2.getEditText().addTextChangedListener(new TextWatcher()
        {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                new Helpers().showToast(getActivity(),s.toString());
            }
        });

        otp3.getEditText().addTextChangedListener(new TextWatcher()
        {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                new Helpers().showToast(getActivity(),s.toString());
            }
        });

        otp4.getEditText().addTextChangedListener(new TextWatcher()
        {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                new Helpers().showToast(getActivity(),s.toString());
            }
        });
    }
}