package kz.chocoexpress.app.di.view_model

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kz.chocoexpress.app.di.view_model.base.ViewModelKey
import kz.chocoexpress.app.ui.activities.main.MainViewModel
import kz.chocoexpress.app.ui.activities.splash.SplashViewModel

@Suppress("unused")
@Module
abstract class ActivityViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    abstract fun bindActivitySplashViewModel(viewModel: SplashViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindActivityMainViewModel(viewModel: MainViewModel): ViewModel

}