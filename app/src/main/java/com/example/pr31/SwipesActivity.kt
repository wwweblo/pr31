package com.example.pr31

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.Toast

class SwipesActivity : AppCompatActivity() {

    private lateinit var gestureDetector: GestureDetector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipes)

//        gestureDetector = GestureDetector(this, object : GestureDetector.SimpleOnGestureListener() {
//            private val swipeThreshold = 100f
//            private val swipeVelocityThreshold = 100f
//
//            @Override
//            fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
//                val deltaX = e2.x - e1.x
//                val deltaY = e2.y - e1.y
//                if (Math.abs(deltaX) > Math.abs(deltaY) && Math.abs(deltaX) > swipeThreshold && Math.abs(velocityX) > swipeVelocityThreshold) {
//                    if (deltaX > 0) {
//                        // Swipe right
//                        Toast.makeText(this@SwipesActivity, "Swipe Right", Toast.LENGTH_SHORT).show()
//                        startActivity(Intent(this@SwipesActivity, MainActivity::class.java))
//                    } else {
//                        // Swipe left
//                        Toast.makeText(this@SwipesActivity, "Swipe Left", Toast.LENGTH_SHORT).show()
//                        startActivity(Intent(this@SwipesActivity, ScrollActivity::class.java))
//                    }
//                    return true
//                }
//                return false
//            }
//        })
//    }
//
//    override fun onTouchEvent(event: MotionEvent): Boolean {
//        return gestureDetector.onTouchEvent(event)
    }
}
