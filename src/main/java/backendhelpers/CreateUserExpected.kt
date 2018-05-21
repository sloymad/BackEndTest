package backendhelpers


data class CreateUserExpected(
		val user: UserExpected
)

data class UserExpected(
		val id: Int,
		val first_name: String,
		val last_name: String,
		val preferred_first_name: String,
		val about: String,
		val email: String,
		val phone: String,
		val specialty: String,
		val salutation: String
)

