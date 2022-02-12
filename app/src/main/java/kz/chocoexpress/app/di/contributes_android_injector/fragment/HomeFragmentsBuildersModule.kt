package kz.chocoexpress.app.di.contributes_android_injector.fragment

import dagger.Module
import dagger.android.ContributesAndroidInjector
import kz.chocoexpress.app.ui.home.HomeFragment

@Module
abstract class HomeFragmentsBuildersModule {

    @ContributesAndroidInjector
    internal abstract fun homeFragment(): HomeFragment
}