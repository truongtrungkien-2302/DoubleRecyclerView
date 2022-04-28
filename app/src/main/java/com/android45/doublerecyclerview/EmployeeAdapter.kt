package com.android45.doublerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class EmployeeAdapter(private val employees: List<Employee>) :
    RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivEmployee: CircleImageView = itemView.findViewById(R.id.ivEmployee)
        val tvNameEmployee: TextView = itemView.findViewById(R.id.tvNameEmployee)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.item_rv_employee, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val employee = employees[position]
        holder.ivEmployee.setImageResource(employee.image)
        holder.tvNameEmployee.text = employee.name
    }

    override fun getItemCount(): Int {
        return employees.size
    }
}