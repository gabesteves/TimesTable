package com.example.timestable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.BtnOne)
        val btn2: Button = findViewById(R.id.BtnTwo)
        val btn3: Button = findViewById(R.id.BtnThree)
        val btn4: Button = findViewById(R.id.BtnFour)
        val btn5: Button = findViewById(R.id.BtnFive)
        val btn6: Button = findViewById(R.id.BtnSix)
        val btn7: Button = findViewById(R.id.BtnSeven)
        val btn8: Button = findViewById(R.id.BtnEight)
        val btn9: Button = findViewById(R.id.BtnNine)
        val btn10: Button = findViewById(R.id.BtnTen)
        val btn11: Button = findViewById(R.id.BtnEleven)
        val btn12: Button = findViewById(R.id.BtnTwelve)

        //New Activity name one
        btn1.setOnClickListener {
            val number: Int = 1
            //Send the val number to the new activity as "EXTRA_NUMBER"
            val intent = Intent(this, one::class.java)
                .apply {
                    putExtra("EXTRA_NUMBER", number)
                }
            startActivity(intent)
        }
        //New Activity name two
        btn2.setOnClickListener {
            val number: Int = 2
            //Send the val number to the new activity as "EXTRA_NUMBER"
            val intent = Intent(this, two::class.java)
                .apply {
                    putExtra("EXTRA_NUMBER", number)
                }
            startActivity(intent)
        }
        //New Activity name three
        btn3.setOnClickListener {
            val number: Int = 3
            //Send the val number to the new activity as "EXTRA_NUMBER"
            val intent = Intent(this, three::class.java)
                .apply {
                    putExtra("EXTRA_NUMBER", number)
                }
            startActivity(intent)
        }
        //New Activity name four
        btn4.setOnClickListener {
            val number: Int = 4
            //Send the val number to the new activity as "EXTRA_NUMBER"
            val intent = Intent(this, four::class.java)
                .apply {
                    putExtra("EXTRA_NUMBER", number)
                }
            startActivity(intent)
        }
        //New Activity name Five
        btn5.setOnClickListener {
            val number: Int = 5
            //Send the val number to the new activity as "EXTRA_NUMBER"
            val intent = Intent(this, five::class.java)
                .apply {
                    putExtra("EXTRA_NUMBER", number)
                }
            startActivity(intent)
        }
        //New Activity name six
        btn6.setOnClickListener {
            val number: Int = 6
            //Send the val number to the new activity as "EXTRA_NUMBER"
            val intent = Intent(this, six::class.java)
                .apply {
                    putExtra("EXTRA_NUMBER", number)
                }
            startActivity(intent)
        }
        //New Activity name seven
        btn7.setOnClickListener {
            val number: Int = 7
            //Send the val number to the new activity as "EXTRA_NUMBER"
            val intent = Intent(this, seven::class.java)
                .apply {
                    putExtra("EXTRA_NUMBER", number)
                }
            startActivity(intent)
        }
        //New Activity name eight
        btn8.setOnClickListener {
            val number: Int = 8
            //Send the val number to the new activity as "EXTRA_NUMBER"
            val intent = Intent(this, eight::class.java)
                .apply {
                    putExtra("EXTRA_NUMBER", number)
                }
            startActivity(intent)
        }
        //New Activity name nine
        btn9.setOnClickListener {
            val number: Int = 9
            //Send the val number to the new activity as "EXTRA_NUMBER"
            val intent = Intent(this, nine::class.java)
                .apply {
                    putExtra("EXTRA_NUMBER", number)
                }
            startActivity(intent)
        }
        //New Activity name ten
        btn10.setOnClickListener {
            val number: Int = 10
            //Send the val number to the new activity as "EXTRA_NUMBER"
            val intent = Intent(this, ten::class.java)
                .apply {
                    putExtra("EXTRA_NUMBER", number)
                }
            startActivity(intent)
        }
        //New Activity name eleven
        btn11.setOnClickListener {
            val number: Int = 11
            //Send the val number to the new activity as "EXTRA_NUMBER"
            val intent = Intent(this, eleven::class.java)
                .apply {
                    putExtra("EXTRA_NUMBER", number)
                }
            startActivity(intent)
        }
        //New Activity name twelve
        btn12.setOnClickListener {
            val number: Int = 12
            //Send the val number to the new activity as "EXTRA_NUMBER"
            val intent = Intent(this, twelve::class.java)
                .apply {
                    putExtra("EXTRA_NUMBER", number)
                }
            startActivity(intent)
        }
    }
}