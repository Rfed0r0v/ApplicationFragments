package com.example.applicationfragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btClear = requireActivity().findViewById<Button>(R.id.btClear)
        val etName2 = requireActivity().findViewById<EditText>(R.id.etName2)
        val etSurname2 = requireActivity().findViewById<EditText>(R.id.etSurname2)
        val etEmail2 = requireActivity().findViewById<EditText>(R.id.etEmail2)

        var recieveInfo: Array<String> = arrayOf("00", "01", "02")
        val bundle = arguments
        if (bundle != null) {
            recieveInfo = bundle.getStringArray("data") as Array<String>
        }

        etName2.setText(recieveInfo[0])
        etSurname2.setText(recieveInfo[1])
        etEmail2.setText(recieveInfo[2])

        btClear.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(android.R.id.content, MainFragment())
                .commit()
        }
    }
}
