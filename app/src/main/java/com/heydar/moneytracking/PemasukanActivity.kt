package com.heydar.moneytracking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PemasukanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pemasukan)

//        Day ComboBox
        val items = listOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")

    }
}