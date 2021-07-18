package com.hfad.beeradvisor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceSate: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_title, container, false)
        val startButton = view.findViewById<Button>(R.id.start)
        startButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_titleFragment_to_chooseTypeFragment)
        }
        return view
    }
}