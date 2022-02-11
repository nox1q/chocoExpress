package kz.chocoexpress.app.di.modules

import dagger.Module
import kz.chocoexpress.app.di.view_model.AboutViewModelModule
import kz.chocoexpress.app.di.view_model.ActivityViewModelModule
import kz.chocoexpress.app.di.view_model.SplashViewModelModule

@Module(
    includes = [
        ActivityViewModelModule::class,
        SplashViewModelModule::class,
        AboutViewModelModule::class
    ]
)
class ViewModelModule {
}