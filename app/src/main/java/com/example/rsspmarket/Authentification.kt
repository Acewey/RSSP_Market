package com.example.rsspmarket

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Authentification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authentification_activity)

    }

    fun partager(view: View) {
        val message = "Je partage avec vous la nouvelle application de RSSP Market : WWW.ENSA.AC.MA"
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type ="text/plain"
        shareIntent.putExtra(Intent.EXTRA_TEXT, message)
        startActivity(Intent.createChooser(shareIntent, "Partager via"))

    }

}