package es.vcarmen.restemployeevolley.RESTService;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Lolo on 17/01/2017.
 */

public class VolleySingleton {

    private static VolleySingleton instance;
    private RequestQueue requestQueue;
    private static Context ctxt;

    private VolleySingleton(Context context){
        ctxt = context;
        requestQueue = getRequestQueue();
    }

    public static synchronized VolleySingleton getInstance(Context context){
        if (instance == null)
            instance = new VolleySingleton(context);
        return instance;
    }

    public RequestQueue getRequestQueue(){
        if(requestQueue == null)
            requestQueue = Volley.newRequestQueue(ctxt.getApplicationContext());
        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req){
        getRequestQueue().add(req);
    }
}
