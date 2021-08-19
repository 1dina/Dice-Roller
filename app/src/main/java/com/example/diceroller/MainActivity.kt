package com.example.diceroller

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val TAG = "DINA"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            rollDice()
            rollDice2()

        }

        Log.d(TAG, "onCreate() called with: savedInstanceState = $savedInstanceState")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")

    }


    private fun rollDice2() {
        val dice2 = Dice2(6)
        val diceRoll2 = dice2.roll2()
        val diceImage: ImageView = findViewById(R.id.imageView2)
        when (diceRoll2) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)


        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val dicImage: ImageView = findViewById(R.id.imageView)
        when (diceRoll) {
            1 -> dicImage.setImageResource(R.drawable.dice_1)
            2 -> dicImage.setImageResource(R.drawable.dice_2)
            3 -> dicImage.setImageResource(R.drawable.dice_3)
            4 -> dicImage.setImageResource(R.drawable.dice_4)
            5 -> dicImage.setImageResource(R.drawable.dice_5)
            6 -> dicImage.setImageResource(R.drawable.dice_6)

        }
        dicImage.contentDescription = diceRoll.toString()
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {

        return (1..numSides).random()
    }
}

class Dice2(val numSides2: Int) {
    fun roll2(): Int {
        return (1..numSides2).random()
    }
}

