package com.malkinfo.navigationdrawar.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.malkinfo.navigationdrawar.MapActivity
import com.malkinfo.navigationdrawar.R
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {
//public CardView  map1,map2,map3,map4

    private lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_home, container, false)

        root.map1.setOnClickListener {
            val i = Intent(activity,MapActivity::class.java)
            startActivity(i)
        }

        root.map2.setOnClickListener {
            val i = Intent(activity,MapActivity::class.java)
            startActivity(i)
        }

        root.map3.setOnClickListener {
            val i = Intent(activity,MapActivity::class.java)
            startActivity(i)
        }

        root.map4.setOnClickListener {
            val i = Intent(activity,MapActivity::class.java)
            startActivity(i)
        }

        return root
    }


}