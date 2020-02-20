package com.hedie.eyemobile.feature.presentation.view

interface PaymentMethod {
    fun showReceipt(receipt: String?)
    fun mountReceipt(receipt: String?)
}