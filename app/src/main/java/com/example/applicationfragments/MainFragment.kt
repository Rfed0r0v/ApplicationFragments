package com.example.applicationfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val transData = Bundle()

        val btSend = requireActivity().findViewById<Button>(R.id.btSend)
        val etName = requireActivity().findViewById<EditText>(R.id.etName)
        val etSurname = requireActivity().findViewById<EditText>(R.id.etSurname)
        val etEmail = requireActivity().findViewById<EditText>(R.id.etEmail)

        btSend.setOnClickListener {
            transData.putStringArray(
                "data",
                arrayOf(etName.text.toString(), etSurname.text.toString(), etEmail.text.toString())
            )
            val secondFragment = SecondFragment()
            secondFragment.arguments = transData
            // Log.d("444", MainActivity().myFragmentData.name)

            parentFragmentManager.beginTransaction().replace(android.R.id.content, secondFragment)
                .commit()
        }
    }
}