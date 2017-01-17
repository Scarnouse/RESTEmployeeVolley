package es.vcarmen.restemployeevolley.RESTService;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONObject;

/**
 * Created by Lolo on 17/01/2017.
 */

public class RESTDepartment {

    private static RequestQueue queue;

    public static void getDepartments(Context context, String url, JSONObject jsonValues, final VolleyCallback callback){
        queue = VolleySingleton.getInstance(context).getRequestQueue();

        StringRequest stringReq = new StringRequest(
                Request.Method.GET,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        callback.onSuccessResponse(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("ERROR", String.valueOf(error));
                    }
                }
        );

        VolleySingleton.getInstance(context).addToRequestQueue(stringReq);
    }
}
