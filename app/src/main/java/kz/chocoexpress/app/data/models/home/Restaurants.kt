package kz.chocoexpress.app.data.models.home

object Restaurants {
    fun getRestaurantList(): List<Restaurant> {
        val temp = mutableListOf<Restaurant>()
        temp.apply {
            add(
                Restaurant(
                    1,
                    "Del Papa",
                    "ул. Бухар жырау, 66, уг. ул. Ауэзова",
                    "https://picsum.photos/200"
                )
            )
            add(
                Restaurant(
                    2,
                    "Ресторан «Свет»",
                    "ул. Кабанбай батыра 83",
                    "https://picsum.photos/200"
                )
            )
            add(
                Restaurant(
                    3,
                    "Mamma mia",
                    "ул. Панфилова 109",
                    "https://picsum.photos/200"
                )
            )
            add(
                Restaurant(
                    4,
                    "Bahandi Burger",
                    "ул. Байтурсынова 61",
                    "https://picsum.photos/200"
                )
            )
            add(
                Restaurant(
                    4,
                    "Bahandi Burger",
                    "ул. Байтурсынова 61",
                    "https://picsum.photos/200"
                )
            )
            add(
                Restaurant(
                    4,
                    "Bahandi Burger",
                    "ул. Байтурсынова 61",
                    "https://picsum.photos/200"
                )
            )
            add(
                Restaurant(
                    4,
                    "Bahandi Burger",
                    "ул. Байтурсынова 61",
                    "https://picsum.photos/200"
                )
            )
            add(
                Restaurant(
                    4,
                    "Bahandi Burger",
                    "ул. Байтурсынова 61",
                    "https://picsum.photos/200"
                )
            )
            add(
                Restaurant(
                    4,
                    "Bahandi Burger",
                    "ул. Байтурсынова 61",
                    "https://picsum.photos/200"
                )
            )
            add(
                Restaurant(
                    4,
                    "Bahandi Burger",
                    "ул. Байтурсынова 61",
                    "https://picsum.photos/200"
                )
            )
        }
        return temp
    }
}