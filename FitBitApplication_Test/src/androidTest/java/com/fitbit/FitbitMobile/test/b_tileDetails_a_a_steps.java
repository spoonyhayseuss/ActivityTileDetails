package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class b_tileDetails_a_a_steps extends ActivityInstrumentationTestCase2 {
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
    public b_tileDetails_a_a_steps() throws ClassNotFoundException {
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
        /*//Wait for activity: 'com.fitbit.onboarding.landing.LandingActivity_'
		solo.waitForActivity("LandingActivity_", 500);
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //Sleep
		solo.sleep(500);
		solo.takeScreenshot("b_tileDetails_a_a_steps_a_dash");
        //Click on steps
		solo.clickOnText(java.util.regex.Pattern.quote("steps"));

		solo.takeScreenshot("b_tileDetails_a_a_steps_b_tapTile");
        //Wait for activity: 'com.fitbit.activity.ui.landing.ActivityLandingActivity_'
		assertTrue("ActivityLandingActivity is not found!", solo.waitForActivity("ActivityLandingActivity"));
        //Sleep
		solo.sleep(500);
		solo.takeScreenshot("b_tileDetails_a_a_steps_c_stepsMain");
        //Click on Empty Text View
		solo.clickOnView(solo.getView("chart_wrapper"));
        //Wait for activity: 'com.fitbit.activity.ui.charts.ActivityChartActivity_'
		//assertTrue("ActivityChartActivity_ is not found!", solo.waitForActivity("ActivityChartActivity_"));

		//Wait for activity: 'com.fitbit.activity.ui.charts.ActivityChartActivity'
		assertTrue("ActivityChartActivity is not found!", solo.waitForActivity("ActivityChartActivity"));

        //Sleep for x milliseconds
		solo.sleep(500);
		solo.takeScreenshot("b_tileDetails_a_a_steps_d_expand");
		//Click on 1 WEEK
		solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));

		solo.sleep(1000);
		solo.takeScreenshot("b_tileDetails_b_a_distance_d_1week");
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.RIGHT);
		solo.scrollToSide(Solo.RIGHT);
		//Click on 1 MONTH
		solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));
		solo.sleep(1000);
		solo.takeScreenshot("b_tileDetails_b_a_distance_e_1month");
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.RIGHT);
		solo.scrollToSide(Solo.RIGHT);
		//Click on 3 MONTH
		solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));
		//Sleep for x milliseconds
		solo.sleep(2500);

		solo.takeScreenshot("b_tileDetails_b_a_distance_f_3month");
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.RIGHT);
		solo.scrollToSide(Solo.RIGHT);
		//Click on 1 YEAR
		solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));

        //Sleep for x milliseconds
		solo.sleep(500);
		solo.takeScreenshot("b_tileDetails_a_a_steps_h_1year");
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.RIGHT);
		solo.scrollToSide(Solo.RIGHT);
        //Click on ImageView
		solo.clickOnView(solo.getView("btn_shrink"));
        //Sleep for x milliseconds
		solo.sleep(500);
		solo.takeScreenshot("b_tileDetails_a_a_steps_i_shrink");

		//solo.clickLongOnText(java.util.regex.Pattern.quote("Try hitting 10,000"));

		solo.sleep(500);

		solo.scrollDown();
		solo.scrollDown();
		solo.scrollDown();
		solo.scrollUp();
		solo.scrollUp();

        //Click on Today
		solo.clickOnText(java.util.regex.Pattern.quote("May 30"));
        //Wait for activity: 'com.fitbit.activity.ui.charts.IntradayActivity_'
		//assertTrue("IntradayActivity is not found!", solo.waitForActivity("IntradayActivity"));
        //Sleep for x milliseconds
		solo.sleep(500);
		solo.takeScreenshot("b_tileDetails_a_a_steps_j_intraDay");
        //Click expand
		solo.clickOnText(java.util.regex.Pattern.quote("Daily Steps"));
        //Rotate the screen
		solo.setActivityOrientation(Solo.LANDSCAPE);
        //Sleep for x milliseconds
		solo.sleep(500);
		solo.takeScreenshot("b_tileDetails_a_a_steps_k_intraDayExpanded");
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.LEFT);
		solo.scrollToSide(Solo.RIGHT);
		solo.scrollToSide(Solo.RIGHT);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 1));
        //Rotate the screen
		solo.setActivityOrientation(Solo.PORTRAIT);
        //Sleep for x milliseconds
		solo.sleep(500);
		solo.takeScreenshot("b_tileDetails_a_a_steps_l_intraDayshrink");
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 1));
        //Sleep for x milliseconds
		solo.sleep(500);
		solo.takeScreenshot("b_tileDetails_a_a_steps_m_backToSteps");
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
		solo.sleep(500);*/
	}
}
