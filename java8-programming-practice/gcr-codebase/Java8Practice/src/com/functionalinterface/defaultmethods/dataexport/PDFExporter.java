package com.functionalinterface.defaultmethods.dataexport;

public class PDFExporter implements DataExporter {
	@Override
	public void export() {
		System.out.println("Exporting data to PDF");
	}

	@Override
	public void exportToJSON() {
		// TODO Auto-generated method stub
		
	}

}
