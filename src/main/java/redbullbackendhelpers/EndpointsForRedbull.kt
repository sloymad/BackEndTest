package redbullbackendhelpers

enum class EndpointsForRedbull (val hand: String) {
    LOGIN("/auth/user/login"),
    LOGOUT("/auth/user/logout"),
    USERS("/users/"),
    USERS_STORES("/users/stores"),
    DISTRIBUTORS("/distributors"),
    STORES("/stores/"),
    STORES_FAVORITES("/stores/favorites/")
}