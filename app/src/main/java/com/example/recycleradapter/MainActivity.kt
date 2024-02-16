package com.example.recycleradapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity(), RecyclerClickInterface {

    lateinit var layoutManager : LinearLayoutManager
    lateinit var gridManager: GridLayoutManager
    lateinit var manager: StaggeredGridLayoutManager
    lateinit var adapter : RecyclerAdapter
    lateinit var recyclerView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        adapter = RecyclerAdapter(this)
        layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        gridManager = GridLayoutManager(this, 2)
        manager = StaggeredGridLayoutManager(2, 1)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    override fun onItemClick() {
        Toast.makeText(this, "item clicked", Toast.LENGTH_SHORT).show()
    }
}