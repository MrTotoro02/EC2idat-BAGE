package pe.edu.idat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.idat.databinding.ActivityMainBinding
import pe.edu.idat.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMenuBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btncamara.setOnClickListener {
            var CameraPantalla = Intent(this, CameraActivity::class.java)
            startActivity(CameraPantalla)
        }
        binding.btnmapa.setOnClickListener {
            var MapPantalla = Intent(this, MapaActivity::class.java)
            startActivity(MapPantalla)
        }
    }
}