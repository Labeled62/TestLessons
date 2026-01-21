package org.example

//Создайте переменную var serverStatus = "processing". Напишите цикл while, который имитирует опрос сервера:
//он должен печатать "Статус: $serverStatus",
//делать serverStatus = "processing" 3 раза, а на 4-й раз установить serverStatus = "success".
//Цикл должен завершиться, когда статус станет "success".
fun main() {
    var serverStatus = "processing"
    var attempt = 0

    while (serverStatus != "success") {
        println("Статус: $serverStatus")
        attempt++

        if (attempt < 3) {
            serverStatus = "processing"  // оставляем "processing" первые 3 раза
        } else {
            serverStatus = "success"     // на 4-й раз меняем на "success"
        }
    }

    println("Опрос сервера завершен. Финальный статус: $serverStatus")
    println("=== Имитация тестовых запусков ===")
    simulateTestRuns()

    println("=== Классификация тестов ===")

    // Тестируем разные сценарии
    println(evaluateTest(5, 3))   // Быстрый тест
    println(evaluateTest(15, 2))  // Стандартный тест
    println(evaluateTest(20, 5))  // Сложный тест
    println(evaluateTest(45, 1))  // Длительный тест
    println(evaluateTest(-5, 3))  // Некорректные параметры
    println(evaluateTest(25, 7))  // Некорректные параметры
}
fun simulateTestRuns() {
    for (i in 1..5) {
        when (i) {
            in 1..3 -> println("Тест $i: В процессе")
            4 -> println("Тест 4: Провален")
            5 -> println("Тест 5: Успех")
        }
    }
}

//Напишите функцию, которая определяет сложность теста на основе:
//duration (длительность в минутах)
//complexity (сложность от 1 до 5)
//Используйте when для определения результата:
//До 10 минут: "Быстрый тест"
//10-30 минут с сложностью 1-3: "Стандартный тест"
//10-30 минут с сложностью 4-5: "Сложный тест"
//Свыше 30 минут: "Длительный тест"
fun evaluateTest(duration: Int, complexity: Int): String {
    return when {
        duration <= 0 || complexity !in 1..5 -> "Некорректные параметры"
        duration < 10 -> "Быстрый тест"
        duration <= 30 && complexity <= 3 -> "Стандартный тест"
        duration <= 30 && complexity > 3 -> "Сложный тест"
        else -> "Длительный тест"
    }
}