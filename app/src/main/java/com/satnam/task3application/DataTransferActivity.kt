package com.satnam.task3application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class DataTransferActivity : AppCompatActivity() {

    var name =""
    var rollno =""
    var temperature = ""
    lateinit var eteName : EditText
    lateinit var eterollno : EditText
    lateinit var eteTemp : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_transfer)

        eteName = findViewById(R.id.eteName)
        eterollno = findViewById(R.id.eterollno)
        eteTemp = findViewById(R.id.eteTemp)

        intent?.extras?.let{
            name = it.getString("name","")
            rollno = it.getString("rollNo","")
            temperature= it.getString("temp","")
        }

        eteName.setText(name)
        eterollno.setText(rollno)
        eteTemp.setText(temperature)

    }
}