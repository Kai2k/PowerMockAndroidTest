package com.example.android.powermocktest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(GetStaticValue.class)
public class GetStaticValueTest {

    @Test
    public void getStaticValueReturnsValue() {
        PowerMockito.mockStatic(GetStaticValue.class);
        when(GetStaticValue.getTheStaticValue()).thenReturn("Hi, I'm static");
        assertThat(GetStaticValue.getTheStaticValue(), equalTo("Hi, I'm static"));
    }
}
