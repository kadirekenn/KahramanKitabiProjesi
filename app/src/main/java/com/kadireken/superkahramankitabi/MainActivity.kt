package com.kadireken.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var kahramanIsimleri = ArrayList<String>()
        kahramanIsimleri.add("MeteHan")
        kahramanIsimleri.add("Alparslan")
        kahramanIsimleri.add("Osman Gazi")
        kahramanIsimleri.add("Yavuz Sultan Selim")
        kahramanIsimleri.add("Fatih Sultan Mehmet")

        val meteBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.metehan)
        val alparslanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.alparslan)
        val osmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.osmangazi)
        val yavuzBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.yavuz)
        val fatihBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.fatih)
/*
        var kahramanGorselleri = ArrayList<Bitmap>()
        kahramanGorselleri.add(meteBitmap)
        kahramanGorselleri.add(alparslanBitmap)
        kahramanGorselleri.add(osmanBitmap)
        kahramanGorselleri.add(yavuzBitmap)
        kahramanGorselleri.add(fatihBitmap)
*/
        val meteDrawableId = R.drawable.metehan
        val alparslanDrawableId = R.drawable.alparslan
        val osmanDrawableId = R.drawable.osmangazi
        val yavuzDrawableId = R.drawable.yavuz
        val fatihDrawableId = R.drawable.fatih

        var kahramanDrawableListesi =ArrayList<Int>()
        kahramanDrawableListesi.add(meteDrawableId)
        kahramanDrawableListesi.add(alparslanDrawableId)
        kahramanDrawableListesi.add(osmanDrawableId)
        kahramanDrawableListesi.add(yavuzDrawableId)
        kahramanDrawableListesi.add(fatihDrawableId)

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(kahramanIsimleri, kahramanDrawableListesi)
        recyclerView.adapter = adapter

    }
}