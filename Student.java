package gitProject;

public class Student {
	   String name,stuNo;
	    int classes;
	    Course mat;
	    Course fizik;
	    Course kimya;
	    double matOrt, fizOrt, kimOrt;
	    double avarage;
	    boolean isPass;
	    
	    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
	        this.name = name;
	        this.classes = classes;
	        this.stuNo = stuNo;
	        this.mat = mat;
	        this.fizik = fizik;
	        this.kimya = kimya;
	        calcAvarage();
	        this.isPass = false;
	    }


	    public void addBulkExamNote(int mat, int fizik, int kimya) {

	        if (mat >= 0 && mat <= 100) {
	            this.mat.note = mat;
	        }

	        if (fizik >= 0 && fizik <= 100) {
	            this.fizik.note = fizik;
	        }

	        if (kimya >= 0 && kimya <= 100) {
	            this.kimya.note = kimya;
	        }
	    }
	    
	    public void addBulkSozNote(int mat, int fizik, int kimya) {

	        if (mat >= 0 && mat <= 100) {
	            this.mat.sozNot = mat;
	        }

	        if (fizik >= 0 && fizik <= 100) {
	            this.fizik.sozNot= fizik;
	        }

	        if (kimya >= 0 && kimya <= 100) {
	            this.kimya.sozNot = kimya;
	        }
	    }

	    public void isPass() {
	        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.sozNot == 0 || this.fizik.sozNot == 0 || this.kimya.sozNot == 0) {
	            System.out.println("Notlar tam olarak girilmemiþ");
	        } else {
	            this.isPass = isCheckPass();
	            printNote();
	            System.out.println("Ortalama : " + this.avarage);
	            if (this.isPass) {
	                System.out.println("Sýnýfý Geçti. ");
	            } else {
	                System.out.println("Sýnýfta Kaldý.");
	            }
	        }
	    }

	    public void calcAvarage() {
	        
	    	this.matOrt = (this.mat.note * 0.8) + (this.mat.sozNot * 0.2);
	    	this.fizOrt = (this.fizik.note * 0.7) + (this.fizik.sozNot * 0.3);
	    	this.kimOrt = (this.kimya.note * 0.6) + (this.kimya.sozNot * 0.4);
	    	
	    	this.avarage = (this.matOrt + this.fizOrt + this.kimOrt) / 3;        
	        
	    }

	    public boolean isCheckPass() {
	        calcAvarage();
	        return this.avarage > 55;
	    }

	    public void printNote(){
	        System.out.println("=========================");
	        System.out.println("Öðrenci : " + this.name);
	        System.out.println("Matematik Notu : " + this.mat.note);
	        System.out.println("Fizik Notu : " + this.fizik.note);
	        System.out.println("Kimya Notu : " + this.kimya.note);
	    }

}
