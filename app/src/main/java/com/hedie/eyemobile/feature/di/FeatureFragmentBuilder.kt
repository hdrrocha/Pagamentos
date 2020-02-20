package com.hedie.eyemobile.feature.di

import com.hedie.eyemobile.feature.presentation.view.payment.PaymentFragment
import com.tutorialwing.viewpager.CardsFirstFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FeatureFragmentBuilder {

    @ContributesAndroidInjector
    abstract fun bindPaymentFragment(): PaymentFragment
    @ContributesAndroidInjector
    abstract fun bindCardsFirstFragment(): CardsFirstFragment

}