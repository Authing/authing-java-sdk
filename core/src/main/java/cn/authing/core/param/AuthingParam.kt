package cn.authing.core.param

/**
 * 网络请求参数的基类
 * 要求：
 * 1）其子类都需要使用 Builder 设计模式
 * 2）子类只允许有一个以 Builder 为参数的非 public 的构造方法
 * 3）Builder 的构造方法只允许有必须参数
 * 4）所有的参数处理均在 Builder#build 方法中，例如加密，填充 clientId
 */
internal open class AuthingParam<T>(
        protected val query: String
) {
    protected var variables: T? = null
}
