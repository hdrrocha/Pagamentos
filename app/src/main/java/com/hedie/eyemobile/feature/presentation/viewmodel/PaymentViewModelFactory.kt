package com.hedie.eyemobile.feature.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hedie.com.hedie.eyemobile.feature.presentation.view.paymenteyemobile.feature.presentation.viewmodel.PaymentViewModel

@Suppress("UNCHECKED_CAST")
class PaymentViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T = when (modelClass) {
        PaymentViewModel::class.java -> PaymentViewModel()
        PaymentEventsViewModel::class.java -> PaymentEventsViewModel()
        else -> error("class not supported!")
    } as T

}