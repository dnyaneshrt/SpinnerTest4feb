package com.tech.spinnertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    var sp1: Spinner?=null
    var sp2: Spinner?=null
    var sp3: Spinner?=null
    var btn: Button?=null


    lateinit var myselectedstate:String
    lateinit var myselectedcity:String
    lateinit var myselectedvillage:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sp1=findViewById(R.id.spin_cities)

        sp2=findViewById(R.id.spin_states)
        sp3=findViewById(R.id.spin_villages)
        btn=findViewById(R.id.submit_button)

sp1?.onItemSelectedListener= object : AdapterView.OnItemSelectedListener {
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
         myselectedcity=sp1?.getItemAtPosition(position).toString()


    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

}


        sp2?.onItemSelectedListener= object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                myselectedstate=sp2?.getItemAtPosition(position).toString()


            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        sp3?.onItemSelectedListener= object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
             myselectedvillage=  sp3?.getItemAtPosition(position).toString()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        btn?.setOnClickListener {
            var intent=Intent(this,DataActivity::class.java)
            intent.putExtra("mycity",myselectedcity)

            intent.putExtra("mystate",myselectedstate)

            intent.putExtra("myvillage",myselectedvillage)
            startActivity(intent)



        }
    }
}