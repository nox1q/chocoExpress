package kz.chocoexpress.app.network.exceptions

import kz.chocoexpress.app.data.models.network.error.ApiError

class ApiException(val apiError: ApiError) : Exception()