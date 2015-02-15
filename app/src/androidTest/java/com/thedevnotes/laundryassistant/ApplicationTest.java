package com.thedevnotes.laundryassistant;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertTrue;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(RobolectricTestRunner.class)
@Config(emulateSdk = 18, reportSdk = 18)
public class ApplicationTest {

    @Test
    public void titleIsCorrect() throws Exception {
        Activity activity = Robolectric.setupActivity(LaundryAssistant.class);
        assertTrue(activity.getTitle().toString().equals("LaundryAssistant"));
    }
}