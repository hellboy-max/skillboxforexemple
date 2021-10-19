package com.skillboxforexemple.razdel13_2_intent

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.launch
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    val permission = registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
        when {
            granted -> {
                camera.launch() // доступ к камере разрешен, открываем камеру
            }
            !shouldShowRequestPermissionRationale(Manifest.permission.CAMERA) -> {
                // доступ к камере запрещен, пользователь поставил галочку Don't ask again.
            }
            else -> {
                // доступ к камере запрещен
            }
        }
    }

    private val camera = registerForActivityResult(ActivityResultContracts.TakePicturePreview()) { bitmap ->
        bitmap ?: toast("Photo capture was canceled")
        resultPhotoImageView.setImageBitmap(bitmap)
    // используем bitmap
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("LifeCycleTest", "MainActivity|onCreate|${hashCode()}")

        takePhotoButton.setOnClickListener {
            dispatchTakePictureIntent()
        }

        startExplicitButton.setOnClickListener {
            val messageText = messageEditText.text.toString()
            val activityClass = SecondActivity::class.java
            startActivity(SecondActivity.getIntent(this, messageText))
        }

        sendEmailButton.setOnClickListener {
            dispatchEmailAddress()
        }

    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        if (requestCode == PHOTO_REQUEST_CODE) {
//            if (resultCode == Activity.RESULT_OK) {
//             val previewBitmap = data?.getParcelableExtra("data") as? Bitmap
//                resultPhotoImageView.setImageBitmap(previewBitmap)
//            }
//            else {
//                toast("Photo capture was canceled")
//            }
//        }
//            else {
//            super.onActivityResult(requestCode, resultCode, data)
//            }
//
//    }

    private fun dispatchEmailAddress() {
        val emailAddress = emailAddressEditText.text.toString()
        val emailSubject = subjectEditText.text.toString()
        val isEmailValid = Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches()

        if (!isEmailValid) {
            toast("Enter valid email address")
        } else {
            val intentEmail = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:") // only email apps should handle this
                putExtra(Intent.EXTRA_EMAIL, arrayOf(emailAddress))
                putExtra(Intent.EXTRA_SUBJECT, emailSubject)
            }
            if (intentEmail.resolveActivity(packageManager) != null) {
                startActivity(intentEmail)
            } else toast("No component to handle intent")

        }
    }
    @SuppressLint("QueryPermissionsNeeded")
    private fun dispatchTakePictureIntent() {

        val isCameraPremissionGranted = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED
        if (!isCameraPremissionGranted){
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA),12)
        } else {
            permission.launch(Manifest.permission.CAMERA)
//            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            cameraIntent.resolveActivity(packageManager).also {
//                startActivityForResult(cameraIntent, PHOTO_REQUEST_CODE)
//            }
        }
    }


    private fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycleTest", "MainActivity|onStart|${hashCode()}")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycleTest", "MainActivity|onResume|${hashCode()}")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycleTest", "MainActivity|onPause|${hashCode()}")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycleTest", "MainActivity|onStop|${hashCode()}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycleTest", "MainActivity|onDestroy|${hashCode()}")
    }

    companion object {
        const val PHOTO_REQUEST_CODE = 123
    }
}