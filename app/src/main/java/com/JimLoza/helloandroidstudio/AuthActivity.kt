package com.JimLoza.helloandroidstudio

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics


class AuthActivity : AppCompatActivity() {
    val signUpButton = findViewById(R.id.signUpButton) as Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        // Obtain the FirebaseAnalytics instance.

        //Iniciando evento de google analitycs
        val analytics: FirebaseAnalytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message", "Integracion de Firebase completa")
        analytics.logEvent("InitScreen", bundle)


        //setup
        setup()
    }

    private fun setup(){
        title = "Autenticación"
        signUpButton.setOnClickListener {
            
        }
    }


}