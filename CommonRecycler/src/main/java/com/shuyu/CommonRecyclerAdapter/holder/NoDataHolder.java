package com.shuyu.CommonRecyclerAdapter.holder;

import android.content.Context;
import android.view.View;

import com.shuyu.CommonRecyclerAdapter.RecyclerBaseHolder;
import com.shuyu.CommonRecyclerAdapter.model.RecyclerBaseModel;

/**
 * Created by shuyu on 2016/11/23.
 * 没有数据
 */

public class NoDataHolder extends RecyclerBaseHolder {

    public NoDataHolder(Context context, View v) {
        super(context, v);
    }

    @Override
    public void createView(View v) {

    }

    @Override
    public void onBind(RecyclerBaseModel model, int position) {

    }

}
