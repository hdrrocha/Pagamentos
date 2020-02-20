package com.tutorialwing.viewpager

import android.content.Context
import android.os.Bundle
import android.util.Log

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.hedie.eyemobile.R
import com.hedie.eyemobile.feature.presentation.viewmodel.PaymentEventsViewModel
import com.hedie.eyemobile.feature.presentation.viewmodel.PaymentViewModel
import com.hedie.eyemobile.feature.presentation.viewmodel.PaymentViewModelFactory
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.cards_first_fragment.*


import javax.inject.Inject


class CardsFirstFragment : Fragment() {

    @Inject
    lateinit var factory: PaymentViewModelFactory

    private val viewModel: PaymentViewModel by activityViewModels { factory }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.cards_first_fragment, container, false)

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        img_credit.setOnClickListener { view->
            viewModel.mountNote(tv_credit.text.toString())
        }
        img_money.setOnClickListener { view->
            viewModel.mountNote(tv_money.text.toString())
        }
        img_debit.setOnClickListener { view->
            viewModel.mountNote(tv_debit.text.toString())
        }

    }
}
