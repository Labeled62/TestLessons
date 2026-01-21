package org.example



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//Напишите функцию
//fun simulateElementSearch(searchId: Int): String?
//которая возвращает:
//"Элемент №$searchId" для searchId > 0.
//null для любого другого searchId.

fun simulateElementSearch(searchId: Int): String? =
    if (searchId > 0) "Элемент №$searchId" else null

//В функции main вызовите simulateElementSearch с разными аргументами (например, 2 и -5).
//Используйте оператор Элвиса ?:, чтобы вывести "Элемент не найден" в случае null.
fun main() {
    val result1 = simulateElementSearch(2) ?: "Элемент не найден"
    println("Результат поиска с ID=2: $result1")

    val result2 = simulateElementSearch(-5) ?: "Элемент не найден"
    println("Результат поиска с ID=-5: $result2")

    println("ID=0: ${simulateElementSearch(0) ?: "Элемент не найден"}")
    println("ID=10: ${simulateElementSearch(10) ?: "Элемент не найден"}")
    println("ID=-1: ${simulateElementSearch(-1) ?: "Элемент не найден"}")
    checkServerResponse()
}
//Смоделируйте ответ от сервера:
//val serverResponse: Any = arrayOf("error", 404):
//Используя is и as?, проверьте, является ли второй элемент списка числом.
//Если да, напечатайте "Код ошибки: <число>".
//Если нет, напечатайте "Неизвестный код ошибки".

fun checkServerResponse() {
    val serverResponse: Any = arrayOf("error", 404)

    val responseArray = serverResponse as? Array<*>

    if (responseArray != null && responseArray.size >= 2) {
        val errorCode = responseArray[1] as? Int

        if (errorCode != null) {
            println("Код ошибки: $errorCode")
        } else {
            println("Неизвестный код ошибки")
        }
    } else {
        println("Неверный формат ответа")
    }
}