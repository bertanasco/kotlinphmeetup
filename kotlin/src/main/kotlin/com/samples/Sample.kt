package com.samples

object Sample {

    @JvmStatic
    fun main(args: Array<String>) {
        val p = Person("Yo",2)

        val persons = listOf(
                Person("Bert", 32),
                Person("Blaise", 3),
                Person("Caden",1)
        )

        val bert = persons.find{ person -> person.name.equals("Bert") }
        println(bert?.name)
        println(bert.toString())

    }
}
