package Programmers.L1

private fun solution(phone_number: String): String {
    val encryptor = Encryptor('*', 4)

    return encryptor.encrypt(phone_number)
}

fun main() {
    println(solution("333"))
}

class Encryptor(
    var maskingChar: Char,
    var lengthOfNonMasking: Int
) {
    private fun leftIndexOfNonMaskingNumber(phoneNumber: String): Int {
        return phoneNumber.lastIndex - lengthOfNonMasking + 1
    }

    fun encrypt(phoneNumber: String): String {
        val leftIndexOfNonMaskingNumber = leftIndexOfNonMaskingNumber(phoneNumber)

        return phoneNumber.foldRightIndexed("") { index, c, acc ->
            if (index >= leftIndexOfNonMaskingNumber) {
                "$c$acc"
            } else {
                "$maskingChar$acc"
            }
        }
    }
}