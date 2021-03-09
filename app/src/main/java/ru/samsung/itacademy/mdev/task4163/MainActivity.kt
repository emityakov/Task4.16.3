package ru.samsung.itacademy.mdev.task4163

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.start)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val work = OneTimeWorkRequest.Builder(MyWork::class.java)
                    .build()
                WorkManager.getInstance(applicationContext).enqueue(work)

            }
        })

    }
}

