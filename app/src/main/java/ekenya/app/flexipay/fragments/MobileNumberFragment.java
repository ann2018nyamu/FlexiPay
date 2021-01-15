package ekenya.app.flexipay.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ekenya.app.flexipay.R;
import ekenya.app.flexipay.activities.RegisterAccountActivity;
import ekenya.app.flexipay.utilities.Helpers;


public class MobileNumberFragment extends Fragment {

    private Button continueBtn;

    public MobileNumberFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mobile_number, container, false);
        continueBtn = view.findViewById(R.id.btn_continue);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        continueBtn.setOnClickListener(
                v -> ((RegisterAccountActivity)getActivity()).openPersonalInfoFragment()
        );
    }
}