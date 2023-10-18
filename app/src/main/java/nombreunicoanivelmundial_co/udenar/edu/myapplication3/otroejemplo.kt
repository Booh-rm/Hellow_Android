package nombreunicoanivelmundial_co.udenar.edu.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.widget.AppCompatEditText

class otroejemplo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otroejemplo)

        val btnSaludar = findViewById<Button>(R.id.bt)
        val etname = findViewById<AppCompatEditText>(R.id.ettn)

        btnSaludar.setOnClickListener {
            val name = etname.text.toString()
            if (name.isNotEmpty()) {
                Log.i("First", "Se dio click...$name")
            }

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("EXTRA NAME", name)
            startActivity(intent)
        }
    }
}