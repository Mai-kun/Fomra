package com.example.fomraIvanov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.fomraIvanov.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.RadioGroup.setOnCheckedChangeListener { group, checkedId ->

            if (checkedId == binding.work.id)
            {
                binding.salary.isVisible = true
                binding.editSalary.isVisible = true
            }
            else
            {
                binding.salary.isVisible = false
                binding.editSalary.isVisible = false
            }
        }
    }
}