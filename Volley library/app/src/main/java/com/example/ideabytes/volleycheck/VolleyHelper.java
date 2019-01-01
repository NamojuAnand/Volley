package com.example.ideabytes.volleycheck;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class VolleyHelper {

Context mcontext;
    private RequestQueue mRequestQueue;
   public  VolleyHelper(Context mcontext){
        this.mcontext= mcontext;
    }


    public void getMethod(String url, final VolleyResult mresult) {
        mRequestQueue = Volley.newRequestQueue(mcontext);
        JsonObjectRequest mRequest = new JsonObjectRequest(Request.Method.GET, url,null,new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                    mresult.Success(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mresult.failure(error.toString());
            }
        });

        mRequestQueue.add(mRequest);

//        JsonObjectRequest getRequest = new JsonObjectRequest(Request.Method.GET, url, null,
//                new Response.Listener<JSONObject>()
//                {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        // display response
//                        Log.d("Response", response.toString());
//                    }
//                },
//                new Response.ErrorListener()
//                {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Log.d("Error.Response", response);
//                    }
//                }
//        );
    }


}
