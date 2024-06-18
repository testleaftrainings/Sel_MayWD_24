package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;


@CucumberOptions(features="src/test/java/features/TC001_Login.feature", glue="steps", monochrome = true, publish=true, 
//tags="@Smoke"
//tags="@Smoke or @Regression"
tags="@Smoke and @Functional")
public class RunnerClass extends BaseClass {

}
