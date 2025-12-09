package com.example.homework_18

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Ex2FirstFragment : Fragment(R.layout.ex2_first_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()
        val toSecondButton: Button = view.findViewById<Button>(R.id.ex2_first_to_second_button)
        val editText: EditText = view.findViewById<EditText>(R.id.ex2_edit_text)

        toSecondButton.setOnClickListener {
            val message = editText.text.toString()
            val action =
                Ex2FirstFragmentDirections.actionEx2FirstFragmentToEx2SecondFragment(message)
            navController.navigate(action)
        }

    }

}