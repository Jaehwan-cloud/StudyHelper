package com.cmcg.studyhelper

import android.app.AppComponentFactory
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

import java.util.*


class timerSW : AppCompatActivity() {

    internal var textView: TextView? = null
    internal var timerTask: TimerTask? = null
    internal var timer = Timer()
    internal var time = 0

    override fun onDestroy() {
        timer.cancel()
        super.onDestroy()
    }

    fun clickHandler(view: View) {
        when (view.id) {
            R.id.study_btn -> startTimerTask()
        }
    }

    private fun startTimerTask() {
        stopTimerTask()

        timerTask = object : TimerTask() {
            override fun run() {
                time++;
                textView!!.setText(time)
            }
        }

        timer.schedule(timerTask, 1, 1000)
    }


    private fun stopTimerTask() {
        if (timerTask != null) {
            timerTask!!.cancel()
            timerTask = null
        }
    }

    private fun resetTimerTask() {
        time = 0
    }
}

