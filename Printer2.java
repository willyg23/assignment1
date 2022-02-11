package hw1;

/**
 * 
 * 
 * @author willyg (netid)
 *
 */

public class Printer2{

	private int traySize;
	private int sheetsAvailable;
	private int initialPage;
	private int pagesPrinted;
	private int nextPageToPrint;
	private int traySheets;
	private int addingToPagePrint;
	private int documentSize;
	
	/**
	 * 
	 *  Constructs a new printer with the given maximum tray capacity of the number of paper sheets it 
		can hold. Initially the tray is empty and the printer has not printed any pages. 
		@param
	 */
	public Printer2(int trayCapacity) // constructor
	{
		traySize = trayCapacity;
		pagesPrinted = 0;
		sheetsAvailable = 0;
		
		System.out.println("THIS IS #2");
	}
		
		
		
	
	
	
	
	
	
	/**
	 * 
	 * Starts a new print job to make copies of a document that is a specified page length 
	(documentPages). Updates the next page to print as page 0 (denotes the first page of the 
	document).
	@param
	 */
	public void startPrintJob(int documentPages) //mutator
	{
		
		documentSize = documentPages;
		
		
		
		// this was just banging rocks together hoping for fire
		/*
		nextPageToPrint = 0;
		initialPage = 0;
		
		
		printPage();
		
		nextPageToPrint += addingToPagePrint; //add addingToPagePrint?
		
		initialPage = 0;
		*/
	}
		
		
	
	 
	
	
	/**
	 * 
	 * Returns the number of sheets available for printing. 
	 * @param
	 */
	public int getSheetsAvailable() //accessor 
	{
		
		
		return sheetsAvailable;
	}
		
	
		
	
	
	
	/**
	 * 
	 * Returns the next page number of the document that will be printed. \
	 * @return
	 */
	public int getNextPage() //accessor
	{
		
		
		return (pagesPrinted % documentSize);
		
	}
		
	
	
	
	
	
	/**
	 * Returns the count of all pages printed by the printer since its construction.
	 * @return
	 */
	public int getTotalPages() //accessor
	{
		
		return pagesPrinted;
		
	}
		
	
	
	
	
	/**
	 * Simulates the printer printing a page. The number pages printed is either one or zero depending 
	on whether there is at least one sheet of paper available to the printer. Increments the total page 
	count of the printer by the number of pages printed. Advances the next page to print by the 
	number of pages printed (possibly wrapping around to page zero). The number of pages 
	available to the printer and in the tray are also updated accordingly. 
	 */
	
	public void printPage() //mutator
	{
		
		
		
		
		addingToPagePrint = Math.min(1, Math.max(0, sheetsAvailable));
		
		
		pagesPrinted += addingToPagePrint;
		pagesPrinted %= documentSize;
		sheetsAvailable -= addingToPagePrint;
		traySheets -= addingToPagePrint;
		
		
		
		// nextPageToPrint += 1;
		
		
		
		
		
		
		
		
		
		
		
		//below not going to be used but just to help my thought proccess of what needs to happen
		
		/*
		if(sheetsAvailable <= 0) 
		{
			
			// break?
			
		}
		
		else
		{
			
			sheetsAvailable -= 1;
			pagesPrinted += 1;
			nextPageToPrint += 1;
			
		}
		
		*/
		
	}
		
	
	
	
	
	/**
	 * Removes the paper tray from the printer; that is, makes the sheets available to the printer zero.  
	 */
	public void removeTray() //mutator
	{
		traySheets = sheetsAvailable;
		sheetsAvailable = 0;
	}
		
	
	
	
	
	/**
	 * Replaces the tray in the printer; that is, makes the sheets available to the printer the same as the 
		number of sheets in the tray. 
	 */
	public void replaceTray() //mutator
	{
		sheetsAvailable += traySheets;
	}
	
	
	/**
	 * 
	 * Simulates removing the tray, adding the given number of sheets (up to the maximum capacity of 
	the tray), and replacing the tray in the printer. 
	@param
	 */
	public void addPaper(int sheets) //mutator
	{
		
		// remove tray
		removeTray();
		
		traySheets += Math.min(sheets, traySize - traySheets);
		
		// remove tray
		replaceTray();
		
	}
	
	
	
	/**
	 * 
	 * Simulates removing the tray, removing the given number of sheets (but not allowing the sheets to 
		go below zero), and replacing the tray in the printer. 
		@param
	 */
	public void removePaper(int sheets) //mutator
	{
		
		// remove tray
		removeTray();

		
		traySheets -= Math.min(sheets,  traySheets);
		
		// replace tray
		replaceTray();

		// import math?
		
		//sheetsAvailable -= Math.min(sheets,  sheetsAvailable);
	}
	      
	
	// max of sheetsAvailble and sheets
	
	
	//dataType max(dataType num1, dataType num2)
	
	//dataType min(dataType num1, dataType num2)
	
	// dataType min(dataType sheets, dataType sheetsAvailable)
	
	
	
	
	
	
}

