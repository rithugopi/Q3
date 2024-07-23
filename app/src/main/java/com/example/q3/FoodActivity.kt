package com.example.q3

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class FoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val mealTypeSpinner: Spinner = findViewById(R.id.mealTypeSpinner)
        val ingredientEditText: EditText = findViewById(R.id.ingredientEditText)
        val recommendButton: Button = findViewById(R.id.recommendButton)
        val recommendationTextView: TextView = findViewById(R.id.recommendationTextView)

        mealTypeSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Handle item selection if needed
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case where nothing is selected
            }
        }

        recommendButton.setOnClickListener {
            val mealType = mealTypeSpinner.selectedItem.toString()
            val ingredient = ingredientEditText.text.toString().trim()

            if (ingredient.isEmpty()) {
                recommendationTextView.text = "Please enter an ingredient."
                return@setOnClickListener
            }

            val recommendation = getRecommendation(mealType, ingredient)
            recommendationTextView.text = recommendation
        }
    }

    private fun getRecommendation(mealType: String, ingredient: String): String {
        // This function returns a recommendation based on the meal type and ingredient.
        // In a real app, this could query a database or an API.
        return when (mealType) {
            "Breakfast" -> "Try a $ingredient smoothie or $ingredient pancakes."
            "Lunch" -> "How about a $ingredient salad or $ingredient sandwich?"
            "Dinner" -> "Consider $ingredient pasta or $ingredient stir-fry."
            "Snack" -> "Enjoy $ingredient chips or $ingredient yogurt."
            else -> "No recommendation available."
        }
    }
}
