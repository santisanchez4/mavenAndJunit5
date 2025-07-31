package com.example.Suite;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import com.example.CourseTest;
import com.example.OnlineCourseTest;
import com.example.OnSiteCourseTest;

@Suite
@SelectClasses({
    CourseTest.class,
    OnlineCourseTest.class,
    OnSiteCourseTest.class
})
public class AllTestsSuite {
}