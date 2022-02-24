package com.example.calcapp

class ArithmeticOperations {
    companion object{
        fun subtract(currentNumber:Double, pastNumber: Double): String{
            return (pastNumber - currentNumber).toString()
        }
        fun multiply(currentNumber:Double, pastNumber: Double): String{
            return (pastNumber * currentNumber).toString()
        }
        fun divide(currentNumber:Double, pastNumber: Double): String{
            return (pastNumber / currentNumber).toString()
        }
        fun addition(currentNumber:Double, pastNumber: Double): String{
            return (pastNumber + currentNumber).toString()
        }
    }

}