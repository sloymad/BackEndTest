//import backendhelpers.NetworkManager.Companion.executeGet
//import org.assertj.core.api.Assertions.assertThat
//import org.testng.annotations.Test
//
//class Temp {
//
//    @Test
//    fun getUsername() {
//        val username = executeGet("https://randomuser.me/api/1.1/")
//                .body
//                .jsonPath()
//                .getString("results[0].login.username")
//        assertThat(username).isNotNull().isNotEmpty()
//    }
//
//}