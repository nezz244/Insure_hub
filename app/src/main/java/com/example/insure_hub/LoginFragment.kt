package com.example.insure_hub;
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import android.R
import android.widget.Button


// Here ":" symbol is indicate that LoginFragment
// is child class of Fragment Class
class LoginFragment : Fragment() {
    var button: Button = findViewById(R.id.button) as Button


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
                R.layout.layout_login, container, false


                    button.setOnClickListener(){
                Toast.makeText(this,"button 1 clicked", Toast.LENGTH_SHORT).show()
            }
        )
    }
    // Here "layout_login" is a name of layout file
    // created for LoginFragment
}
