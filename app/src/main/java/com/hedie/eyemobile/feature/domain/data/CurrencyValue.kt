package com.hedie.eyemobile.feature.domain.data

data class CurrencyValue(private var value: Int = 0) {

    fun addDigit(digit: Int) {
        value = runCatching { "$value$digit".toInt() }.getOrDefault(value)
    }

    fun format(): String = "%.2f".format(value.toFloat() / 100f)

    fun removeLastDigit() {
        value = runCatching { "$value".dropLast(1).toInt() }.getOrDefault(0)
    }

}