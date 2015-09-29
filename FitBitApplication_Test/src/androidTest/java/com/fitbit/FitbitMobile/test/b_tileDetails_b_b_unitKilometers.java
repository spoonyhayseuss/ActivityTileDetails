package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class b_tileDetails_b_b_unitKilometers extends ActivityInstrumentationTestCase2 {
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
    public b_tileDetails_b_b_unitKilometers() throws ClassNotFoundException {
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

        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        solo.sleep(500);
        //Click on Account
        solo.clickInList(4, 2);
        //Wait for activity: 'com.fitbit.settings.ui.ProfileActivity'
        assertTrue("ProfileActivity is not found!", solo.waitForActivity("ProfileActivity"));

        solo.clickOnText(java.util.regex.Pattern.quote("SETTINGS"));


        //Click on Units
        solo.clickOnView(solo.getView("cell_units"));
        //Wait for activity: 'com.fitbit.settings.ui.UnitsPickActivity'
        assertTrue("UnitsPickActivity is not found!", solo.waitForActivity("UnitsPickActivity"));


        //Click on Length
        solo.clickOnView(solo.getView("spn_length"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);

        solo.sleep(500);
        //Click on Feet, Miles
        solo.clickOnView(solo.getView(android.R.id.text1));
        solo.sleep(500);

    }
}
