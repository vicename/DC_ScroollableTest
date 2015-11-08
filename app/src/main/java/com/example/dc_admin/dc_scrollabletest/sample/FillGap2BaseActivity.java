package com.example.dc_admin.dc_scrollabletest.sample;

import com.example.dc_admin.dc_scrollabletest.Library.observableScrollView.ScrollUtils;
import com.example.dc_admin.dc_scrollabletest.Library.observableScrollView.Scrollable;

/**
 * Created by DC-ADMIN on 15-11-8.
 */
public abstract class FillGap2BaseActivity <S extends Scrollable> extends FillGapBaseActivity<S>{
    protected float getHeaderTranlationY(int scrollY) {
        return ScrollUtils.getFloat(-scrollY + mFlexibleSpaceImageHeight - mHeaderBar.getHeight(), 0, Float.MAX_VALUE);
    }
}
