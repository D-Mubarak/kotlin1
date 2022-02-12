package com.geektech.kotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.kotlin1.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMain2Binding

    companion object {
        const val KEY_BACK = "keyBack"
        const val KEY1 = "key1"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.etValue.setText(intent.getStringExtra(KEY1))
        viewBinding.btnBack.setOnClickListener {
            setResult(RESULT_OK, Intent().putExtra(KEY_BACK, viewBinding.etValue.text.toString()))
            finish()
        }
    }
}