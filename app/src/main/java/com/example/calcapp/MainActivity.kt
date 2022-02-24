package com.example.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    private var isOperationButtonClicked: Boolean = false
    private var isEqualButtonClicked: Boolean = false

    private var currentValue: String = ""
    private var currentNumber: Double = 0.0
    private var pastNumber: Double = 0.0
    private var pastValue: String = ""

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

    private var lastOperation: String = ""

    private val ADDITION = "+"
    private val SUBTRACTION = "−"
    private val MULTIPLICATION = "×"
    private val DIVISION = "÷"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnListeners()
    }

    private fun btnListeners() {
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
        btnDot.setOnClickListener{
            currentValue = tvInput.text.toString()
            if(isOperationButtonClicked
                || isEqualButtonClicked) {
                currentValue = StringBuilder().append(ZERO).append(DOT).toString()
                if (isEqualButtonClicked)
                    currentNumber = 0.0
            } else if (currentValue.contains(DOT)){
                return@setOnClickListener
            } else currentValue = StringBuilder().append(currentValue).append(DOT).toString()

            tvInput.text = currentValue

        }
        btnSubtract.setOnClickListener{
            onOperationButtonClick(SUBTRACTION)
        }
        btnMultiply.setOnClickListener{
            onOperationButtonClick(MULTIPLICATION)
        }
        btnPlus.setOnClickListener{
            onOperationButtonClick(ADDITION)
        }
        btnDevide.setOnClickListener{
            onOperationButtonClick(DIVISION)
        }
        btnEqual.setOnClickListener{
            onEqualButtonClick(lastOperation)
            lastOperation = ""
        }
    }
    private fun onNumberButtonClick(number: String) {
        currentValue = tvInput.text.toString()
        currentValue = if (currentValue == ZERO ||
                isEqualButtonClicked ||
                isOperationButtonClicked) number else StringBuilder().append(currentValue).append(number).toString()

        currentNumber = currentValue.toDouble()

        tvInput.text = currentValue

        isEqualButtonClicked = false
        isOperationButtonClicked = false
    }
    private fun onOperationButtonClick(operationName: String){
        pastNumber = currentNumber
        pastValue = currentValue
        currentNumber = 0.0
        currentValue = ""
        tvInput.text = currentValue
        isOperationButtonClicked = true
        lastOperation = operationName
    }
    private fun onEqualButtonClick(lastOperation: String) {
        if (lastOperation.isEmpty() || currentValue.isEmpty() || pastValue.isEmpty()) {
            Toast.makeText(this, "Something is wrong done", Toast.LENGTH_LONG).show()
        } else {
            when (lastOperation) {
                "+" -> tvInput.text = ArithmeticOperations.addition(currentNumber, pastNumber)
                "-" -> tvInput.text = ArithmeticOperations.subtract(currentNumber, pastNumber)
                "*" -> tvInput.text = ArithmeticOperations.multiply(currentNumber, pastNumber)
                "/" -> tvInput.text = ArithmeticOperations.divide(currentNumber, pastNumber)
            }
        }
        isEqualButtonClicked = true
    }
}