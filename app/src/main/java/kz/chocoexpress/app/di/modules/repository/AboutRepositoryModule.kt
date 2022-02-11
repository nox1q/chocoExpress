package kz.chocoexpress.app.di.modules.repository

import dagger.Binds
import dagger.Module
import kz.chocoexpress.app.data.repository.about.AboutRepository
import kz.chocoexpress.app.data.repository.about.AboutRepositoryImpl
import javax.inject.Singleton

@Module
abstract class AboutRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindAboutRepository(impl: AboutRepositoryImpl): AboutRepository

}