package com.example.la22_count

import android.graphics.Color
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.la22_count.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply{setContentView(this.root)}

        var number = 0
        updateText(number)

        binding.plusButton.setOnClickListener{
            number ++
            updateText(number)
        }
    }

    fun updateText(resultNumber:Int){
        binding.numberTextView.text = resultNumber.toString()
        if (resultNumber != 0 && resultNumber % 2 == 0 && resultNumber % 3 == 0){
            binding.numberTextView.setTextColor(Color.RED)
        }else if(resultNumber != 0 && resultNumber % 2 == 0){
            binding.numberTextView.setTextColor(Color.GREEN)
        }else if (resultNumber != 0 && resultNumber % 3 == 0){
            binding.numberTextView.setTextColor(Color.BLUE)
        }else{
            binding.numberTextView.setTextColor(Color.BLACK)
        }
    }
}