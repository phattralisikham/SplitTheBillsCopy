package com.example.splitthebills

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

    }
    
//    private val REQUEST_IMAGE_CAPTURE: Int = 101
//    private val mImage: ImageView = findViewById<ImageView>(R.id.photoImageView)

    fun takePicture(view: View) {
        val imageTakeIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if(imageTakeIntent.resolveActivity(packageManager) != null) {
            startActivityForResult(imageTakeIntent, 101)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==101 && resultCode == Activity.RESULT_OK) {
            val extras: Bundle? = data?.extras
            val imageBitMap: Bitmap = extras?.get(data.toString()) as Bitmap
            findViewById<ImageView>(R.id.photoImageView).setImageBitmap(imageBitMap)
        }

    }

}