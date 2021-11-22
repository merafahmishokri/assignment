
package democlass;

public class memberFactory {
   
    public staff get_member(String position,String name){
        String s=position.toLowerCase();
        if(position=="teaching assistant"){
            return new teachingAssistant(name);}
        else if(position=="doctor"){
            return new doctor(name);}
        else
            return null;
    
    }
}
