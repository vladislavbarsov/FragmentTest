package com.example.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        // Initial setup for first fragment to be displayed
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment) // replace FrameLayout with Fragment tag
            commit() // apply changes
        }

        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment) // replace FrameLayout with Fragment tag
                addToBackStack(null) // add the fragment to backstack so that the Back button in the navigation panel switches them as well
                commit() // apply changes
            }
        }

        btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment) // replace FrameLayout with Fragment tag
                addToBackStack(null) // you can pass the name, but if you dont need - null.
                commit() // apply changes
            }
        }

    }
}