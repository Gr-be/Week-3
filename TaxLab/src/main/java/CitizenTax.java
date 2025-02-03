/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author glaba
 */
public class CitizenTax {

    String name;
    double yearly_income;
    double base_tax;
    
public void citizenStart(){
    name="N/A";
    yearly_income=0;
    base_tax=1;
            
            
}
    
public void setInfo(String name, double yearly_income){
    this.name=name;
    this.yearly_income=yearly_income;
    

}

public void updateIncome(double yearly_income){
    this.yearly_income=yearly_income;
}
    
public double calculateTax() {
    double tax; 
    if (yearly_income >= 0.0 && yearly_income <= 1000.0){ 
        tax = yearly_income * 0;
    } 
    else if (yearly_income >= 1001.0 && yearly_income <= 10000.0) 
    {tax = yearly_income * 0.10;
    } 
    else if (yearly_income >= 10001.0 && yearly_income <= 20200.0)
    {tax = yearly_income * 0.15;
    } 
    else if (yearly_income >= 20201.0 && yearly_income <= 30750.0)
    {tax = yearly_income * 0.20;
    } 
    else if (yearly_income >= 30751.0 && yearly_income <= 50000.0)
    {tax = yearly_income * 0.25;
    } 
    else { tax = yearly_income * 0.30;
    } 
    
    base_tax = tax; 
    return tax; }

public void printInfo(){
    System.out.println("Citizen Name: "+name);
    System.out.println("Yearly Income: $"+yearly_income);
    System.out.println("Tax : $"+base_tax);
    
    
    
}

   


}