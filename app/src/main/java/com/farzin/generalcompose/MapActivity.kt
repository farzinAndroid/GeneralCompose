package com.farzin.generalcompose

import android.os.Bundle
import android.os.PersistableBundle
import android.preference.PreferenceManager
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.farzin.generalcompose.databinding.ActivityMapBinding
import com.farzin.generalcompose.ui.theme.GeneralComposeTheme
import org.osmdroid.config.Configuration.getInstance
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.MapView


class MapActivity : ComponentActivity() {

   private lateinit var binding: ActivityMapBinding

    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getInstance().load(this, PreferenceManager.getDefaultSharedPreferences(this))

        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.map.setTileSource(TileSourceFactory.MAPNIK)

        val mapController = binding.map.controller
        mapController.setZoom(9.5)
        val startPoint = GeoPoint(48.8583, 2.2944);
        mapController.setCenter(startPoint)

        binding.compose.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {

                GeneralComposeTheme() {
                    Surface(modifier = Modifier.fillMaxSize()) {
                        Column() {

                            ExpandableCard()


                        }
                    }

                }



            }
        }
    }
}
