package com.example.ryan.passoword_validator;


import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)

public class MainActivityTest {

    @Rule public final ActivityTestRule<MainActivity> main = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void hasUpperCase() {
        //Add String to text field
        onView(withId(R.id.edtPassword)).perform(typeText("nouppercase12"));
        //click validate
        onView(withId(R.id.btnValidate)).perform(click());
        //Check if text is correct
        onView(withId(R.id.textView)).check(matches(withText("Invalid, please make a better password")));

    }

    @Test
    public void hasLowerCase() {
        //Add String to text field
        onView(withId(R.id.edtPassword)).perform(typeText("NOLOWERCASE12"));
        //click validate
        onView(withId(R.id.btnValidate)).perform(click());
        //Check if text is correct
        onView(withId(R.id.textView)).check(matches(withText("Invalid, please make a better password")));

    }

    @Test
    public void haNoNumber() {
        //Add String to text field
        onView(withId(R.id.edtPassword)).perform(typeText("NoNumber"));
        //click validate
        onView(withId(R.id.btnValidate)).perform(click());
        //Check if text is correct
        onView(withId(R.id.textView)).check(matches(withText("Invalid, please make a better password")));

    }

    @Test
    public void isPassword() {
        //Add String to text field
        onView(withId(R.id.edtPassword)).perform(typeText("Password"));
        //click validate
        onView(withId(R.id.btnValidate)).perform(click());
        //Check if text is correct
        onView(withId(R.id.textView)).check(matches(withText("Invalid, please make a better password")));

    }
    public void isPassword2() {
        //Add String to text field
        onView(withId(R.id.edtPassword)).perform(typeText("password"));
        //click validate
        onView(withId(R.id.btnValidate)).perform(click());
        //Check if text is correct
        onView(withId(R.id.textView)).check(matches(withText("Invalid, please make a better password")));

    }

    public void isToShort() {
        //Add String to text field
        onView(withId(R.id.edtPassword)).perform(typeText("Pw123"));
        //click validate
        onView(withId(R.id.btnValidate)).perform(click());
        //Check if text is correct
        onView(withId(R.id.textView)).check(matches(withText("Invalid, please make a better password")));

    }

    public void isToLong() {
        //Add String to text field
        onView(withId(R.id.edtPassword)).perform(typeText("PASDFASFasfasfasPASDPpsad12312412312451212qdasdf2423dfw2df234r3534f34cf34f34f3f34f34f34"));
        //click validate
        onView(withId(R.id.btnValidate)).perform(click());
        //Check if text is correct
        onView(withId(R.id.textView)).check(matches(withText("Invalid, please make a better password")));

    }

    public void isGood() {
        //Add String to text field
        onView(withId(R.id.edtPassword)).perform(typeText("ThisIsAValidpass123"));
        //click validate
        onView(withId(R.id.btnValidate)).perform(click());
        //Check if text is correct
        onView(withId(R.id.textView)).check(matches(withText("Password is Valid")));

    }

}
