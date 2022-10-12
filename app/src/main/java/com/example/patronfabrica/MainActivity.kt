package com.example.patronfabrica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val TAG = "myTag";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val fillingFactory = FactoryGenerator.getFactory("FIL");
        val filling = fillingFactory!!.getFilling("TOM");

        val breadFactory = FactoryGenerator.getFactory("BRE");
        val bread = breadFactory!!.getBread("BAG");

        val textView = findViewById<TextView>(R.id.textView);
        textView.text = StringBuilder()
            .append(filling!!.name())
            .append(filling!!.calories())
            .append("\n")
            .append(bread!!.name())
            .append(bread!!.calories());

        Log.d(TAG,filling.name());
    }
}