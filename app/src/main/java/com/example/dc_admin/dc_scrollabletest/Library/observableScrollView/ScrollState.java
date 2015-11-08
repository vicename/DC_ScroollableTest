package com.example.dc_admin.dc_scrollabletest.Library.observableScrollView;

/**
 * Created by DC-ADMIN on 15-11-8.
 */
public enum  ScrollState {
    /**
     * Widget is stopped.
     * This state does not always mean that this widget have never been scrolled.
     */
    STOP,

    /**
     * Widget is scrolled up by swiping it down.
     */
    UP,

    /**
     * Widget is scrolled down by swiping it up.
     */
    DOWN,
}
