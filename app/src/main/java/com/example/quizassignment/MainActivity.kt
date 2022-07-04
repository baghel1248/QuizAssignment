package com.example.quizassignment

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var image:ImageView=findViewById(R.id.imageview)
        var editText:EditText=findViewById(R.id.textView)
        var radioButton1:RadioButton=findViewById(R.id.radioButton1)
        var radioButton2:RadioButton=findViewById(R.id.radioButton2)
        var radioButton3:RadioButton=findViewById(R.id.radioButton3)
        var radioButton4:RadioButton=findViewById(R.id.radioButton4)
        var progressbar:ProgressBar=findViewById(R.id.progressbar)
        var button1:Button =findViewById(R.id.button)
        button1.setOnClickListener {
            var intent: Intent = Intent(applicationContext,SecondActivity2::class.java)
            startActivity(intent)
            progressbar.progress

        }
    }
}