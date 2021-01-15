package ekenya.app.flexipay.fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ekenya.app.flexipay.R
import kotlinx.android.synthetic.main.fragment_intro3.view.*

class Intro3Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val view: View = inflater.inflate(R.layout.fragment_intro3, container, false)

       /* view.btnReg.setOnClickListener {
            startActivity(Intent(activity,MobileActivity::class.java))
        }*/
        return view
    }


}