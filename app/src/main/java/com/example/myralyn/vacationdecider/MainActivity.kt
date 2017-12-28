package com.example.myralyn.vacationdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val vacationList= arrayListOf("Cuba","Mexico","Japan","Europe","Iceland")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomVacation = random.nextInt(vacationList.count())
            selectedVacationTxt.text = vacationList[randomVacation]
            addVacationBtn.setOnClickListener {
                val newVacation = addVacationTxt.text.toString()
                vacationList.add(newVacation)
        }

            //clear edit text, addVacationtxt for next enty
            addVacationTxt.text.clear()
            println(vacationList)
        }



    }
}
