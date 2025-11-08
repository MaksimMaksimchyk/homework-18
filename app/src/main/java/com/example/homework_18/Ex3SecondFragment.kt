package com.example.homework_18

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController

class Ex3SecondFragment : Fragment(R.layout.ex3_second_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editText: EditText = view.findViewById<EditText>(R.id.ex3_edit_text)
        val button: Button = view.findViewById<Button>(R.id.ex3_save_button)

        button.setOnClickListener {
            val result = editText.text.toString().trim()
            setFragmentResult("requestKey", bundleOf("bundleKey" to result))
            findNavController().popBackStack()
        }
    }

}