package com.functionalinterface.defaultmethods.dataexport;

public class JSONExporter implements DataExporter{
	@Override
	public void exportToJSON() {
		System.out.println("Exporting data to JSON with custom logic");
	}
	
	@Override
	public void export() {
		System.out.println("Exporting data");
	}

}
