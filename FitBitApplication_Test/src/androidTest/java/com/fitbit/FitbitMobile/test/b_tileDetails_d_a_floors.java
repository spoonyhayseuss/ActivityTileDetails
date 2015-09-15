package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class b_tileDetails_d_a_floors extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity_";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public b_tileDetails_d_a_floors() throws ClassNotFoundException {
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

        //Click on floors
		solo.clickOnText(java.util.regex.Pattern.quote("floors"));
		solo.takeScreenshot("b_tileDetails_d_a_floors_b_tapTile");
        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity_'
		assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));

		solo.clickOnText(java.util.regex.Pattern.quote("Floors"));
		solo.clickOnText(java.util.regex.Pattern.quote("THIS WEEK"));
		solo.clickOnText(java.util.regex.Pattern.quote("floors"));

	}
}
