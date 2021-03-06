package com.vaadin.declarative.demo;

import com.vaadin.addon.spreadsheet.Spreadsheet;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/**
 * Design that uses spreadsheet
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
@DesignRoot
public class SpreadsheetLayout extends VerticalLayout{

	protected Spreadsheet spreadsheet;

	public SpreadsheetLayout(){
		Design.read(this);
	}
}
