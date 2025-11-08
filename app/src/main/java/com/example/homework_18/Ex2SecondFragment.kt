package com.example.homework_18

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class Ex2SecondFragment : Fragment(R.layout.ex2_second_fragment) {

    private val args: Ex2SecondFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text: TextView = view.findViewById<TextView>(R.id.ex2_second_string)

        text.text = args.inputText

    }

}