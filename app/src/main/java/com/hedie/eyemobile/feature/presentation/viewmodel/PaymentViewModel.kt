package com.hedie.com.hedie.eyemobile.feature.presentation.view.paymenteyemobile.feature.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hedie.eyemobile.feature.domain.data.CurrencyValue
import com.hedie.eyemobile.feature.presentation.view.data.PaymentViewData

class PaymentViewModel : ViewModel() {

    private val internalViewData = MutableLiveData<PaymentViewData>()
    val viewData: LiveData<PaymentViewData>
        get() = internalViewData

    private val internalEventViewData = MutableLiveData<String>()
    val eventViewData: LiveData<String>
        get() = internalEventViewData


    private val currency = "R$"
    private var amount = CurrencyValue()

    fun start() {
        generateViewData().post()
    }

    fun onPaymentButtonClick(value: Int) {
        amount.addDigit(value)
        generateViewData().post()
    }

    fun onBackspaceClick() {
        amount.removeLastDigit()
        generateViewData().post()
    }

    private fun generateViewData(): PaymentViewData = PaymentViewData(
        currency = currency,
        amount = amount.format()
    )

    private fun PaymentViewData.post() = internalViewData.postValue(this)

    fun mountReceipt(receipt: String) {
        internalEventViewData.postValue(receipt)
    }

}