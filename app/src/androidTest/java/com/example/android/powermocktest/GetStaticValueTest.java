package com.example.android.powermocktest;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(AndroidJUnit4.class)
@PrepareForTest(GetStaticValue.class)
public class GetStaticValueTest {

    @Test
    public void getStaticValueReturnsValue(){
        PowerMockito.mockStatic(GetStaticValue.class);
        when(GetStaticValue.getTheStaticValue()).thenReturn("Hi, I'm static");
        assertThat(GetStaticValue.getTheStaticValue(), equalTo("Hi, I'm static"));
    }
}
