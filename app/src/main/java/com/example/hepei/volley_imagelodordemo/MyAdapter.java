package com.example.hepei.volley_imagelodordemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;


/**
 * Created by hepei on 2016/12/26.
 */

public class MyAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<Root.Promote_goods> good;

    public MyAdapter(Context context, List<Root.Promote_goods> list) {
        good = list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return good.size();
    }

    @Override
    public Object getItem(int position) {
        return good.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HoldView holdView = null;
        if (convertView == null) {
            holdView = new HoldView();
            convertView = inflater.inflate(R.layout.news_list, null);
            holdView.img = (ImageView) convertView.findViewById(R.id.img);
            holdView.type = (TextView) convertView.findViewById(R.id.type);
            holdView.price = (TextView) convertView.findViewById(R.id.price);
            convertView.setTag(holdView);
        } else {
            holdView = (HoldView) convertView.getTag();
        }
        String image = good.get(position).getImg().getThumb();
        holdView.type.setText(good.get(position).getName());
        holdView.price.setText(good.get(position).getShop_price());
        DisplayImageOptions optionss = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.drawable.ic_launcher).showImageOnFail(R.drawable.ic_launcher)
                .cacheInMemory(true).cacheOnDisk(true).bitmapConfig(Bitmap.Config.RGB_565).build();

        ImageLoader.getInstance().displayImage(image, holdView.img, optionss);
        return convertView;
    }

    class HoldView {
        public ImageView img;
        public TextView type;
        public TextView price;

//        public HoldView(View view) {
//            img = (ImageView) view.findViewById(R.id.img);
//            type = (TextView) view.findViewById(R.id.type);
//            price = (TextView) view.findViewById(R.id.price);
//        }
    }
}
