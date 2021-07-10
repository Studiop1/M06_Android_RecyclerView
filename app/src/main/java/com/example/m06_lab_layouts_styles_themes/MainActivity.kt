package com.example.m06_lab_layouts_styles_themes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Whoa!  Did you remember to add that statement to the gradle? Did you then Sync the gradle? (see page 4-17)
//You will need to add the import statement as on page 6-50 too!
//If you don't do these then lots of your code will be grey or red!

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}