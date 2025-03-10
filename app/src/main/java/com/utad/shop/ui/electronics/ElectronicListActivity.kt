package com.utad.shop.ui.electronics

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.utad.films.databinding.ActivityElectronicListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ElectronicListActivity: AppCompatActivity() {
    private lateinit var binding: ActivityElectronicListBinding
    private val viewModel: ElectronicViewModel by viewModels()
    private lateinit var adapter: ElectronicAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityElectronicListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        observeViewModel()
        setupSwipeToRefresh()
    }

    private fun setupRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }

    private fun observeViewModel() {

    }

    private fun setupSwipeToRefresh() {
        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.fetchElectronicList()
        }
    }
}
