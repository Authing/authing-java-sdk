package cn.authing.core.param

/**
 * Base class of network request parameters
 * Requirement：
 * 1）All its son need to use the Builder Design Pattern
 * 2）Only one non public constructor with builder as parameter is allowed for son
 * 3）Only required parameters are allowed for builder's construction method
 * 4）All parameter processing is in the Bilder#build method, such as encryption and filling in ClientID
 */
internal open class AuthingParam<T>(
        protected val query: String
) {
    protected var variables: T? = null
}
