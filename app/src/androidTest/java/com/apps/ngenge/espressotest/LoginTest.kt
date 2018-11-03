package com.apps.ngenge.espressotest


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule


import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class LoginTest{
    @JvmField
   @Rule
   var mActivityRule:ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java,true)

    @Test fun test_Login_HasPasswordOfMoreThan6Letters()
    {
        onView(withId(R.id.username))
                .perform(typeText("ngengesenior"))

        onView(withId(R.id.password))
                .perform(typeText("password"))

        onView(withId(R.id.buttonLogin))
                .check(matches(isDisplayed()))
                .perform(click())

        onView(withId(R.id.appIcon))
                .check(matches(isDisplayed()))

    }


}