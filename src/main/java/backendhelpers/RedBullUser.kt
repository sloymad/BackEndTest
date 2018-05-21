package backendhelpers

data class RedUser(
        val email: String,
        val password: String,
        val firstName: String,
        val lastName: String
)

val newRedBullUser = RedUser(
        email = "kawjad@mail.ru",
        password = "sdfkdfdff",
        firstName = "Alexey",
        lastName = "Belsky"
)




data class asdasdasd(
		val id: Int,
		val email: String,
		val firstName: String,
		val lastName: String,
		val avatar: Avatar?,
		val distributor: Distributor?
)

data class Avatar(
		val urlToFolder: String,
		val fileName: String
)

data class Distributor(
		val id: Int,
		val name: String
)