package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class b_tileDetails_f_a_tileStressTest extends ActivityInstrumentationTestCase2 {
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
    public b_tileDetails_f_a_tileStressTest() throws ClassNotFoundException {
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
        solo.waitForActivity("LandingActivity_", 2000);
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
        assertTrue("HomeActivity is not found!", solo.waitForActivity("HomeActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);

        ///////Steps

        //Click on steps
        solo.clickOnText(java.util.regex.Pattern.quote("steps"));

        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity'
        assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);

        //Click on Empty Text View
        solo.clickOnView(solo.getView("chart_wrapper"));
        //Wait for activity: 'com.fitbit.activity.ui.charts.ActivityChartActivity_'
        assertTrue("ActivityChartActivity is not found!", solo.waitForActivity("ActivityChartActivity"));



        //Click on 1 YEAR
        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.goBack();
        solo.goBack();
        solo.sleep(1000);
        //Click on steps
        solo.clickOnText(java.util.regex.Pattern.quote("steps"));

        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity'
        assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);

        //Click on Empty Text View
        solo.clickOnView(solo.getView("chart_wrapper"));
        //Wait for activity: 'com.fitbit.activity.ui.charts.ActivityChartActivity_'
        assertTrue("ActivityChartActivity is not found!", solo.waitForActivity("ActivityChartActivity"));



        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.goBack();
        solo.goBack();

        /////////distance
        solo.sleep(1000);
        //Click on distance
        solo.clickOnText(java.util.regex.Pattern.quote("mile"));

        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity'
        assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);

        //Click on Empty Text View
        solo.clickOnView(solo.getView("chart_wrapper"));
        //Wait for activity: 'com.fitbit.activity.ui.charts.ActivityChartActivity'
        assertTrue("ActivityChartActivity is not found!", solo.waitForActivity("ActivityChartActivity"));



        //Click on 1 YEAR
        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.goBack();
        solo.goBack();
        solo.sleep(1000);

        //Click on distance
        solo.clickOnText(java.util.regex.Pattern.quote("mile"));

        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity'
        assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);

        //Click on Empty Text View
        solo.clickOnView(solo.getView("chart_wrapper"));
        //Wait for activity: 'com.fitbit.activity.ui.charts.ActivityChartActivity_'
        assertTrue("ActivityChartActivity is not found!", solo.waitForActivity("ActivityChartActivity"));


        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.goBack();
        solo.goBack();


        /////////calories
        solo.sleep(1000);
        //Click on distance
        solo.clickOnText(java.util.regex.Pattern.quote("calories burned"));

        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity'
        assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);

        //Click on Empty Text View
        solo.clickOnView(solo.getView("chart_wrapper"));
        //Wait for activity: 'com.fitbit.activity.ui.charts.ActivityChartActivity_'
        assertTrue("ActivityChartActivity is not found!", solo.waitForActivity("ActivityChartActivity"));



        //Click on 1 YEAR
        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.goBack();
        solo.goBack();
        solo.sleep(1000);

        //Click on steps
        solo.clickOnText(java.util.regex.Pattern.quote("calories burned"));

        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity'
        assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);

        //Click on Empty Text View
        solo.clickOnView(solo.getView("chart_wrapper"));
        //Wait for activity: 'com.fitbit.activity.ui.charts.ActivityChartActivity_'
        assertTrue("ActivityChartActivity is not found!", solo.waitForActivity("ActivityChartActivity"));


        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.goBack();
        solo.goBack();


        /////////floors
        solo.sleep(1000);

        //Click on distance
        solo.clickOnText(java.util.regex.Pattern.quote("floors"));

        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity'
        assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);

        //Click on Empty Text View
        solo.clickOnView(solo.getView("chart_wrapper"));
        //Wait for activity: 'com.fitbit.activity.ui.charts.ActivityChartActivity_'
        assertTrue("ActivityChartActivity is not found!", solo.waitForActivity("ActivityChartActivity"));



        //Click on 1 YEAR
        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.goBack();
        solo.goBack();
        solo.sleep(1000);

        //Click on steps
        solo.clickOnText(java.util.regex.Pattern.quote("floors"));

        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity'
        assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);

        //Click on Empty Text View
        solo.clickOnView(solo.getView("chart_wrapper"));
        //Wait for activity: 'com.fitbit.activity.ui.charts.ActivityChartActivity_'
        assertTrue("ActivityChartActivity is not found!", solo.waitForActivity("ActivityChartActivity"));


        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.goBack();
        solo.goBack();
        solo.sleep(1000);

        /////////active minutes

        //Click on distance
        solo.clickOnText(java.util.regex.Pattern.quote("active minutes"));

        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity'
        assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);

        //Click on Empty Text View
        solo.clickOnView(solo.getView("chart_wrapper"));
        //Wait for activity: 'com.fitbit.activity.ui.charts.ActivityChartActivity_'
        assertTrue("ActivityChartActivity is not found!", solo.waitForActivity("ActivityChartActivity"));



        //Click on 1 YEAR
        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.goBack();
        solo.goBack();
        solo.sleep(1000);

        //Click on steps
        solo.clickOnText(java.util.regex.Pattern.quote("active minutes"));

        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity'
        assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);

        //Click on Empty Text View
        solo.clickOnView(solo.getView("chart_wrapper"));
        //Wait for activity: 'com.fitbit.activity.ui.charts.ActivityChartActivity_'
        assertTrue("ActivityChartActivity is not found!", solo.waitForActivity("ActivityChartActivity"));


        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        solo.goBack();
        solo.goBack();

    }
}
