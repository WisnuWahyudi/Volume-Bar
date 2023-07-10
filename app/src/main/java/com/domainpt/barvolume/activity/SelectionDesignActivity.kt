package com.domainpt.barvolume.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.domainpt.barvolume.MainActivity
import com.domainpt.barvolume.R

class SelectionDesignActivity : AppCompatActivity() {

    private lateinit var imgXML: ImageView
    private lateinit var imgJetpack: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection_design)

        imgXML = findViewById(R.id.imgDesignXML)
        imgJetpack = findViewById(R.id.img_jetpackcompose)

        imgXML.setOnClickListener {
            startActivity(Intent(this@SelectionDesignActivity, BarVolumeActivity::class.java))
        }

        imgJetpack.setOnClickListener {
            startActivity(Intent(this@SelectionDesignActivity,MainActivity::class.java))
        }

    }
}