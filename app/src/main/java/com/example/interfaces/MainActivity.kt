package com.example.interfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        infoToastWithFont.setOnClickListener(View.OnClickListener {
          //  Toast.makeText(applicationContext,"this is toast message", Toast.LENGTH_LONG).show()
            KCustomToast.infoToast(this, "This is a custom info Toast with custom font", KCustomToast.GRAVITY_BOTTOM, ResourcesCompat.getFont(this,R.font.canterburyf))


        })


    }
    fun showInfoToastWithTypeface(view: View) {
        KCustomToast.infoToast(this, "This is a custom info Toast with custom font", KCustomToast.GRAVITY_BOTTOM, ResourcesCompat.getFont(this,R.font.canterburyf))
    }



}

