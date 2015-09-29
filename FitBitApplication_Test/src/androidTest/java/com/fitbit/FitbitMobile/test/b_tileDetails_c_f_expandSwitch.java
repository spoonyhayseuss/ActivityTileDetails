package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class b_tileDetails_c_f_expandSwitch extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public b_tileDetails_c_f_expandSwitch() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation());
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }

    public void testRun() {
        //Wait for activity: 'com.fitbit.onboarding.landing.LandingActivity_'
        solo.waitForActivity("LandingActivity_", 500);
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
        assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //Sleep
        solo.sleep(500);

        //Click on steps
        solo.clickOnText(java.util.regex.Pattern.quote("calories burned"));

        solo.takeScreenshot("b_tileDetails_a_a_steps_b_tapTile");
        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity_'
        assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));
        //Sleep
        solo.sleep(500);

        solo.clickOnView(solo.getView("chart_wrapper"));

        //Wait for activity: 'com.fitbit.activity.ui.charts.ActivityChartActivity'
        assertTrue("ActivityChartActivity is not found!", solo.waitForActivity("ActivityChartActivity"));


        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));
        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));
        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));
        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));
        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));
        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));
        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));
        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));
        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));
        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));
        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));
        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));
        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));



        solo.sleep(500);

        solo.clickOnView(solo.getView("btn_shrink"));


    }
}
