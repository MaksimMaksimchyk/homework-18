package com.example.homework_18

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Ex1SettingsFragment : Fragment(R.layout.ex1_settings_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toDetailsButton: Button = view.findViewById<Button>(R.id.ex1_settings_to_details_button)
        toDetailsButton.setOnClickListener {
            val navController = findNavController()
            navController.popBackStack()
        }

    }

}