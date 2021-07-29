package com.sittaung.favdish

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sittaung.favdish.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvAppName.text = "Hello Kotlin!"
    }
}