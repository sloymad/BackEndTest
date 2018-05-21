package backendhelpers

import groovyjarjarantlr.ANTLRLexer


data class CreateUser(
		val user: User
)

data class User(
		val first_name: String,
		val last_name: String,
		val email: String,
		val phone: String,
		val specialty_id: Int,
		val salutation: Int,
		val med_registration: String,
		val networks: List<Int>
)

val defaultUser = CreateUser(
        user = User(
                first_name ="Alexey",
                last_name = "BBB",
                email = "ewwewe@mail.ru",
                phone = "+61465422313",
                specialty_id = 2,
                salutation = 2,
                med_registration = "MED123455678",
                networks = listOf(1,2)
        )
)
val newUser = CreateUser(
		user = User(
				first_name ="Alexe",
				last_name = "BBB",
				email = "ewe@mail.ru",
				phone = "12346664",
				specialty_id = 2,
				salutation = 2,
				med_registration = "MED123455678",
				networks = listOf(1,2)

		)
)
