package com.example.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var isFutureOperationButtonClicked: Boolean = false
    private var isInstantOperationButtonClicked: Boolean = false
    private var isEqualButtonClicked: Boolean = false

    private var currentNumber: Double = 0.0
    private var currentResult: Double = 0.0

    private val ZERO: String = "0"
    private val ONE: String = "1"
    private val TWO: String = "2"
    private val THREE: String = "3"
    private val FOUR: String = "4"
    private val FIVE: String = "5"
    private val SIX: String = "6"
    private val SEVEN: String = "7"
    private val EIGHT: String = "8"
    private val NINE: String = "9"
    private val DOT: String = "."

    private val ADDITION = " + "
    private val SUBTRACTION = " − "
    private val MULTIPLICATION = " × "
    private val DIVISION = " ÷ "
    private val EQUAL = " = "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn0.setOnClickListener {
            onNumberButtonClick(ZERO)
        }

        btn1.setOnClickListener {
            onNumberButtonClick(ONE)
        }

        btn2.setOnClickListener {
            onNumberButtonClick(TWO)
        }

        btn3.setOnClickListener {
            onNumberButtonClick(THREE)
        }

        btn4.setOnClickListener {
            onNumberButtonClick(FOUR)
        }

        btn5.setOnClickListener {
            onNumberButtonClick(FIVE)
        }

        btn6.setOnClickListener {
            onNumberButtonClick(SIX)
        }

        btn7.setOnClickListener {
            onNumberButtonClick(SEVEN)
        }

        btn8.setOnClickListener {
            onNumberButtonClick(EIGHT)
        }

        btn9.setOnClickListener {
            onNumberButtonClick(NINE)
        }
    }
    private fun onNumberButtonClick(number: String) {

        //сюда типо впишу, чтобы цифры в инпут вводились, плюс чекалось на =,+,- и т.п.
        //потом если = итп то чистило EditText заносило стринг в инпут и его в double
    }

}