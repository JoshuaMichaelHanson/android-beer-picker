package com.hfad.beeradvisor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * A simple [Fragment] subclass.
 * Use the [BeersFragment] factory method to
 * create an instance of this fragment.
 */
class BeersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_beers, container, false)
        val beerType = BeersFragmentArgs.fromBundle(requireArguments()).beerType
        val beers = view.findViewById<TextView>(R.id.beers)
        beers.text = getBeers(beerType).reduce {
            str, item -> str + '\n' + item
        }

        return view
    }

    fun getBeers(color: String): List<String> {
        return when (color) {
            "Light" -> listOf("Jail Pale Ale", "Lager Lite")
            "Amber" -> listOf("Jack Amber", "Red Moose")
            "Brown" -> listOf("Brown Bear Beer", "Bock Brownie")
            else -> listOf("Gout Stout", "Dark Daniel")
        }
    }

}