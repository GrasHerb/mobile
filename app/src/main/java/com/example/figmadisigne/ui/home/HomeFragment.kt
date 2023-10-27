package com.example.figmadisigne.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.figmadisigne.R
import com.example.figmadisigne.databinding.FragmentHomeBinding
import com.example.figmadisigne.recadapters.FeelRecycler
import com.example.figmadisigne.recadapters.MyFeel
import com.example.figmadisigne.recadapters.MyState
import com.example.figmadisigne.recadapters.StateRecycler

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val feel_recycler : RecyclerView = root.findViewById(R.id.feel_rec)
        feel_recycler.adapter = FeelRecycler(requireContext(),MyFeel().list)

        val state_recycler : RecyclerView = root.findViewById(R.id.state_rec)
        state_recycler.adapter = StateRecycler(requireContext(),MyState().state_list)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}