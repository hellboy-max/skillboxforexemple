package com.skillboxforexemple.razdel104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView = findViewById<TextView>(R.id.text_View)
//        textView.text="Привет"
//        textView.setText(R.string.app_name)

        //val text = resources.getString(R.string.text_view)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val nameTextView = findViewById<TextView>(R.id.nameText)
        val clearButton = findViewById<Button>(R.id.clearButton)
        //val progressBar = findViewById<ProgressBar>(R.id.longOperationProgress)
        val makeLongOperationButton = findViewById<Button>(R.id.makeLongLoad)

        clearButton.setOnClickListener {
            nameInput.setText("")
            Toast.makeText(this, R.string.cleared_text, Toast.LENGTH_SHORT).show()
        }

        nameInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                nameTextView.text = p0?.takeIf { it.isNotBlank() }
                    ?.let { name -> resources.getString(R.string.hellow_string, name) }
                clearButton.isEnabled = p0?.isNotEmpty() ?: false
            }
        })
        makeLongOperationButton.setOnClickListener {
            makeLongOperation()
        }
    }

    private fun makeLongOperation() {
        val progressBar = findViewById<ProgressBar>(R.id.longOperationProgress)
        val makeLongOperationButton = findViewById<Button>(R.id.makeLongLoad)

        progressBar.visibility = View.VISIBLE
        makeLongOperationButton.isEnabled = false

        Handler().postDelayed({
            progressBar.visibility = View.GONE
            makeLongOperationButton.isEnabled = true
            Toast.makeText(this, R.string.long_operation_complete, Toast.LENGTH_SHORT).show()
        },2000)

    }
}