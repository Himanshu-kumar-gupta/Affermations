package com.himanshukumargupta.affermations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.himanshukumargupta.affermations.adapter.ItemAdapter
import com.himanshukumargupta.affermations.data.DataSource
import com.himanshukumargupta.affermations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize data
        val dataset = DataSource().loadAffirmations()
        binding.recyclerView.adapter = ItemAdapter(this, dataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        // layout size can change if you show or hide view
        binding.recyclerView.setHasFixedSize(true)
    }
}