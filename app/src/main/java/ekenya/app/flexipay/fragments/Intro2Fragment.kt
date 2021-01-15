package ekenya.app.flexipay.fragments


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ekenya.app.flexipay.R
import kotlinx.android.synthetic.main.fragment_intro2.view.*



class Intro2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view=inflater.inflate(R.layout.fragment_intro2, container, false)

       /* view.btnReg2.setOnClickListener {
            startActivity(Intent(activity,MobileActivity::class.java))
        }*/
        return view
    }





    }


