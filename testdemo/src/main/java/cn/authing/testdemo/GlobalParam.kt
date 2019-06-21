package cn.authing.testdemo

import cn.authing.core.Client
import java.util.concurrent.Executors

val clientId = "5b0dfcff82f4ce00014fdcd4"

var client: Client? = null

val executor = Executors.newSingleThreadExecutor()

var userToken: String? = null

var userId: String? = null