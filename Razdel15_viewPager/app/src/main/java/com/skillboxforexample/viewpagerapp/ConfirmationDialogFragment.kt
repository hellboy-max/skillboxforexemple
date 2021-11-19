package com.skillboxforexample.viewpagerapp

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class ConfirmationDialogFragment: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle("Delete item")
            .setMessage("Are You sure?")
            .setPositiveButton("Yes") { _, _ ->} //{dialog,which ->  } заменили так как
            //.setPositiveButton(requireArguments().getString("key")) { _, _ -> listener.on}
            .setNegativeButton("No") { _, _ ->  } //для каждой кнопки свой листнер
            .setNeutralButton("Neutral") { _, _ -> }
            .create() // заполняетосатльные параметры дефолтными значениями и возвращает диалог
             // отображает диалог
    }
}