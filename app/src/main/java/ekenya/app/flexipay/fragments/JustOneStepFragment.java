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


public class JustOneStepFragment extends Fragment {

    private Button continueBtn;

    public JustOneStepFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_just_one_step, container, false);
        continueBtn = v.findViewById(R.id.btn_continue);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        continueBtn.setOnClickListener(
                v -> ((RegisterAccountActivity)getActivity()).openDocumentFragment()
        );
    }
}