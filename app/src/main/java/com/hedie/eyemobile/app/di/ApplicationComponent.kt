package com.hedie.eyemobile.app.di

import com.hedie.eyemobile.app.EyeMobileApplication
import com.hedie.eyemobile.feature.di.FeatureModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        FeatureModule::class
    ]
)
interface ApplicationComponent {

    fun inject(application: EyeMobileApplication)

}

