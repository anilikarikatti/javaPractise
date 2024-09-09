package UniverSity;

import java.util.ArrayList;
import java.util.List;

/**
 * University
 */
public class University {

    protected String name ; 
   protected String code ;
    private List <College> colleges;

    public University(String name , String code){

        this.name = name ; 
        this.code = code ;
        this.colleges = new ArrayList<>();

    }

    void addColleges(College college){
        colleges.add(college);
    }

    List<College> getColleges(){

        return colleges;
    }




    
}