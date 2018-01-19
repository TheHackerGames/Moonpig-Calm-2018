package com.moonpig.EMDR;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by TGP on 18/01/2018.
 */

public class OnboardingFragment3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle s) {

        return inflater.inflate(
                R.layout.onboarding_screen3,
                container,
                false
        );

    }
}
