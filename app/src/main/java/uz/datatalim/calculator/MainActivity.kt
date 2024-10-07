package uz.datatalim.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity(), OnClickListener {
    lateinit var display: TextView
    lateinit var delite:Button
    lateinit var percent:Button
    lateinit var bNumber0:Button
    lateinit var bNumber1: Button
    lateinit var bNumber2: Button
    lateinit var bNumber3: Button
    lateinit var bNumber4: Button
    lateinit var bNumber5: Button
    lateinit var bNumber6: Button
    lateinit var bNumber7: Button
    lateinit var bNumber8: Button
    lateinit var bNumber9: Button
    lateinit var bEquals: Button
    lateinit var bPlus: Button
    lateinit var bMinus: Button
    lateinit var divide:Button
    lateinit var multiplay:Button
    lateinit var clear:Button
    lateinit var dot:Button
    var son1 = 0.0
    var son2 = 0.0
    var natija = 0.0
    var operator:Int=0+1
    var check=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }

    fun initViews() {

        display = findViewById<TextView>(R.id.tv_display)
        dot = findViewById<Button>(R.id.dot)
        bNumber0 = findViewById<Button>(R.id.b_number_0)
        bNumber1 = findViewById<Button>(R.id.b_number_1)
        bNumber2 = findViewById<Button>(R.id.b_number_2)
        bNumber3 = findViewById<Button>(R.id.b_number_3)
        bNumber4 = findViewById<Button>(R.id.b_number_4)
        bNumber5 = findViewById<Button>(R.id.b_number_5)
        bNumber6 = findViewById<Button>(R.id.b_number_6)
        bNumber7 = findViewById<Button>(R.id.b_number_7)
        bNumber8 = findViewById<Button>(R.id.b_number_8)
        bNumber9 = findViewById<Button>(R.id.b_number_9)
        bEquals = findViewById(R.id.b_equals)
        bPlus = findViewById(R.id.b_plus)
        bMinus = findViewById<Button>(R.id.b_minus)
        divide = findViewById<Button>(R.id.divide)
        multiplay = findViewById<Button>(R.id.multiply)
        clear = findViewById<Button>(R.id.clear)
        percent = findViewById(R.id.percent)
        delite = findViewById<Button>(R.id.delite)
        dot.setOnClickListener(this)
        delite.setOnClickListener(this)
        bNumber0.setOnClickListener(this)
        bNumber1.setOnClickListener(this)
        bNumber2.setOnClickListener(this)
        bNumber3.setOnClickListener(this)
        bNumber4.setOnClickListener(this)
        bNumber5.setOnClickListener(this)
        bNumber6.setOnClickListener(this)
        bNumber7.setOnClickListener(this)
        bNumber8.setOnClickListener(this)
        bNumber9.setOnClickListener(this)
        bEquals.setOnClickListener(this)
        bPlus.setOnClickListener(this)
        bMinus.setOnClickListener(this)
        divide.setOnClickListener(this)
        multiplay.setOnClickListener(this)
        clear.setOnClickListener(this)
        percent.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.b_number_0->{
                var dText = display.text
                if (dText == "0") {
                    display.text = "0"
                }
                else {
                    display.text = "${dText}0"
                }
            }
            R.id.b_number_1 -> {
                var dText = display.text
                if (dText == "0") {
                    display.text = "1"
                } else {
                    display.text = "${dText}1"
                }

            }

            R.id.b_number_2 -> {
                var dText = display.text
                if (dText == "0") {
                    display.text = "2"
                } else {
                    display.text = "${dText}2"
                }
            }

            R.id.b_number_3 -> {
                var dText = display.text
                if (dText == "0") {
                    display.text = "3"
                } else {
                    display.text = "${dText}3"
                }
            }

            R.id.b_number_4 -> {
                var dText = display.text
                if (dText == "0") {
                    display.text = "4"
                } else {
                    display.text = "${dText}4"
                }
            }

            R.id.b_number_5 -> {
                var dText = display.text
                if (dText == "0") {
                    display.text = "5"
                } else {
                    display.text = "${dText}5"
                }
            }

            R.id.b_number_6 -> {
                var dText = display.text
                if (dText == "0") {
                    display.text = "6"
                } else {
                    display.text = "${dText}6"
                }
            }

            R.id.b_number_7 -> {
                var dText = display.text
                if (dText == "0") {
                    display.text = "7"
                } else {
                    display.text = "${dText}7"
                }
            }

            R.id.b_number_8 -> {
                var dText = display.text
                if (dText == "0") {
                    display.text = "8"
                } else {
                    display.text = "${dText}8"
                }
            }

            R.id.b_number_9 -> {
                var dText = display.text
                if (dText == "0") {
                    display.text = "9"
                } else {
                    display.text = "${dText}9"
                }
            }

            R.id.b_plus -> {
                son1 = display.text.toString().toDouble()
                operator=1
                display.text = "0"
            }

            R.id.b_minus -> {
                son1 = display.text.toString().toDouble()
                operator=2
                display.text = "0"
            }
            R.id.multiply->{
                son1 = display.text.toString().toDouble()
                operator=3
                display.text = "0"

            }
            R.id.divide->{
                son1 = display.text.toString().toDouble()
                operator=4
                display.text = "0"
            }
            R.id.percent->{
                son1 = display.text.toString().toDouble()
                operator=5
                natija=son1/100
                display.text="$natija"
            }
            R.id.clear->{
                display.text="0"
            }
            R.id.delite->{
                operator=6
                var backspace:String?=null
                if (display.text.isNotEmpty()) {
                    var str:StringBuilder=StringBuilder(display.text)
                    var find = display.text.toString()
                    var find2 = find.last()
//                    if (find2.equals("+")||find2.equals("-")||find2.equals("*")||find2.equals("/")||find2.equals("%")){
//
//                    }
                    str.deleteCharAt(display.text.length-1)
                    backspace=str.toString()
                    display.text = backspace
                    display.text
                }
            }
            R.id.dot->{
                var dText = display.text
                if (dText == "0") {
                    display.text = "0"
                }
                else {
                    display.text = "${dText}."
                }
            }


            R.id.b_equals -> {
                son2 = display.text.toString().toDouble()
                when (operator) {
                    1->{
                        natija=son1+son2
                    }
                    2->{
                        natija=son1-son2
                    }
                    3->{
                        natija=son1*son2
                    }
                    4->{
                        natija=son1/son2
                    }
                    5->{
                        natija=son1/100
                    }
                    6->{
                        display.text

                    }
                }
                display.text = "$natija"
            }

        }
    }
}