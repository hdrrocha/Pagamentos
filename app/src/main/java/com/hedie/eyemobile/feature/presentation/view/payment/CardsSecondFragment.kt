package com.tutorialwing.viewpager

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.hedie.com.hedie.eyemobile.feature.presentation.view.paymenteyemobile.feature.presentation.viewmodel.PaymentViewModel
import com.hedie.eyemobile.R
import com.hedie.eyemobile.feature.presentation.viewmodel.PaymentViewModelFactory
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.cartoes_segundo_fragment.*

import javax.inject.Inject

class CardsSecondFragment : Fragment() {

    @Inject
    lateinit var factory: PaymentViewModelFactory

    private val viewModel: PaymentViewModel by activityViewModels { factory }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.cartoes_segundo_fragment, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        img_vr.setOnClickListener { view->
            viewModel.mountReceipt(tv_vr.text.toString())
        }
        img_cupom.setOnClickListener { view->
            viewModel.mountReceipt(tv_cupom.text.toString())
        }
    }

}

