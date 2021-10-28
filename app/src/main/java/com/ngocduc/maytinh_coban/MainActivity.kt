package com.ngocduc.maytinh_coban

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoncong.setOnClickListener{
            var sothu1 : Int = (editextsothu1.text.toString()).toInt()
            var sothu2 : Int = (editextsothu2.text.toString()).toInt()
            var ketqua : Int =sothu1 + sothu2
            textviewketqua.text=ketqua.toString()
        }
        buttontru.setOnClickListener {
            var sothu1 : Int =(editextsothu1.text.toString()).toInt()
            var sothu2 : Int =(editextsothu2.text.toString()).toInt()
            var ketqua : Int =sothu1 - sothu2
            textviewketqua.text=ketqua.toString()
        }
        buttonnhan.setOnClickListener {
            var sothu1 : Int =(editextsothu1.text.toString()).toInt()
            var sothu2 : Int =(editextsothu2.text.toString()).toInt()
            var ketqua : Int =sothu1 * sothu2
            textviewketqua.text=ketqua.toString()
        }
        buttonchia.setOnClickListener {
            var sothu1 : Int =(editextsothu1.text.toString()).toInt()
            var sothu2 : Int =(editextsothu2.text.toString()).toInt()
            var ketqua : Int =sothu1 / sothu2
            textviewketqua.text=ketqua.toString()
        }
    }
}