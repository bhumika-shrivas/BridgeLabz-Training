package com.functionalinterface.defaultmethods.dataexport;

public class Main {
	public static void main(String[] args) {
		DataExporter csv = new CSVExporter();
		DataExporter pdf = new PDFExporter();
		
		csv.export();
		csv.exportToJSON();
		pdf.export();
		pdf.exportToJSON();
	}

}
