package com.example.slyfawkes.nasa_api_fun;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivityTest;
    private TextView mainTextView;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivityTest = getActivity();
        mainTextView = (TextView) mainActivityTest.findViewById(R.id.action_settings);
    }
}