package ekenya.app.flexipay.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Arrays;
import java.util.List;

import ekenya.app.flexipay.R;
import ekenya.app.flexipay.activities.RegisterAccountActivity;
import ekenya.app.flexipay.utilities.DateInputMask;


public class PersonalInfoFragment extends Fragment {

    private Button continueBtn;
    private AutoCompleteTextView  genderAutoCompleteTextView;
    private TextInputLayout dobTxtInput;
    private List<String> genderList = Arrays.asList("Male", "Female");
    private ArrayAdapter adapter;
    public PersonalInfoFragment() {}


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_personal_info, container, false);
        continueBtn = view.findViewById(R.id.btn_continue);
        genderAutoCompleteTextView = view.findViewById(R.id.autocomplete_gender);
        dobTxtInput = view.findViewById(R.id.ti_dob);
        new DateInputMask(dobTxtInput.getEditText());


        adapter = new ArrayAdapter(requireContext(),R.layout.gender_list_item, genderList);
        genderAutoCompleteTextView.setAdapter(adapter);


        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        continueBtn.setOnClickListener(
                v -> ((RegisterAccountActivity)getActivity()).openJustOneFragment()
        );
    }
}