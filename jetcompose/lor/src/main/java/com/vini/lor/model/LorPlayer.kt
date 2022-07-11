package com.vini.lor.model

import com.squareup.moshi.Json
import java.io.Serializable

data class LorPlayer(
    @field:Json(name = "name")
    val rank:Int,
    @field:Json(name = "rank")
    val lp:Int,
    @field:Json(name = "lp")
    val name:String
) : Serializable


/***
"name": "squallywag",
"rank": 0,
"lp": 911
 */