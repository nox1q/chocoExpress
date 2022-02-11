package kz.chocoexpress.app.di.modules.common

import android.app.Application
import dagger.Module
import dagger.Provides
import kz.chocoexpress.app.data.preferences.Preferences
import kz.chocoexpress.app.data.preferences.PreferencesImpl

import javax.inject.Singleton

@Module
class PreferenceModule {

    @Provides
    @Singleton
    fun providePreferences(app: Application): Preferences {
        return PreferencesImpl(app)
    }

}