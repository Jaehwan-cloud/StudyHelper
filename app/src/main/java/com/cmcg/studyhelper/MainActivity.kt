package com.cmcg.studyhelper

import android.net.wifi.p2p.WifiP2pManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.util.*



class MainActivity : AppCompatActivity(){
    var timersw:timerSW = timerSW();

    override fun onCreate(savedInstanceState: Bundle?) {
        var startBtn: Button = findViewById(R.id.study_btn)
        startBtn.setOnClickListener{
            timersw.clickHandler(it)
        }



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



}
