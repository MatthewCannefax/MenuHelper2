package com.dumbapp.menuhelper2.main

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dumbapp.menuhelper2.R
import com.dumbapp.menuhelper2.databinding.FragmentMainBinding
import com.dumbapp.menuhelper2.model.Recipe

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: RecipeListAdapter
    private lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = MainViewModel()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        initFilterText()
    }

    private fun initRecyclerView() {
        adapter = RecipeListAdapter(this::handleItemClick)
        val divider = DividerItemDecoration(context, LinearLayoutManager.VERTICAL)

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(context)

        divider.setDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.recipe_divider)!!)
        binding.recyclerView.addItemDecoration(divider)

        adapter.submitList(viewModel.recipes)
    }

    private fun initFilterText() {
        binding.filterText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun afterTextChanged(p0: Editable?) {
                val enteredText = p0.toString()
                val filteredRecipes = viewModel.recipes
                    .asSequence()
                    .filter { it.name.contains(enteredText, true) ||
                    it.category.contains(enteredText, true) ||
                    it.directions.contains(enteredText, true) }
                adapter.submitList(filteredRecipes.toList())
            }
        })
    }

    private fun handleItemClick(recipe: Recipe) {
        Toast.makeText(requireContext(), recipe.name, Toast.LENGTH_LONG).show()
    }

}