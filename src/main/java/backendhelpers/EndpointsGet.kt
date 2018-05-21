package backendhelpers

enum class EndpointsGet(val hand: String) {
    NEW("https://randomuser.me/api/1.1/"),
    SEED("https://randomuser.me/api/?seed=foobar"),
    DEFAULT("https://randomuser.me/api/1.1/?results=3")
}