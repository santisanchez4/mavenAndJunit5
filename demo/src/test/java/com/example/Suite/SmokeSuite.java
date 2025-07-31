package com.example.Suite;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;

@Suite
@SelectPackages("com.example")
@IncludeTags("smoke")
@ExcludeTags("regression")
public class SmokeSuite {

}