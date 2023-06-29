package com.satnam.task3application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etname : EditText
    lateinit var etrollno : EditText
    lateinit var ettemp: EditText
    lateinit var btnmove: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etname = findViewById(R.id.etname)
        etrollno = findViewById(R.id.etrollno)
        ettemp = findViewById(R.id.ettemp)
        btnmove = findViewById(R.id.btnmove)

        btnmove.setOnClickListener {
            if(etname.text.toString().isNullOrEmpty()){
                etname.error = "Enter your name"
            }else if(etrollno.text.toString().isNullOrEmpty()){
                etrollno.error="Enter your University RollNo"
            }else if(ettemp.text.toString().isNullOrEmpty()){
                ettemp.error="Enter temperature of your city"
            }else{
                Toast.makeText(this,"Transfer is Successful",Toast.LENGTH_SHORT).show()
                var etname = etname.text.toString()
                var etrollno = etrollno.text.toString()
                var ettemp = ettemp.text.toString()
                var intent = Intent(this,DataTransferActivity::class.java)
                intent.putExtra("name",etname)
                intent.putExtra("rollNo",etrollno)
                intent.putExtra("temp",ettemp)
                startActivity(intent)
                finish()
            }
        }
    }
}