package com.malkinfo.navigationdrawar.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.malkinfo.navigationdrawar.MapActivity
import com.malkinfo.navigationdrawar.R
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.login.view.*

class login1 : Fragment() {

    private lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.login, container, false)

//        root.btnlogin.setOnClickListener {
//            val i = Intent(activity, HomeFragment::class.java)
//            startActivity(i)
//
//        }
            return root

        }

}
