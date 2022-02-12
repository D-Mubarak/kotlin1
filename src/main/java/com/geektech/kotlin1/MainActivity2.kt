package com.geektech.kotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.geektech.kotlin1.databinding.ActivityMain2Binding
import com.geektech.kotlin1.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.etValue.setText(intent.getStringExtra("key1"))

        viewBinding.btnBack.setOnClickListener {
            setResult(RESULT_OK, Intent().putExtra("keyBack", viewBinding.etValue.text.toString()))
            finish()
        }
    }
}