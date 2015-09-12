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
        mainTextView = (TextView) mainActivityTest.findViewById(R.id.hello_world);
    }

    public void testPreconditions() {
        assertNotNull("mainActivityTest is null", mainActivityTest);
        assertNotNull("mainTextView is null", mainActivityTest);
    }

    public void testMyFirstTestTextView_labelText() {
        final String expected =
                mainActivityTest.getString(R.string.hello_world);
        final String actual = mainTextView.getText().toString();
        assertEquals(expected, actual);
    }

}