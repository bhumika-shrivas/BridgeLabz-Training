package com.functionalinterface.defaultmethods.dataexport;

public class CSVExporter implements DataExporter {

	@Override
	public void export() {
		System.out.println("Exporting data to CSV format");
	}

	@Override
	public void exportToJSON() {
		// TODO Auto-generated method stub
		
	}

}
