package com.example.applicationfragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAG", "OnViewCreated")
        val tvHello = requireActivity().findViewById<TextView>(R.id.tvHello)
        tvHello.setOnClickListener {
            parentFragmentManager.beginTransaction().add(android.R.id.content, SecondFragment())
                .commit()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("TAG", "OnViewAttached")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAG", "OnViewDEstroyed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "OnPause")
    }
}