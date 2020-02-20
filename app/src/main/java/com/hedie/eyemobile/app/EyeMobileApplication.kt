package com.hedie.eyemobile.app

import android.app.Application
import com.hedie.eyemobile.app.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

open class EyeMobileApplication : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    open fun initDagger() {
        DaggerApplicationComponent.create()
            .inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

}