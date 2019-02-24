package com.example.android.designpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.android.designpattern.kotlin.builder.User
import com.example.android.designpattern.kotlin.builder.User.Builder
import java.util.*

class MainActivity : AppCompatActivity() {
    val TAG = javaClass.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Use Builder Pattern
        val user: User = User.Builder().setId(1).setEmail("nhankv@gmail.com").setName("nhankv")
            .setBirthday(Calendar.getInstance().time).setHeight(176).setWeight(60).builder()
        Log.e(
            TAG, "Id: ${user.builder.id}" +
                    " Email: ${user.builder.email}" +
                    " Name: ${user.builder.name}" +
                    " Birthday: ${user.builder.birthday}" +
                    " Height: ${user.builder.height}" +
                    " Weight: ${user.builder.weight}"
        )
    }
}
