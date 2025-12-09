package com.example.homework_18

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController

class Ex3FirstFragment : Fragment(R.layout.ex3_first_fragment) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text: TextView = view.findViewById<TextView>(R.id.ex3_first_header)
        val button: Button = view.findViewById<Button>(R.id.ex3_first_to_second_button)

        setFragmentResultListener("requestKey") { requestKey, bundle ->
            val result = bundle.getString("bundleKey")
            text.text = result
        }

        button.setOnClickListener {
            findNavController().navigate(R.id.action_ex3FirstFrgment_to_ex3SecondFragment)
        }

    }


}