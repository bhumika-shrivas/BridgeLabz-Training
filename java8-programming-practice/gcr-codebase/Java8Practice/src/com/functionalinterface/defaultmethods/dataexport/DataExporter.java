package com.functionalinterface.defaultmethods.dataexport;

public interface DataExporter {
	void export();
	
	default void exportToCSV() {
		System.out.println("Exporting data to CSV format.");
	}

	void exportToJSON();
}
