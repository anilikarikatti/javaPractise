package UniverSity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UniversitySystem
 */
public class UniversitySystem {

    private Map<String , University> universities;

    UniversitySystem(){
        this.universities = new HashMap<>();
    }
    
    void addUniverSity(University university){

        universities.put(university.code, university);

    }


    void addCollegeToUniversity(String universityCode , College college){
        University university = universities.get(universityCode);

        if(university != null){
            university.addColleges(college);
        }else{
            System.out.println("University Not Found");
        }
    }

    List<College> getCollegesByUniversity(String universityCode ){
        University university = universities.get(universityCode);

       return university != null ? university.getColleges() : null;
    }


    public static void main(String[] args) {
        
        UniversitySystem system = new UniversitySystem();


        // create universities

        University uni1 = new University("Hardward", "HARD");
        University uni2 = new University("Stanfard", "STAN");

        University uni3 = new University("VTU", "VTU");



        // add universities
        system.addUniverSity(uni1);
        system.addUniverSity(uni2);
        system.addUniverSity(uni3);


        // create colleges

        College clg1  = new College("Jain","Jain123");
        College clg2  = new College("BVB","BVB123");
        College clg3  = new College("iit","iit123");
        College clg4  = new College("gpt","gpt123");

        system.addCollegeToUniversity(uni1.code, clg4);
        system.addCollegeToUniversity(uni2.code, clg3);
        system.addCollegeToUniversity(uni3.code, clg2);
        system.addCollegeToUniversity(uni1.code, clg1);
        


        List<College> colleges = system.getCollegesByUniversity("HARD");

        for (College college : colleges) {
            System.out.println("name "  + ":" + college.name +" "+ "code" + " :"+ college.code) ;
        }


    }


}