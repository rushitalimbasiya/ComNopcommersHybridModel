package Com.NopcommersHybridModel;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features=".",tags={"@Test"},plugin={"pretty","html:targt/cucumber.reports/report"})
public class RunTest{

}
