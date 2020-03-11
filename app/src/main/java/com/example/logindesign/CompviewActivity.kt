package com.example.logindesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.esri.arcgisruntime.mapping.ArcGISMap
import com.esri.arcgisruntime.mapping.Basemap
import kotlinx.android.synthetic.main.activity_compview.*

class CompviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compview)

        // create a map with the BasemapType topographic
        val map = ArcGISMap(Basemap.Type.TOPOGRAPHIC, 34.056295, -117.195800, 16)

        // set the map to be displayed in the layout's MapView
        mvSearchComp.map = map
    }

    override fun onPause() {
        super.onPause()
        mvSearchComp.pause()
    }
    override fun onResume() {
        super.onResume()
        mvSearchComp.resume()
    }
    override fun onDestroy() {
        super.onDestroy()
        mvSearchComp.dispose()
    }
}
