package com.example.mvptest3;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Lenovo on 2018/5/8.
 */

public class RecAdapter extends BaseQuickAdapter<Bean,BaseViewHolder> {

    public RecAdapter(int layoutResId, @Nullable List<Bean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Bean item) {
//        Picasso.with(mContext).load(item.getContent()).into((ImageView) helper.getView(R.id.mtext));
        Glide.with(mContext).load(item.getContent()).crossFade().into((ImageView) helper.getView(R.id.mtext));


//        helper.setImageBitmap(R.id.mtext,)
    }
}
