package com.example.imageviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var imge1:ImageView
    private lateinit var imge2:ImageView

    private lateinit var btn1:Button
    private lateinit var btn2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imge1 = findViewById(R.id.imge1)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)



        btn1.setOnClickListener {
            imge1.setImageResource(
                R.drawable.pic1
            )
        }
        btn2.setOnClickListener {
            imge1.setImageResource(
                R.drawable.pic2
            )
        }

    }
}