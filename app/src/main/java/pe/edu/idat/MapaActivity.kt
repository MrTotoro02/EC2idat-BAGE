package pe.edu.idat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import pe.edu.idat.databinding.ActivityCameraBinding
import pe.edu.idat.databinding.ActivityMapaBinding

class MapaActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActivityMapaBinding
    private lateinit var googleMap : GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMapaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val fragmentMap = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        fragmentMap.getMapAsync(this)

    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map
        val lidia = LatLng(26.612662450337528, 26.612662450337528, )
        val kioto = LatLng(35.015321, 135.778245)
        val seoul = LatLng(37.5779,126.9768)
        googleMap.addMarker(MarkerOptions().position(lidia).title("Lidia Africa"))
        googleMap.addMarker(MarkerOptions().position(kioto).title("Okazaki Tokuseicho"))
        googleMap.addMarker(MarkerOptions().position(seoul).title("Gyeongbokgung"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(lidia))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(kioto))
    }
}