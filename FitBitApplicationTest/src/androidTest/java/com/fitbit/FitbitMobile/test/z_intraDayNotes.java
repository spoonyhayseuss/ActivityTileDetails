package com.fitbit.FitbitMobile.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class z_intraDayNotes extends ActivityInstrumentationTestCase2 {
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
    public z_intraDayNotes() throws ClassNotFoundException {
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
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //Sleep for 2177 milliseconds
		solo.sleep(2177);
        //Click on 6,657 10,000 steps
		solo.clickInList(2, 0);
        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity'
		assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));
        //Sleep for 2113 milliseconds
		solo.sleep(2113);
        //Click on Today 6,657 steps
		solo.clickOnView(solo.getView("date"));
        //Wait for activity: 'com.fitbit.activity.ui.details.ActivityDetailsActivity'
		assertTrue("ActivityDetailsActivity is not found!", solo.waitForActivity("ActivityDetailsActivity"));
        //Sleep for 4263 milliseconds
		solo.sleep(4263);
        //Click on Daily Steps Monday, Aug 17, 2015 No measurements No measurements
		solo.clickOnText(java.util.regex.Pattern.quote("Daily Steps"));
        //Sleep for 536 milliseconds
		solo.sleep(536);
        //Rotate the screen
		solo.setActivityOrientation(Solo.LANDSCAPE);
        //Sleep for 4882 milliseconds
		solo.sleep(4882);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 1));
        //Rotate the screen
		solo.setActivityOrientation(Solo.PORTRAIT);
        //Sleep for 2206 milliseconds
		solo.sleep(2206);
        //Assert that: '6,657 steps' is shown
		assertTrue("'6,657 steps' is not shown!", solo.waitForView(solo.getView("primary_text")));
        //Sleep for 716 milliseconds
		solo.sleep(716);
        //Assert that: '6,657 steps' is shown
		assertTrue("'6,657 steps' is not shown!", solo.waitForView(solo.getView("primary_text")));
        //Assert that: 'Steps' is shown
		assertTrue("'Steps' is not shown!", solo.waitForView(solo.getView("activity_type")));
        //Sleep for 1970 milliseconds
		solo.sleep(1970);
        //Click on Daily Steps Monday, Aug 17, 2015 No measurements No measurements
		solo.clickOnText(java.util.regex.Pattern.quote("Daily Steps"));
        //Rotate the screen
		solo.setActivityOrientation(Solo.LANDSCAPE);
        //Sleep for 1140 milliseconds
		solo.sleep(1140);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 1));
        //Rotate the screen
		solo.setActivityOrientation(Solo.PORTRAIT);
	}
}
