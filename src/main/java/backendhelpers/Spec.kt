package backendhelpers

import io.restassured.builder.RequestSpecBuilder
import io.restassured.specification.RequestSpecification;

class Specs {
// FOR MedX exaple
//    fun specDefault(hand:String):RequestSpecification {
//        return RequestSpecBuilder()
//                .setContentType("application/json")
//                .addHeader("smsdisabled","true")
//                .setBaseUri("https://dev.app.medxsms.com/api/v1$hand")
//                .build()
//   }
//
//    fun specToken(hand: String): RequestSpecification {
//        return RequestSpecBuilder()
//                .setContentType("application/json")
//                .setBaseUri("https://dev.app.medxsms.com/api/v1$hand")
//                //.addHeader("Authorization", "Bearer ${UserHelper().token()}")
//                .build()
//    }
//}
    //For RedBull Example

    //@Step("SPEC default")
    fun specDefault(hand: String): RequestSpecification {
        return RequestSpecBuilder()
                .setContentType("application/json")
                .setBaseUri("https://backend.redbull.distillery.com$hand")
                .build()
    }
}


