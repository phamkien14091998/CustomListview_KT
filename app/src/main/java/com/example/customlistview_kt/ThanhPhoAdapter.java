package com.example.customlistview_kt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ThanhPhoAdapter extends BaseAdapter {
    private Context ctx;
    private int layout;
    private List<ThanhPho> thanhPhoList;

    public ThanhPhoAdapter(Context ctx, int layout, List<ThanhPho> thanhPhoList) {
        this.ctx = ctx;
        this.layout = layout;
        this.thanhPhoList = thanhPhoList;
    }

    @Override
    public int getCount() {
        return thanhPhoList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        TextView txtTen= view.findViewById(R.id.txtTen);
        TextView txtCity= view.findViewById(R.id.txtCity);
        TextView txtSo= view.findViewById(R.id.txtSo);

        ThanhPho thanhPho= thanhPhoList.get(i);
        txtTen.setText(thanhPho.getTen());
        txtCity.setText(thanhPho.getCity());
       // txtSo.setText(thanhPho.getSo());
        return view;
    }
}
