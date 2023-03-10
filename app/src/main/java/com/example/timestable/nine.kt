package com.example.timestable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class nine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nine)

        //Activate go back button
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Receive the val "EXTRA_NUMBER" from the main activity
        val timesTable = intent.getIntExtra("EXTRA_NUMBER",0)
        //Create a val to receive by id from XML number to multip[ly
        val numberTimesTable = findViewById<TextView>(R.id.TVtimesTable)
        //Create a val to receive by id from XML results of times table
        val resultsTimesTable = findViewById<TextView>(R.id.TVresults)
        //showing the number that came from the main activity on this textview
        numberTimesTable.text = timesTable.toString()
        //converting to string
        val numberStg = numberTimesTable.text.toString()
        val num = numberStg.toInt()
        var printing = ""
        var result:Int

        for(count in 1..12) {
            result = num*count
            printing +="$num X $count = $result\n"

        }
        resultsTimesTable.text=printing
    }

    //Make the go back button close the current activit going back to the main activity
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }

}