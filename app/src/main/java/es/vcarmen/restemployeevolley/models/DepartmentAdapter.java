package es.vcarmen.restemployeevolley.models;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import es.vcarmen.restemployeevolley.R;

/**
 * Created by Lolo on 17/01/2017.
 */

public class DepartmentAdapter  extends RecyclerView.Adapter<DepartmentAdapter.MyViewHolder>{
    private List<Department> departmentList;

    public DepartmentAdapter(List<Department> departmentList){
        this.departmentList = departmentList;
    }

    @Override
    public DepartmentAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cv_department, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DepartmentAdapter.MyViewHolder holder, int position) {
        holder.nDept.setText(String.valueOf(departmentList.get(position).getnDept()));
        holder.nameDept.setText(departmentList.get(position).getNameDept());
    }

    @Override
    public int getItemCount() {
        return departmentList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public CardView cardView;
        public TextView nDept;
        public TextView nameDept;

        public MyViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cv);
            nDept = (TextView) itemView.findViewById(R.id.department_number);
            nameDept = (TextView) itemView.findViewById(R.id.department_name);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
