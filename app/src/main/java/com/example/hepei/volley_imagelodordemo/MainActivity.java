package com.example.hepei.volley_imagelodordemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private String url = "http://106.14.32.204/eshop/emobile/?url=/home/data";
    private RequestQueue mQueue;
    private MyAdapter adapter;
    private GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mQueue = Volley.newRequestQueue(this);
        gv = (GridView) findViewById(R.id.gridView);
        volleyForJsonRequestGet();
    }


    private void volleyForJsonRequestGet() {
        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Gson gson = new Gson();
                Root root = gson.fromJson(s, Root.class);
                List<Root.Promote_goods> list = root.getData().getPromote_goods();
                for (int i = 0; i < list.size(); i++) {
                    Log.d("12345678", list.get(i).getName());
                }
                adapter = new MyAdapter(MainActivity.this, list);
                gv.setAdapter(adapter);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("TAG", volleyError.getMessage(), volleyError);
            }
        });
        mQueue.add(stringRequest);

    }
}
