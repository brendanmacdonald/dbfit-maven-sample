package dbfit.tests;

import fitnesse.junit.FitNesseRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static fitnesse.junit.FitNesseRunner.*;

@RunWith(FitNesseRunner.class)
@Suite("TestSuite")
@FitnesseDir(".")
@OutputDir("./results")
public class CityTest {}

