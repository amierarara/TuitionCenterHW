import java.util.Formatter;
import java.util.*;
public class Main
{
    // application code
    public static void main(String[] args) throws Exception {
        System.out.println("_____________________________________________CENTER 1 : KL_____________________________________________");
        //TuitionCenter c1 = new TuitionCenter();
        Address addr = new Address(2, "Bandar Jasa", 77777, "Kuala Lumpur", "KL");
        //c1.setAddress(addr);

        //creating a batch object
        studentBatch sb2023 = new studentBatch();
        teacherList tl2023 = new teacherList();
        System.out.println("**********************************************STUDENT**********************************************");
        //new = create new variable
        Student upin = new Student();
        Name name = new Name("","",""); //variable = name
        name.setFName("Upin");
        name.setMName("Zayn");
        name.setLName("Malik");
        upin.setName(name);
        upin.setIC("990802-05-5577");
        addr = new Address(13,"Kampung Lama", 15780, "Setapak", "KL");
        upin.setAddress(addr);
        upin.setYear(2023);
        upin.setSchoolName("SMK Setapak");


        Student ipin = new Student();
        //name = new Name(); // just to create another bungkus of nasi lemak (variable)
        name = new Name("Ipin","Harry","Styles");
        ipin.setName(name);
        ipin.setIC("051008-14-2010");
        addr = new Address(2, "Bandar Idaman", 35241, "Kepong", "KL");
        ipin.setAddress(addr);
        ipin.setYear(2021);
        ipin.setSchoolName("SMK Kepong");

        Student meimei = new Student();
        name = new Name("Mei Mei","Daisy","Golding");
        meimei.setName(name);
        meimei.setIC("020409-13-1928");
        addr = new Address(30, "Bandar Kiara", 35241, "Pandan", "KL");
        meimei.setAddress(addr);
        meimei.setYear(2023);
        meimei.setSchoolName("SMK Pandan II");

        //method for a batch object
        sb2023.add(upin,0);
        sb2023.add(ipin,1);
        sb2023.add(meimei,2);
        sb2023.addIC(0);
        sb2023.addAddress(0);
        sb2023.addNumYear(0);
        sb2023.addSchoolName(0);

        // declare a method that allows for the following:
        boolean isIn = sb2023.find("Georgia");
        System.out.println("Result to find specific name : " + isIn);

        // set mark for upin
        float m1 = 100;
 		for (int i = 0; i<5;i++){
            try {
                upin.setMarks(m1, i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            m1-=11;
 		}

 		// calculate and print the avg for upin
        upin.displayMarks(0);
 		float avgUpin = 0;
 		avgUpin = upin.calcAvg();
 		System.out.println("Average marks Upin = " + avgUpin);

        // min & max mark of upin
        upin.calcMin();
        upin.calcMax();

        // set mark for ipin
 		for (int i = 0; i<5;i++){
            int min = 50; // Minimum value of range
            int max = 97; // Maximum value of range
            // to generate random int value from min to max
            int m2 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            ipin.setMarks(m2,i);
        }

         //calculate and print the avg for ipin
        ipin.displayMarks(1);
 		float avgIpin = 0;
        avgIpin = ipin.calcAvg();
 		System.out.println("Average marks Ipin = " + avgIpin);

        // min & max mark of ipin
        ipin.calcMin();
        ipin.calcMax();

        // set mark for meimei
        for (int i = 0; i<5;i++){
            int min = 30; // Minimum value of range
            int max = 78; // Maximum value of range
            // to generate random int value from min to max
            int m3 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            meimei.setMarks(m3,i);
        }

        //calculate and print the avg for meimei
        meimei.displayMarks(1);
        float avgMeimei = 0;
        avgMeimei = meimei.calcAvg();
        System.out.println("Average marks Mei Mei = " + avgMeimei);

        // min & max mark of meimei
        meimei.calcMin();
        meimei.calcMax();


        System.out.println("**********************************************TEACHER**********************************************");
        Teacher cikgujep = new Teacher();
        name = new Name("Jep","Liam","Payne");
        cikgujep.setName(name);
        cikgujep.setIC("791116-15-2359");
        addr = new Address(10,"Bandar Paduka", 32100, "Cheras", "KL");
        cikgujep.setAddress(addr);
        cikgujep.setQualification("Master in Modern Mathematics");
        cikgujep.setNumyearexp(9);
        cikgujep.setDateJoined("20/8/2020");
        cikgujep.setNumYearInCenter(3);

        Teacher cikguayu = new Teacher();
        name = new Name("Ayu","Anne","Henderson");
        cikguayu.setName(name);
        cikguayu.setIC("850909-07-2242");
        addr = new Address(99, "Bandar Riang", 36954, "Pandan", "KL");
        cikguayu.setAddress(addr);
        cikguayu.setQualification("Bachelor Degree in TESL");
        cikguayu.setNumyearexp(3);
        cikguayu.setDateJoined("1/1/2022");
        cikguayu.setNumYearInCenter(1);

        //method for a batch object
        tl2023.add(cikgujep,0);
        tl2023.add(cikguayu,1);
        tl2023.addIC(0);
        tl2023.addAddress(0);
        tl2023.addQualification(0);
        tl2023.addNumYearExp(0);
        tl2023.addDateJoined(0);
        tl2023.addNumYearsIncenter(0);

        System.out.println("************************************REPORT OF TUITION CENTER KL************************************");
        TuitionCenterList tuitcenterlist = new TuitionCenterList();
        TuitionCenter tc1 = new TuitionCenter();
        name = new Name("Henry","Kim","Middleton");
        tc1.setPrincipalName(name);
        tuitcenterlist.addPrincipalList(name);
        System.out.println("Principal of Tuition Center KL : " + name.getFName() + " " + name.getMName() + " " + name.getLName());
        addr = new Address(1, "Cheras", 50000, "Kuala Lumpur", "KL");
        tc1.setAddress(addr);
        tuitcenterlist.addAddress(addr);
        System.out.println("Address of Tuition Center KL : " + addr.getHouseUnit() + " " + addr.getArea() + " " + addr.getPostcode() + " " + addr.getTown() + " " + addr.getState());
        System.out.println("Number of students : " + sb2023.getCurrsz());
        System.out.println("Number of teachers : " + tl2023.getCurrAmtTeacher());
        sb2023.getMarksFromAllStud();
        System.out.println("Average mark of all students : " + sb2023.calcAvgAllStud());
        sb2023.calcMinAllStud();
        sb2023.calcMaxAllStud();
        //one student = one teacher
        upin.assignTeacher(avgUpin);
        ipin.assignTeacher(avgIpin);
        meimei.assignTeacher(avgMeimei);

        System.out.println("_____________________________________________CENTER 2 : JB_____________________________________________");
        System.out.println("**********************************************STUDENT**********************************************");
        studentBatch sb2022 = new studentBatch();
        teacherList tl2022 = new teacherList();
        Student jarjit = new Student();
        name = new Name("Jarjit","Jim","Singh");
        jarjit.setName(name);
        jarjit.setIC("163577-17-1239");
        addr = new Address(22,"Kampung Jasa", 16587, "Batu Pahat", "JB");
        jarjit.setAddress(addr);
        jarjit.setYear(2021);
        jarjit.setSchoolName("SMK Batu Pahat");


        Student minji = new Student();
        //name = new Name(); // just to create another bungkus of nasi lemak (variable)
        name = new Name("Minji","Lily","Kim");
        minji.setName(name);
        minji.setIC("368751-14-29268");
        addr = new Address(2, "Bandar Idaman", 15671, "Ayer Hitam", "JB");
        minji.setAddress(addr);
        minji.setYear(2022);
        minji.setSchoolName("SMK Kepong");


        //method for a batch object
        sb2022.add(jarjit,0);
        sb2022.add(minji,1);
        sb2022.addIC(0);
        sb2022.addAddress(0);
        sb2022.addNumYear(0);
        sb2022.addSchoolName(0);

        // declare a method that allows for the following:
        sb2022.find("Minji");
        System.out.println("Result to find specific name : " + isIn);

        // set mark for jarjit
        for (int i = 0; i<5;i++){
            int min = 33; // Minimum value of range
            int max = 99; // Maximum value of range
            // to generate random int value from min to max
            int m4 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            jarjit.setMarks(m4,i);
        }

        // calculate and print the avg for jarjit
        jarjit.displayMarks(0);
        float avgJarjit = 0;
        avgJarjit = jarjit.calcAvg();
        System.out.println("Average marks Jarjit = " + avgJarjit);

        // min & max mark of jarjit
        jarjit.calcMin();
        jarjit.calcMax();

        // set mark for minji
        for (int i = 0; i<5;i++){
            int min = 30; // Minimum value of range
            int max = 79; // Maximum value of range
            // to generate random int value from min to max
            int m5 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            minji.setMarks(m5,i);
        }

        //calculate and print the avg for minji
        minji.displayMarks(1);
        float avgMinji = 0;
        avgMinji = minji.calcAvg();
        System.out.println("Average marks Ipin = " + avgMinji);

        // min & max mark of minji
        minji.calcMin();
        minji.calcMax();

        System.out.println("**********************************************TEACHER**********************************************");
        Teacher cikguliana = new Teacher();
        name = new Name("Liana","Aliah","Zul");
        cikguliana.setName(name);
        cikguliana.setIC("657812-12-1234");
        addr = new Address(64,"Kampung Balai", 35786, "Ayer Tawar", "JB");
        cikguliana.setAddress(addr);
        cikguliana.setQualification("Master in Biology");
        cikguliana.setNumyearexp(7);
        cikguliana.setDateJoined("24/6/2015");
        cikguliana.setNumYearInCenter(8);

        Teacher cikgukamal = new Teacher();
        name = new Name("Kamal","Adli","Shanon");
        cikgukamal.setName(name);
        cikgukamal.setIC("789646-07-3561");
        addr = new Address(27, "Bandar Riang", 76534, "Batu Pahat", "JB");
        cikgukamal.setAddress(addr);
        cikgukamal.setQualification("PHD Degree in Automobike");
        cikgukamal.setNumyearexp(15);
        cikgukamal.setDateJoined("16/7/2019");
        cikgukamal.setNumYearInCenter(5);

        //method for a batch object
        tl2022.add(cikguliana,0);
        tl2022.add(cikgukamal,1);
        tl2022.addIC(0);
        tl2022.addAddress(0);
        tl2022.addQualification(0);
        tl2022.addNumYearExp(0);
        tl2022.addDateJoined(0);
        tl2022.addNumYearsIncenter(0);
        System.out.println("************************************REPORT OF TUITION CENTER JB************************************");
        TuitionCenter tc2 = new TuitionCenter();
        name = new Name("Mariah","Jennet","Carrey");
        tc2.setPrincipalName(name);
        tuitcenterlist.addPrincipalList(name);
        System.out.println("Principal of Tuition Center JB : " + name.getFName() + " " + name.getMName() + " " + name.getLName());
        addr = new Address(1, "Jalan Maju", 90000, "Johor Bahru", "JB");
        tc2.setAddress(addr);
        tuitcenterlist.addAddress(addr);
        System.out.println("Address of Tuition Center JB: " + addr.getHouseUnit() + " " + addr.getArea() + " " + addr.getPostcode() + " " + addr.getTown() + " " + addr.getState());
        System.out.println("Number of students : " + sb2022.getCurrsz());
        System.out.println("Number of teachers : " + tl2022.getCurrAmtTeacher());
        sb2022.getMarksFromAllStud();
        System.out.println("Average mark of all students : " + sb2022.calcAvgAllStud());
        sb2022.calcMinAllStud();
        sb2022.calcMaxAllStud();
        //one student = one teacher
        jarjit.assignTeacherJB(avgJarjit);
        minji.assignTeacherJB(avgMinji);
    }
}