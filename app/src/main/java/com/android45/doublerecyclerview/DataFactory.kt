package com.android45.doublerecyclerview

import java.util.*


object DataFactory {
    private val random = Random()

    private val titles =  arrayListOf( "Now Playing", "Classic", "Comedy", "Thriller", "Action", "Horror", "TV Series")

    private fun randomTitle() : String{
        val index = random.nextInt(titles.size)
        return titles[index]
    }

    private fun randomChildren() : List<Employee>{
        return EmployeeFactory.getChildren(20)
    }

    fun getParents(count : Int) : List<Data>{
        val parents = mutableListOf<Data>()
        repeat(count){
            val parent = Data(randomTitle(), randomChildren())
            parents.add(parent)
        }
        return parents
    }
}