package com.android45.doublerecyclerview

import java.util.*

object EmployeeFactory {
    private val random = Random()

    private val titles =  arrayListOf( "Aviator", "Now you can See me", "God Father", "Mission Impossible", "3 idiots")

    private fun randomTitle() : String{
        val index = random.nextInt(titles.size)
        return titles[index]
    }

    private fun randomImage() : Int{
        return R.drawable.ic_launcher_background
    }

    fun getChildren(count : Int) : List<Employee>{
        val children = mutableListOf<Employee>()
        repeat(count){
            val child = Employee(randomImage(), randomTitle())
            children.add(child)
        }
        return children
    }
}