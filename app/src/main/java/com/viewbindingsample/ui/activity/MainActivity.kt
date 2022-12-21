package com.viewbindingsample.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.viewbindingsample.R
import com.viewbindingsample.databinding.ActivityMainBinding
import com.viewbindingsample.ui.extensions.viewBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}