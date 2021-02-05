package com.tech.spinnertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DataActivity : AppCompatActivity() {

    var tv1:TextView?=null
    var tv2:TextView?=null
    var tv3:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)


     tv1=findViewById(R.id.textView)
        tv2=findViewById(R.id.textView2)
        tv3=findViewById(R.id.textView3)

        var city=intent.getStringExtra("mycity")
        tv1?.setText("my city is:  $city")


        var state=intent.getStringExtra("mystate")
        tv2?.setText("my state is:  $state")

        var village=intent.getStringExtra("myvillage")
        tv3?.setText("my village is:  $village")



    }
}