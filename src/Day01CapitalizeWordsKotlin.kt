package com.interview.daily

import java.util.regex.Pattern

fun capitalizeWords(input: String?): String? {
    if (input.isNullOrEmpty()) return input
    return input.split(" ").joinToString(" ") { word ->
        word[0].uppercaseChar() + word.substring(1)
    }
}

fun captilize(input: String?): String {
    if (input.isNullOrEmpty()) return input ?: ""

    val test = arrayOf("Atest")
    val inputList = input.split(" ")
    val sb = StringBuilder()

    /*for (value in inputList) {
        sb.append(value[0].uppercaseChar())
            .append(value.substring(1))
            .append("")
    }*/

    /* val results = inputs.map { s -> wand.matcher(s).replaceAll { m -> m.group().uppercase() } } */

    val wand = Pattern.compile("\\b\\w")
    val result = wand.matcher("hellow, java worlds")
        .replaceAll { match -> match.group().uppercase() }

    // val result = Arrays.stream(input)

    return result
}

fun testCapitalize(input: Array<String>): List<String> {
    val wand = Pattern.compile("\\b\\w")

    input.map { i -> wand.matcher(i).replaceAll { inn -> inn.group().uppercase() } }
    // input.map { i -> wand.matcer(i).replaceAll { inn -> inn.group.uppercase() } }

    return input.map { i -> wand.matcher(i).replaceAll { matchResult -> matchResult.group().uppercase() } }
}

fun main() {
    val input = arrayOf("hello", "java", "worldava")
    val tets = listOf("OMS", "MK")
    val inn = arrayOf(1, 2, 3)

    val result = testCapitalize(input)

    println("Input: " + input)
    println("Output: " + result)
}
