package com.malkinfo.navigationdrawar

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class Opencam : AppCompatActivity() {
    private lateinit var cameraBtn:Button
    private lateinit var myImage:ImageView
    private val cameraRequestId  = 1222

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_profile)
        cameraBtn = findViewById(R.id.openCameraBtn)
        myImage = findViewById(R.id.myImage)
        /**get Permission*/
        if (ContextCompat.checkSelfPermission(
                applicationContext,Manifest.permission.CAMERA
            )== PackageManager.PERMISSION_DENIED)
            ActivityCompat.requestPermissions(
                this, arrayOf(Manifest.permission.CAMERA),
                cameraRequestId
            )
        /**set camera Open*/
        cameraBtn.setOnClickListener {
            val cameraInt = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraInt,cameraRequestId)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == cameraRequestId){
            /**save to Image In layout*/
            val images:Bitmap = data?.extras?.get("data") as Bitmap
            myImage.setImageBitmap(images)
        }
    }
    /** ok now run it*/

}