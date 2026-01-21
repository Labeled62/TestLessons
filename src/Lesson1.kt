package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Тест на Email")
    //data
    var invalidEmails: List<String> = listOf("безсобаки", "@без-логина", "с-точкой-в-начале.@mail.ru")
    var currentEmail = invalidEmails[1]
    //controls
    var systemErrorMessage = "Неверный формат email"
    //asserts
    println("Проверяем почту:'$currentEmail'")
    println("Текст ошибки: '$systemErrorMessage'")
    println("Длина значения из пула:'${currentEmail.length}'")
    println("Соответствует сообщение формату?:'${systemErrorMessage.contains(other = "формат")}")

}