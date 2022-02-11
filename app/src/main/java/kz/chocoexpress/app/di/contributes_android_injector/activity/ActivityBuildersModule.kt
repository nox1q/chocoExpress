package kz.chocoexpress.app.di.contributes_android_injector.activity

import dagger.Module
import dagger.android.ContributesAndroidInjector
import kz.chocoexpress.app.di.contributes_android_injector.fragment.AboutFragmentsBuildersModule
import kz.chocoexpress.app.di.contributes_android_injector.fragment.SplashFragmentsBuildersModule
import kz.chocoexpress.app.ui.activities.main.MainActivity
import kz.chocoexpress.app.ui.activities.splash.SplashActivity

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
        modules = [
            SplashFragmentsBuildersModule::class
        ]
    )
    internal abstract fun splashActivity(): SplashActivity

    @ContributesAndroidInjector(
        modules = [
            AboutFragmentsBuildersModule::class
        ]
    )
    internal abstract fun mainActivity(): MainActivity

}