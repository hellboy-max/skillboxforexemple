package com.skillboxforexample.viewpagerapp

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.skillboxforexample.viewpagerapp.databinding.ActivityDialogBinding

class DialogActivity : AppCompatActivity(R.layout.activity_dialog) {
    private lateinit var binding: ActivityDialogBinding
    private var dialog: AlertDialog? =
        null // для закрытия диалога вручную при перевороте экрана в onDestroy

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogBinding.bind(findViewById(R.id.generalContainer))
        binding.showSimpleDialogButton.setOnClickListener {
            sowSimpleDialog()
        }
        binding.showButtonDialogButton.setOnClickListener {
            sowDialogsWihButtons()
        }
        binding.showSimpleChoiceDialogButton.setOnClickListener {
            showSimpleChoiceDialog()
        }
        binding.showCustomLayoutDialogButton.setOnClickListener {
            showCustomLayoutDialog()
        }
        binding.showDialogFragment.setOnClickListener {
            showDialogFragment()
        }
        binding.showBottomSheetDialogFragment.setOnClickListener {
            showBottomSheetDialog()
        }
    }

    private fun sowSimpleDialog() {
        val dialog = AlertDialog.Builder(this)
            .setTitle("SimpleDialog")
            .setMessage("SimpleDialogMessage")
            .create() // заполняетосатльные параметры дефолтными значениями и возвращает диалог
        dialog.show() // отображает диалог
    }

    private fun sowDialogsWihButtons() {
        AlertDialog.Builder(this)
            .setTitle("Delete item")
            .setMessage("Are You sure?")
            .setPositiveButton("Yes") { _, _ -> toast("Clicked Yes") } //{dialog,which ->  } заменили так как
            .setNegativeButton("No") { _, _ -> toast("Clicked No") } //для каждой кнопки свой листнер
            .setNeutralButton("Neutral") { _, _ -> toast("Clicked Neutral") }
            .create() // заполняетосатльные параметры дефолтными значениями и возвращает диалог
            .show() // отображает диалог
    }

    private fun showSimpleChoiceDialog() {
        val myProviders = arrayOf("google", "Yandex", "mail", "rambler")
        AlertDialog.Builder(this)
            .setTitle("Select mail providers")
            .setItems(myProviders) { _, which -> toast("Selected = ${myProviders[which]}") }
            //.setMultiChoiceItems() хз надо смотреть пример
            .show() // create можно не писать
    }

    private fun showCustomLayoutDialog() {
        val content = LayoutInflater.from(this).inflate(R.layout.dialog_attention, null).apply {
            findViewById<TextView>(R.id.textView1).text = "Attention text dynamic"
        } // если не нужно ничего менять в верстке то .setView(R.layout.dialog_attention)
        dialog = AlertDialog.Builder(this)
            .setView(content)
            .setPositiveButton("Ok") { _, _ -> }
            .show()
    }
    private fun showDialogFragment() {         // диалоги во фрагментах не скрыаются при перевороте экрана
ConfirmationDialogFragment() // создаем инстанс
    .show(supportFragmentManager,"ConfirmationDialogTag")
    }
    private fun hideDialogFragment() {
        supportFragmentManager.findFragmentByTag("ConfirmationDialogTag")
            ?.let { it as? ConfirmationDialogFragment } // если найденный фрагмент то проеряем  это ConfirmationDialogFragment?
               // если да то безопасно приводим и вызываем скрытие
            ?.dismiss()
    }

    private fun showBottomSheetDialog(){
        AvatarDialogFragment().show(supportFragmentManager,"tag")
    }

    override fun onDestroy() {
        super.onDestroy()
        dialog?.dismiss() // ручное удалние диалога при перевороте экрана
    }

    private fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}