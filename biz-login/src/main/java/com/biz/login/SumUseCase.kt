package com.biz.login

class SumUseCase(val stringsProvider: StringsProvider) {

    fun execute(firstNumber: Int, secondNumber: Int): Result {
        return if (firstNumber > 0 && secondNumber > 0) {
            Result.Success(firstNumber + secondNumber)
        } else {
            Result.Failure(stringsProvider.getString(R.string.both_numbers_must_be_positive))
        }
    }

    sealed class Result {
        class Success(val result: Int) : Result()
        class Failure(val message: String) : Result()
    }

}