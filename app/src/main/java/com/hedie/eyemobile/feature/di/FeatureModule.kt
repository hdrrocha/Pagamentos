package com.hedie.eyemobile.feature.di

import com.hedie.eyemobile.feature.presentation.viewmodel.PaymentViewModelFactory
import dagger.Module
import dagger.Provides

@Module(
    includes = [
        FeatureFragmentBuilder::class
    ]
)
class FeatureModule {

    @Provides
    fun providePaymentViewModelFactory(): PaymentViewModelFactory {
        return PaymentViewModelFactory()
    }

}