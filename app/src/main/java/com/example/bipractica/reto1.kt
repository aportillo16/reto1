package com.example.bipractica

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bipractica.databinding.Reto1Binding

class reto1 : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: Reto1Binding
    var txtHelloWorld: EditText? = null
    var buttonAccept: Button? = null
    var viewTextResu: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        binding = Reto1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        txtHelloWorld = binding.edText//findViewById(R.id.edText)
        buttonAccept = binding.buttonAceptar//findViewById(R.id.buttonAceptar)
        viewTextResu = binding.titleTextView//findViewById(R.id.titleTextView)

        buttonAccept?.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view!!.id){
            R.id.buttonAceptar->{
                //Toast.makeText(this,"Button 1 is clicked",Toast.LENGTH_SHORT).show()
                viewTextResu?.setText(txtHelloWorld?.text)
                txtHelloWorld?.setText("")
            }
        }
    }
}