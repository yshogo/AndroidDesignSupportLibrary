package com.example.shogoyamada.androiddesignsupportlibrary.Activitys;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.shogoyamada.androiddesignsupportlibrary.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by shogo.yamada on 2017/07/05.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivity = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void transitionTest(){
        onView(withId(R.id.navigation_view)).perform(click());
        onView(withText("なゔぃげーしょんてすと")).check(matches(isDisplayed()));
        pressBack();
        onView(withId(R.id.tab_layout)).perform(click());
        pressBack();
        onView(withId(R.id.navigation_view)).perform(click());
        pressBack();
        onView(withText("Android Design Support Library 練習"));
    }

}