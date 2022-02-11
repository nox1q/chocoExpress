package kz.chocoexpress.app.di.modules

import dagger.Module
import kz.chocoexpress.app.di.modules.api.AboutApiModule

@Module(
    includes = [
        AboutApiModule::class
    ]
)
class ApiModule {
}