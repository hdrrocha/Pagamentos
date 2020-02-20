package com.tutorialwing.viewpager

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.hedie.eyemobile.R
import kotlinx.android.synthetic.main.cartoes_segundo_fragment.*

import javax.inject.Inject

class CardsSecondFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.cartoes_segundo_fragment, container, false)

        return view
    }



    private fun showNote(s: String?) {
        Log.i("Helder", s)
    }

}

