package com.example.homework_18

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Ex1HomeFragment : Fragment(R.layout.ex1_home_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toDetailsButton: Button = view.findViewById<Button>(R.id.ex1_home_to_details_button)
        toDetailsButton.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.action_ex1HomeFragment_to_ex1DetailsFragment)
        }

    }

}