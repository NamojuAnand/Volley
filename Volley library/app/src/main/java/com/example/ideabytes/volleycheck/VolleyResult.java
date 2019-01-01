package com.example.ideabytes.volleycheck;

import org.json.JSONObject;

public interface VolleyResult {

     void Success(JSONObject mjson);
     void failure(String mReason);
}
