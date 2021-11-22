
package democlass;

public class doctor implements staff {
    
    public doctor(String name){
        System.out.println(name+"is doctor");
    
    }

    @Override
    public double getSalary() {
        return 10000.0;
    }

    @Override
    public double getYearsOfWork() {
        return 5.0;
    }

    @Override
    public double Taxes() {
        
        return  this.getSalary()*(10/100);
        
    }

    @Override
    public double total_salary() {
        return this.getSalary()-this.Taxes();
    }

}
