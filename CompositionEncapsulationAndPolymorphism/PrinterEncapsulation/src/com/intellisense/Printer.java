package com.intellisense;

public class Printer
{
    private int tonerLevel;
    private int pagesPrinted; // cant be initialized
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex)
    {
        if(tonerLevel>-1 && tonerLevel <=100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount)
    {
        if(tonerAmount>0 && tonerAmount<=100)
        {
            if(this.tonerLevel+tonerAmount>100)
                return -1;
            else
                tonerLevel+=tonerAmount;
            return this.tonerLevel;
        }
        else
            return -1;
    }

    public int getPagesPrinted()
    {
        return pagesPrinted;
    }

    public int printPages(int pages)
    {
        int pagesToPrint = pages;
        if(duplex) {
            Math.round(pagesToPrint /= 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
