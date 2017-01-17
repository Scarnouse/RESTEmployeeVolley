package es.vcarmen.restemployeevolley.Views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import es.vcarmen.restemployeevolley.R;
import es.vcarmen.restemployeevolley.RESTService.RESTDepartment;
import es.vcarmen.restemployeevolley.RESTService.VolleyCallback;
import es.vcarmen.restemployeevolley.models.Department;
import es.vcarmen.restemployeevolley.models.DepartmentAdapter;

/**
 * Created by Lolo on 17/01/2017.
 */

public class TabFragmentDepartment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_fragment_department, container, false);

        final RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        String url = "http://192.168.1.42:3000/departments/";

        RESTDepartment.getDepartments(getContext(), url, null, new VolleyCallback() {
            @Override
            public void onSuccessResponse(String result) {
                List<Department> departments = new ArrayList<Department>();
                try {
                    JSONArray jsonArray = new JSONArray(result);
                    for(int i = 0; i < jsonArray.length(); i++){
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        departments.add(new Department(Integer.parseInt(jsonObject.getString("n_dept")), jsonObject.getString("name_dept")));
                    }

                    DepartmentAdapter departmentAdapter = new DepartmentAdapter(departments);
                    rv.setAdapter(departmentAdapter);

                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
                    rv.setLayoutManager(linearLayoutManager);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        return rootView;
    }
}
