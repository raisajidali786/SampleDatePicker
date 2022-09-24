package com.codewsa.sampledatepicker

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var tvDate:TextView
    private lateinit var btnShowDialog:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDate = findViewById(R.id.tv_date)
        btnShowDialog = findViewById(R.id.btn_show_dialog)

        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this,
            { datePicker, year, month, day ->
                tvDate.text = "$day/$month/$year"
            },year,month,day)

        btnShowDialog.setOnClickListener {
            datePickerDialog.show()
        }
    }
}