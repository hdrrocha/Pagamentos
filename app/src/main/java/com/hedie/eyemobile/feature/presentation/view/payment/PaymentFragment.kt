package com.hedie.eyemobile.feature.presentation.view.payment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.pagamentos.ViewPagerAdapter
import com.hedie.com.hedie.eyemobile.feature.presentation.view.paymenteyemobile.feature.presentation.viewmodel.PaymentViewModel
import com.hedie.eyemobile.R
import com.hedie.eyemobile.feature.presentation.view.Receipt.ReceiptActivity
import com.hedie.eyemobile.feature.presentation.view.data.PaymentViewData
import com.hedie.eyemobile.feature.presentation.viewmodel.PaymentViewModelFactory
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_payment.*
import kotlinx.android.synthetic.main.fragment_payment_amount_section.*
import kotlinx.android.synthetic.main.fragment_payment_buttons_section.*
import javax.inject.Inject


class PaymentFragment : Fragment(){

    @Inject
    lateinit var factory: PaymentViewModelFactory

    private val viewModel: PaymentViewModel by activityViewModels { factory }

//    private val receiptObserver = Observer<String>(::showReceipt)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_payment, container, false)

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

        buttonBackspace.setOnClickListener { viewModel.onBackspaceClick() }

        viewModel.viewData.observe(viewLifecycleOwner, Observer(::onPaymentViewData))
        viewModel.eventViewData.observe(viewLifecycleOwner,Observer(::showReceipt))
        viewModel.start()

    }

    private fun initView() {
        if (viewPager != null) {
            val adapter = ViewPagerAdapter(activity!!.supportFragmentManager)
            viewPager.adapter = adapter

        }
        indicator.setViewPager(viewPager)


        button0.setOnClickListener { viewModel.onPaymentButtonClick(0) }
        button1.setOnClickListener { viewModel.onPaymentButtonClick(1) }
        button2.setOnClickListener { viewModel.onPaymentButtonClick(2) }
        button3.setOnClickListener { viewModel.onPaymentButtonClick(3) }
        button4.setOnClickListener { viewModel.onPaymentButtonClick(4) }
        button5.setOnClickListener { viewModel.onPaymentButtonClick(5) }
        button6.setOnClickListener { viewModel.onPaymentButtonClick(6) }
        button7.setOnClickListener { viewModel.onPaymentButtonClick(7) }
        button8.setOnClickListener { viewModel.onPaymentButtonClick(8) }
        button9.setOnClickListener { viewModel.onPaymentButtonClick(9) }

    }

    private fun onPaymentViewData(viewData: PaymentViewData?) {
        viewData?.let {
            currencyLabel.text = viewData.currency
            amountLabel.text = viewData.amount

        }
    }

    fun showReceipt(receipt: String?) {
        var isNull = "0.00"
        if(amountLabel.text.toString() !=  isNull) {
            val intent = Intent(activity, ReceiptActivity::class.java)
            intent.putExtra("receipt", receipt)
            intent.putExtra("money", "R$" + amountLabel.text.toString())
            startActivity(intent)
        }

    }

}