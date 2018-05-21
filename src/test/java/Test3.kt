import backendhelpers.*
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test


class Test3 {
    val network = NetworkManager()
    val spec = Specs()
    var userId: Int = 0

    @Test
    fun createUser() {
       // println(defaultUser.toString())
        val user = network.extractPost(
                spec = spec.specDefault(EndpointsMedx.POST_USER.hand),
                requestBody = defaultUser,
                responseClass = CreateUserExpected::class.java)
        userId = user.user.id

       // println(user.user.email)
       // println(user.user.first_name)
        println(user.user.id)
    }

    @AfterMethod(alwaysRun = true)
    fun tearDown() {
        network.executeDelete("https://dev.app.medxsms.com/api/v1/users/$userId")

    }
}