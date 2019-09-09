package com.lambdaschool.httpoperations.model

import android.util.Log

open class Employee(val name:String,  val id: Int, val age:Int, val title: String)

// TODO 5: Try to make some subclasses of this class. Is there an issue?
class Engineer( name:String, id: Int, age:Int, title: String):Employee(name,id,age,title)
        fun DoEnginnering(){
            Log.i("Employee","do Engineer things")
        }

class Officer( name:String, id: Int, age:Int, title: String):Employee(name,id,age,title)
fun goToBoardMeeting(){

}

class Tester( name:String, id: Int, age:Int, title: String):Employee(name,id,age,title)

class Designer( name:String, id: Int, age:Int, title: String):Employee(name,id,age,title)


// TODO 6: Make the Employee class open and start to derive some subclasses (CLevelEmployee, Engineer, etc.)

/* TODO 7: Make a function in the Employee class to return an email address as a String.
    Use the format "$name@bigcorp.com"
 */

/* TODO 8: Add a function to the Employee class to generate an email signature.
    The signature should start "Best regards,\n$name, $title\n"
    For non-C-level employees, add the email address on the next line
    For C-level employees, don't include the email address
 */

// TODO 9: Make up some data to use
object employeesFakeData : ArrayList<Employee>(
    arrayListOf(
        Engineer(
            name = "Steve",
            id = 1,
            age = 25,
            title = "Engineer"
        ),
        Engineer(
            name = "Mark",
            id = 2,
            age = 25,
            title = "Engineer"
        ),
        Officer(
            name = "Daniel",
            id = 3,
            age = 45,
            title = "CTO"
        ),
        Officer(
            name = "Justin",
            id = 4,
            age = 55,
            title = "CEO"
        ),
        Tester(
            name = "Matt",
            id = 5,
            age = 30,
            title = "Tester"
        ),
        Designer(
            name = "Mike",
            id = 6,
            age = 31,
            title = "UX Designer"
        )
    )
)
