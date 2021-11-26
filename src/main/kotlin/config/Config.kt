package com.hcyacg.config

import com.alibaba.fastjson.JSONArray
import com.hcyacg.entity.AgefansItem
import java.util.concurrent.CopyOnWriteArrayList

/**
 * 配置文件中各键值对参数
 */
object Config {
    var admins: JSONArray = JSONArray.parseArray("[]")
    var groups: JSONArray = JSONArray.parseArray("[]")

    val agefans: CopyOnWriteArrayList<AgefansItem> = CopyOnWriteArrayList()
    val isSend: CopyOnWriteArrayList<AgefansItem> = CopyOnWriteArrayList()


    var acgmx : String? = null
    var saucenao : String? = null
    var trace : String? = null


    var recall : Long? = 5000

    var host : String? = null
    var port : Int? = null

    var getDetailOfId : String? = null
    var picToSearch : String? = null
    var showRank : String? = null
    var findUserWorksById : String? = null
    var searchInfoByPic : String? = null
    var setu : String? = null
    var tag : String? = null
}