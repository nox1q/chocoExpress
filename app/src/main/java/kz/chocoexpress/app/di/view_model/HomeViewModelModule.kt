package kz.chocoexpress.app.di.view_model

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kz.chocoexpress.app.di.view_model.base.ViewModelKey
import kz.chocoexpress.app.ui.home.HomeViewModel

@Suppress("unused")
@Module
abstract class HomeViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindAboutViewModel(viewModel: HomeViewModel): ViewModel

}