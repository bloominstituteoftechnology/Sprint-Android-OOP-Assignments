package com.example.genericpractice

open class Service

class CellularService: Service()

open class Phone<T: CellularService>(var item: Service)

val tMobile = CellularService()
val verizon = CellularService()




//class Phone <T: CellularService>(item: Tmobile){

//}