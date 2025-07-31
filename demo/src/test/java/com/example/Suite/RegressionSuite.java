package com.example.Suite;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.ExcludeTags;

@Suite
@SelectPackages("com.test")
@IncludeTags("regression")
@ExcludeTags("smoke")
public class RegressionSuite {

}