package edu.washington.briando.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "ActivitySpy"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "on {event-name} event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "We're going down captain!")
    }
}
