package com.tutorialwing.viewpager

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.pagamentos.R


class CartoesPrimeiroFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.cartoes_primeiro_fragment, container, false)

//        val imageView = view.findViewById<ImageView>(R.id.imgMain)
//        imageView.setImageResource(R.mipmap.ic_launcher)

        return view
    }
}
