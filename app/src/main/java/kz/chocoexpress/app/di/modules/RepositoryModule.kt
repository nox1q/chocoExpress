package kz.chocoexpress.app.di.modules

import dagger.Module
import kz.chocoexpress.app.di.modules.repository.AboutRepositoryModule

@Module(
    includes = [
        AboutRepositoryModule::class
    ]
)
class RepositoryModule {
}