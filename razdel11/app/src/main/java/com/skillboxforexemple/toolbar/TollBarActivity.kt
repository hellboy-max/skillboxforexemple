package com.skillboxforexemple.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import android.widget.Toolbar.OnMenuItemClickListener
import androidx.appcompat.widget.SearchView

import kotlinx.android.synthetic.main.activity_toolbar.*

class MainActivity2 : AppCompatActivity() {

    val users = listOf(
        "User1",
        "User2",
        "UserUnknow"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)
        //supportActionBar?.title = "New title"
        //toolBar.setTitle(R.string.app_name)
        initToolBar()
    }

    private fun initToolBar() {
        toolBar.setNavigationOnClickListener {
            toast("Click Back")
        }

        toolBar.setOnMenuItemClickListener { menuitem ->

            when (menuitem.itemId) {
                R.id.action_1 -> {
                    toast("Clicked on Action 1")
                    true
                }
                R.id.action_2 -> {
                    toast("Clicked on Action 2")
                    true
                }
                else ->
                    false
            }
        }
        val searchItem = toolBar.menu.findItem(R.id.actionSearsh)
        searchItem.setOnActionExpandListener(object: MenuItem.OnActionExpandListener {
            override fun onMenuItemActionExpand(p0: MenuItem?): Boolean {
                expandTextView.text = "Search Expanded"
                return true
            }

            override fun onMenuItemActionCollapse(p0: MenuItem?): Boolean {
                expandTextView.text = "Search Collapse"
                return true
            }

        } )
        (searchItem.actionView as SearchView).setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                users.filter { it.contains(other = newText?: "", ignoreCase = true) }
                    .joinToString()
                    .let {
                        searchResult.text = it
                    }
                return true
            }

        }) // appcompat widget!!!!  так как
           // app:actionViewClass="androidx.appcompat.widget.SearchView" в меню

    }

    private fun toast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

    override fun toString(): String {
        return super<AppCompatActivity>.toString()
    }
}
