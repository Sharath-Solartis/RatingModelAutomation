package com.solartis.test.ratingWorkbookAutomation;

import java.util.LinkedHashMap;
import com.solartis.test.exception.MacroException;

public interface MacroInterface 
{
	public void LoadSampleRatingmodel(String SampleRatingModelPath,LinkedHashMap<String, String> inputData) throws MacroException;
	public void GenerateExpected(LinkedHashMap<String, String> inputData,String Targetpath) throws MacroException;
	public void PumpinData(LinkedHashMap<String, String> inputData) throws MacroException;
	public void PumpoutData(LinkedHashMap<String, String> outputData,LinkedHashMap<String, String> inputData) throws MacroException;  

}
