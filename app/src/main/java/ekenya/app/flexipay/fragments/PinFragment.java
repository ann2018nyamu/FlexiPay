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
import ekenya.app.flexipay.utilities.Helpers;

public class PinFragment extends Fragment implements View.OnClickListener {

    private Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero;

    public PinFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pin, container, false);

        btnOne = v.findViewById(R.id.btn_number_one);
        btnTwo = v.findViewById(R.id.btn_number_two);
        btnThree = v.findViewById(R.id.btn_number_three);
        btnFour = v.findViewById(R.id.btn_number_four);
        btnFive = v.findViewById(R.id.btn_number_five);
        btnSix = v.findViewById(R.id.btn_number_six);
        btnSeven = v.findViewById(R.id.btn_number_seven);
        btnEight = v.findViewById(R.id.btn_number_eight);
        btnNine = v.findViewById(R.id.btn_number_nine);
        btnZero = v.findViewById(R.id.btn_number_zero);

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addListeners();
    }

    private void addListeners()
    {
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);
    }

    private void showToast(){
        new Helpers().showToast(getActivity(),"Click!");
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_number_one:
                showToast();
                break;
            case R.id.btn_number_two:
                showToast();
                break;
            case R.id.btn_number_three:
                showToast();
                break;
            case R.id.btn_number_four:
                showToast();
                break;
            case R.id.btn_number_five:
                showToast();
                break;
            case R.id.btn_number_six:
                showToast();
                break;
            case R.id.btn_number_seven:
                showToast();
                break;
            case R.id.btn_number_eight:
                showToast();
                break;
            case R.id.btn_number_nine:
                showToast();
                break;
            case R.id.btn_number_zero:
                showToast();
                break;
            default:
                break;
        }
    }
}