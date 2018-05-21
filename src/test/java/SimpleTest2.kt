//import backendhelpers.EndpointsGet
//import backendhelpers.NetworkManager.Companion.executeGet
//import org.assertj.core.api.Assertions.assertThat
//import org.testng.annotations.Test
//
//class Test2 {
//    @Test
//    fun getUsername() {
//
//        val username = executeGet (EndpointsGet.DEFAULT.hand)
//                .body
//                .jsonPath()
//                .getString("results[1].gender")
//        assertThat(username).isNotBlank()
//
//
//    }
//}