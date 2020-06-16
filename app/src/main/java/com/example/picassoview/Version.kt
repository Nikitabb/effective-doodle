package com.example.picassoview

import java.io.Serializable

class Version(val imageURL : String) : Serializable {
    companion object{
        fun getAndroidVersionList(): List<Version>{
            val versionList = ArrayList<Version>()
            versionList.clear()
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/cup_cake.png"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/donut.png"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/eclair.png"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/Froyo.jpg"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/gingerbread.png"))
            return versionList
        }
    }
}