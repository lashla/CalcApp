package com.example.calcapp

class ArithmeticOperations {
    companion object{
        private fun removeZeroAfterDot(result: String): String{
            var value = result
            if(result.contains(".0"))
                value = result.substring(0,result.length-2)

            return value
        }
        fun subtract(currentNumber:Double, pastNumber: Double): String{
            val value = (pastNumber - currentNumber).toString()
            return removeZeroAfterDot(value)
        }
        fun multiply(currentNumber:Double, pastNumber: Double): String{
            val value = (pastNumber * currentNumber).toString()
            return removeZeroAfterDot(value)
        }
        fun divide(currentNumber:Double, pastNumber: Double): String{
            val value = (pastNumber / currentNumber).toString()
            return removeZeroAfterDot(value)
        }
        fun addition(currentNumber:Double, pastNumber: Double): String{
            val value = (pastNumber + currentNumber).toString()
            return removeZeroAfterDot(value)
        }
    }
}