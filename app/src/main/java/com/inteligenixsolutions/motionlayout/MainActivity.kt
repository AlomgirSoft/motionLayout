package com.inteligenixsolutions.motionlayout

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.inteligenixsolutions.motionlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.setUp1.setOnClickListener {
            startActivity(Intent(this,SetUp_1_Activity::class.java))
        }
        binding.setUp2.setOnClickListener {
            startActivity(Intent(this,SetUp_2_Activity::class.java))
        }
        binding.setUp3.setOnClickListener {
            startActivity(Intent(this,SetUp_3_Activity::class.java))
        }
        binding.setUp4.setOnClickListener {
            startActivity(Intent(this,SetUp_4_Activity::class.java))
        }
        binding.setUp5.setOnClickListener {
            startActivity(Intent(this,SetUp_5_Activity::class.java))
        }
        binding.setUp6.setOnClickListener {
            startActivity(Intent(this,SetUp_6_Activity::class.java))
        }
        binding.setUp7.setOnClickListener {
            startActivity(Intent(this,SetUp_7_Activity::class.java))
        }
        binding.setUp8.setOnClickListener {
            startActivity(Intent(this,SetUp_8_Activity::class.java))
        }

    }
}