package com.android.hq.ganktoutiao.ui.fragment;

import com.android.hq.ganktoutiao.data.GankType;

/**
 * Created by heqiang on 16-10-11.
 */
public class GankAppFragment extends GankListFragment {
    @Override
    public String getType() {
        return GankType.TYPE_APP;
    }
}
