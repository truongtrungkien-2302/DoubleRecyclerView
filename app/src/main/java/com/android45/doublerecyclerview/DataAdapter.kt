package com.android45.doublerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(private val datas: List<Data>) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {
    private val viewPool = RecyclerView.RecycledViewPool()

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitleRvData: TextView = itemView.findViewById(R.id.tvTitleRvData)
        val rvEmployee: RecyclerView = itemView.findViewById(R.id.rvEmployee)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_data, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = datas[position]
        holder.tvTitleRvData.text = data.title
        holder.rvEmployee.apply {
            layoutManager = LinearLayoutManager(holder.rvEmployee.context, RecyclerView.VERTICAL,false)
            adapter = EmployeeAdapter(data.employee)
//            recycledViewPool = viewPool
        }
    }

    override fun getItemCount(): Int {
        return datas.size
    }
}