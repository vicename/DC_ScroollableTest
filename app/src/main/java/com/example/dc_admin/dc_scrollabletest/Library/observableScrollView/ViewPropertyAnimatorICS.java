package com.example.dc_admin.dc_scrollabletest.Library.observableScrollView;

import android.animation.Animator;
import android.view.View;
import android.view.animation.Interpolator;

import java.lang.ref.WeakReference;

/**
 * Created by DC-ADMIN on 15-11-8.
 */
public class ViewPropertyAnimatorICS extends ViewPropertyAnimator {
    private final static long RETURN_WHEN_NULL = -1L;

    /**
     * A WeakReference holding the native implementation of ViewPropertyAnimator
     */
    private final WeakReference<android.view.ViewPropertyAnimator> mNative;

    ViewPropertyAnimatorICS(View view) {
        mNative = new WeakReference<android.view.ViewPropertyAnimator>(view.animate());
    }
    @Override
    public ViewPropertyAnimator setDuration(long duration) {
        return null;
    }

    @Override
    public long getDuration() {
        return 0;
    }

    @Override
    public long getStartDelay() {
        return 0;
    }

    @Override
    public ViewPropertyAnimator setStartDelay(long startDelay) {
        return null;
    }

    @Override
    public ViewPropertyAnimator setInterpolator(Interpolator interpolator) {
        return null;
    }

    @Override
    public ViewPropertyAnimator setListener(Animator.AnimatorListener listener) {
        return null;
    }


    @Override
    public void start() {

    }

    @Override
    public void cancel() {

    }

    @Override
    public ViewPropertyAnimator x(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator xBy(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator y(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator yBy(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator rotation(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator rotationBy(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator rotationX(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator rotationXBy(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator rotationY(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator rotationYBy(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator translationX(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator translationXBy(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator translationY(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator translationYBy(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator scaleX(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator scaleXBy(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator scaleY(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator scaleYBy(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator alpha(float value) {
        return null;
    }

    @Override
    public ViewPropertyAnimator alphaBy(float value) {
        return null;
    }
}
