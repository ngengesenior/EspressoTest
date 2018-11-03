package com.apps.ngenge.espressotest

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class KakaoLoginTest{
    val screen = LoginScreen()

    @JvmField @Rule
    var mActivityRule:ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)


    @Test
    fun testLoginSuccess(){
        screen{

            failureTet.isNotDisplayed()

            username.perform {
                typeText("username")
            }

            password.perform {
                typeText("awerd")
            }

            failureTet.isDisplayed()
            failureTet.hasText("Failed to login")
            loginButon.isNotDisplayed()
        }

    }


}