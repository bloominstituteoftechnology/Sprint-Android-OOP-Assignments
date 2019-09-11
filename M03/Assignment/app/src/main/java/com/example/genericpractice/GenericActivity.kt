package com.example.genericpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GenericActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic)
    }

    override fun onStart() {
        super.onStart()

        open class Ball


        class Volleyball: Ball()
        open class GolfBall: Ball()
        class SomeBall : GolfBall()

        class Box<T: Ball>(private var item: Ball)

        val ball = Ball()
        val volleyball = Volleyball()
        val golfball = GolfBall()
        val someball = SomeBall()


        val ballBox = Box<Ball>(ball)
        val volleyBox = Box<Ball>(volleyball)
        val golfBallBox = Box<Ball>(golfball)
        val someBallBox = Box<Ball>(someball)
    }

}
