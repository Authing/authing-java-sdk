package cn.authing.core.utils

import org.bouncycastle.jce.provider.BouncyCastleProvider
import org.bouncycastle.util.encoders.Base64
import java.security.KeyFactory
import java.security.Security
import java.security.spec.X509EncodedKeySpec
import javax.crypto.Cipher

internal object AuthingUtils {
    var URL_OAUTH = "https://oauth.authing.cn/graphql"
    var URL_USER = "https://users.authing.cn/graphql"

    private val PUBLICA_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC4xKeUgQ+Aoz7TLfAfs9+paePb" +
            "5KIofVthEopwrXFkp8OCeocaTHt9ICjTT2QeJh6cZaDaArfZ873GPUn00eOIZ7Ae" +
            "+TiA2BKHbCvloW3w5Lnqm70iSsUi5Fmu9/2+68GZRH9L7Mlh8cFksCicW2Y2W2uM" +
            "GKl64GDcIq3au+aqJQIDAQAB"

    fun encrypt(msg: String): String? {
        val provider = "BC"
        Security.addProvider(BouncyCastleProvider())
        var result: String? = null
        try {
            // 获取公钥
            val keyBytes = Base64.decode(PUBLICA_KEY)
            val keySpec = X509EncodedKeySpec(keyBytes)
            val keyFactory = KeyFactory.getInstance("RSA", provider)
            val publicKey = keyFactory.generatePublic(keySpec)
            val cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", provider)
            cipher.init(Cipher.ENCRYPT_MODE, publicKey)
            val cipherMsg = cipher.doFinal(msg.toByteArray())
            result = String(Base64.encode(cipherMsg))
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return result
    }
}
