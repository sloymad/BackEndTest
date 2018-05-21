import backendhelpers.*
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test
import redbullbackendhelpers.EndpointsForRedbull
import redbullbackendhelpers.UserRedExpected


class Test4 {
    val network = NetworkManager()
    val spec = Specs()
    var userID: Int = 0

    @Test
    fun createUser() {
        val user = network.extractPost(
                spec = spec.specDefault(EndpointsForRedbull.USERS.hand),
                requestBody = newRedBullUser,
                responseClass = UserRedExpected::class.java)
        userID = user.id
        println(user.id)

    }

    @AfterMethod(alwaysRun = true)
    fun tearDown() {
        network.executeDelete("https://backend.redbull.distillery.com/users/$userID")

    }
}