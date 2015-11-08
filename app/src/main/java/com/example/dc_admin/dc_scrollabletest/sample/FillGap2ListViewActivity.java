package com.example.dc_admin.dc_scrollabletest.sample;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.dc_admin.dc_scrollabletest.Library.observableScrollView.ObservableListView;
import com.example.dc_admin.dc_scrollabletest.Library.observableScrollView.ObservableScrollViewCallbacks;
import com.example.dc_admin.dc_scrollabletest.R;
//import com.nineoldandroids.view.ViewHelper;

/**
 * Created by DC-ADMIN on 15-11-8.
 */
public class FillGap2ListViewActivity extends FillGap2BaseActivity<ObservableListView> implements ObservableScrollViewCallbacks {
    private Toolbar toolbar;
    private ListView listView;
    String [] listStr={ "green", "pink", "purple", "white", "gray","green", "pink", "purple", "white", "gray","green", "pink", "purple", "white", "gray","green", "pink", "purple", "white", "gray" };
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fillgaplistview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        listView = (ListView) findViewById(R.id.list);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listStr);
        listView.setAdapter(adapter);
    }


    @Override
    protected int getLayoutResId() {
        return R.layout.activity_fillgaplistview;
    }

    @Override
    protected ObservableListView createScrollable() {
        ObservableListView listView = (ObservableListView) findViewById(R.id.scroll);
        listView.setScrollViewCallbacks(this);
//        setDummyDataWithHeader(listView, mFlexibleSpaceImageHeight);
        return listView;
    }
    @Override
    protected void updateViews(int scrollY, boolean animated) {
        super.updateViews(scrollY, animated);

        // Translate list background
//        ViewHelper.setTranslationY(mListBackgroundView, ViewHelper.getTranslationY(mHeader));
        mListBackgroundView.setTranslationY(mHeader.getTranslationY());
    }
}
