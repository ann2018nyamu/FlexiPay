package ekenya.app.flexipay.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ekenya.app.flexipay.R
import kotlinx.android.synthetic.main.fragment_intro1.view.*


class Intro1Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_intro1, container, false)
/*view.btnReg1.setOnClickListener {
    //navigate from fragment to activity
    startActivity(Intent(activity, MobileActivity::class.java))
}*/

        return view
    }
    }
