package redbullbackendhelpers

data class UserRedExpected (
        val id: Int,
        val email: String,
        val firstName: String,
        val lastName: String,
        val avatar: String?,
        val distributor: String?
)