package com.example.android.powermocktest;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(AndroidJUnit4.class)
public class GetNonStaticValueTest {

    @Test
    public void getNonStaticValueReturnsNonStaticValue(){
        GetNonStaticValue getNonStaticValue = Mockito.mock(GetNonStaticValue.class);
        when(getNonStaticValue.getNonStaticString()).thenReturn("Hi, I'm non-static");
        assertThat(getNonStaticValue.getNonStaticString(), equalTo("Hi, I'm non-static"));
    }
}
