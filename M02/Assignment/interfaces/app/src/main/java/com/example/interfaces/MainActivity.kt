package com.example.interfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helicopter = Helicopter()
        val airplane = Airplane()
        val hovercraft = Hovercraft()
        val atv = ATV()
        val submarine = Submarine()
        val tank = Tank()

        val list_vehicle = listOf<Vehicle>(helicopter, airplane, hovercraft, atv, submarine, tank)

        list_vehicle.forEach{
            it.travel()
        }
    }
}
