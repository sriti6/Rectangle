import javax.swing.*;

public class EnumType {

enum MonthsType {January,February,March,April,May,June,July,Augest,September,October,November,December}
public static void main (String [] args){
    MonthsType [] choices = {MonthsType.January,MonthsType.February,MonthsType.March,MonthsType.April,MonthsType.May,MonthsType .June, MonthsType.July,MonthsType.Augest,MonthsType.September,MonthsType.October,MonthsType.November,MonthsType.December};

    while ( true){

    MonthsType select = (MonthsType) JOptionPane.showInputDialog(null,"Select the Months Type.", "Months Type",JOptionPane.INFORMATION_MESSAGE,null,choices,choices[3]);


    switch (select){
        case January:
        JOptionPane.showMessageDialog(null,"Do you want to build a sonow man");
        break;
        case February:
            JOptionPane.showMessageDialog(null,"Do you want to build a sonow man?");
            break;
        case March:
            JOptionPane.showMessageDialog(null,"Happy Spring days!");
            break;
        case April:
            JOptionPane.showMessageDialog(null,"Happy Spring days!");
            break;
        case May:
            JOptionPane.showMessageDialog(null,"Happy Spring days!");
            break;
        case June:
            JOptionPane.showMessageDialog(null," It’s a summer time.");
            break;
        case July:
            JOptionPane.showMessageDialog(null," It’s a summer time.");
            break;
        case Augest:
            JOptionPane.showMessageDialog(null," It’s a summer time.");
            break;
        case September:
            JOptionPane.showMessageDialog(null," Welcome to the foliage season!");
         break;
        case October:
            JOptionPane.showMessageDialog(null," Welcome to the foliage season!");
            break;

        case November:
            JOptionPane.showMessageDialog(null," Welcome to the foliage season!");
            break;
        case December:
            JOptionPane.showMessageDialog(null,"Do you want to build a sonow man");
            break;



    }



}




}

    }
