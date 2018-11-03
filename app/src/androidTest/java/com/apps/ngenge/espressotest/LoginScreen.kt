package com.apps.ngenge.espressotest

import androidx.test.espresso.matcher.ViewMatchers.withHint
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.agoda.kakao.KButton
import com.agoda.kakao.KEditText
import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen

class LoginScreen: Screen<LoginScreen>() {
    val username = KEditText{
        withId(R.id.username)


    }

    val password = KEditText{
        withId(R.id.password)
    }

    val loginButon = KButton{
        withId(R.id.buttonLogin)
    }

    val failureTet = KTextView{
        withId(R.id.loginFailure)
    }

}