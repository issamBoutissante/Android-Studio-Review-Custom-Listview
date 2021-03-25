package com.test.reviewcustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    String[] names={"omar","salama","rachida","ahfid","chaimae","issam"};
    Integer[] ids={1,2,3,4,5,6};
    LayoutInflater layoutInflater;
    MyAdapter(Context context){
        layoutInflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return names[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View myView=view;
        if(myView==null)
            myView= layoutInflater.inflate(R.layout.list_item,null);
        TextView name,id;
        name=myView.findViewById(R.id.name);
        name.setText(names[i]);
        id=myView.findViewById(R.id.id);
        id.setText(ids[i].toString());
        return myView;
    }
}
