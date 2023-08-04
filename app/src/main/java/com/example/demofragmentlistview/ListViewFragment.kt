package com.example.demofragmentlistview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.demofragmentlistview.databinding.FragmentListViewBinding

class ListViewFragment : Fragment() {

    private lateinit var binding: FragmentListViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListViewBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = arrayListOf<String>(
            "Govind Gupta",
            "Om Gupta",
            "Ajay Gupta",
            "Krishna Gupta",
            "Arun Gupta",
            "Ansh Gupta",
            "Anand Gupta"
        )

        val adapter = ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1,list)
        binding.listView.adapter = adapter

    }

}