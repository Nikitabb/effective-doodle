package com.example.picassoview

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyCharacterMap.load
import android.view.View
import android.widget.ImageView
import androidx.core.view.PointerIconCompat.load
import androidx.recyclerview.widget.LinearLayoutManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.items.*
import okhttp3.*
import org.json.JSONObject
import java.io.IOException
import java.lang.System.load
import java.util.ServiceLoader.load

class MainActivity : AppCompatActivity() {
    var users: ArrayList<String> = ArrayList()
    private var client = OkHttpClient()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getUserList()


    }
    private fun getUserList(){
       recyclerview.visibility = View.VISIBLE
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val versions = ArrayList<Version>()
        versions.addAll(Version.getAndroidVersionList())
        val Adap = ImageAdapter(versions)
        recyclerview.adapter = Adap
    }
}
