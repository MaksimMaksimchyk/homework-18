package com.example.homework_18

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Ex1DetailsFragment : Fragment(R.layout.ex1_details_fragment) {
    var counter = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val toSettingsButton: Button =
            view.findViewById<Button>(R.id.ex1_details_to_settings_button)
        toSettingsButton.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.action_ex1DetailsFragment_to_ex1SettingsFragment)
        }

        val toHomeButton: Button = view.findViewById<Button>(R.id.ex1_details_to_home_button)
        toHomeButton.setOnClickListener {
            val navController = findNavController()
            navController.popBackStack()
        }

        val countButton: Button = view.findViewById<Button>(R.id.ex1_details_count_button)
        val countText: TextView = view.findViewById<TextView>(R.id.ex1_counter_text)
        countButton.setOnClickListener {
            counter++
            countText.text = counter.toString()
        }

    }

    override fun onResume() {
        super.onResume()
        val countText: TextView? = view?.findViewById<TextView>(R.id.ex1_counter_text)
        countText?.text = counter.toString()

    }
}