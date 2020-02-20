package com.hedie.eyemobile.feature.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hedie.eyemobile.feature.domain.data.CurrencyValue
import com.hedie.eyemobile.feature.presentation.view.data.PaymentViewData

class PaymentEventsViewModel : ViewModel() {

    private val internalViewData = MutableLiveData<String>()
    val viewData: LiveData<String>
        get() = internalViewData

    private val currency = "R$"
    private var amount = CurrencyValue()

//    fun start() {
//        generateViewData().post()
//    }

//    fun onPaymentButtonClick(value: Int) {
//        amount.addDigit(value)
//        generateViewData().post()
//    }

//    fun onBackspaceClick() {
//        amount.removeLastDigit()
//        generateViewData().post()
//    }

//    private fun generateViewData(): PaymentViewData = PaymentViewData(
//        currency = currency,
//        amount = amount.format()
//    )

//    private fun PaymentViewData.post() = internalViewData.postValue(this)

    fun mountNote(note: String) {
        internalViewData.postValue(note)
    }

}