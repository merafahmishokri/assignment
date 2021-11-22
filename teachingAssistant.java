
package democlass;

public class teachingAssistant implements staff {
    
    public teachingAssistant(String name){
        System.out.println(name+"is teaching Assistant");
    
    }


    @Override
    public double getSalary() {
        return 20000.0;
    }

    @Override
    public double getYearsOfWork() {
        return 15.0;
    }

    @Override
    public double Taxes() {
        
        return  this.getSalary()*(15/100);
        
    }

    @Override
    public double total_salary() {
        return this.getSalary()-this.Taxes();
    }

    
    
}
