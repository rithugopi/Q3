package com.example.q3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToCalculatorButton: Button = findViewById(R.id.goToCalculatorButton)
        val goToFoodRecommendationButton: Button = findViewById(R.id.goToFoodRecommendationButton)

        goToCalculatorButton.setOnClickListener {
            val intent = Intent(this, CalcActivity::class.java)
            startActivity(intent)
        }

        goToFoodRecommendationButton.setOnClickListener {
            val intent = Intent(this, FoodActivity::class.java)
            startActivity(intent)
        }
    }
}