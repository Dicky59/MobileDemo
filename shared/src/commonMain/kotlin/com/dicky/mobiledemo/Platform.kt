package com.dicky.mobiledemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform