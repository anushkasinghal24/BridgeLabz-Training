package insurancepolicymanagementsystem;

import java.time.LocalDate;

public class Policy implements Comparable<Policy>{
    private int policyNumber;
    private String holderName;
    private LocalDate expiryDate;
    private double premium;
    private String coverageType;


    public Policy(int policyNumber, String holderName, LocalDate expiryDate, double premium, String coverageType){
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.premium = premium;
        this.coverageType = coverageType;
    }


    public int getPolicyNumber(){
        return policyNumber;
    }

    public String getHolderName(){
        return holderName;

    }

    public String getCoverageType(){
        return coverageType;
    }

    public double getPremium(){
        return premium;
    }

    public LocalDate getExpiryDate(){
        return expiryDate;
    }

    @Override

    public int compareTo(Policy p){
        return this.expiryDate.compareTo(p.expiryDate);
    }

    @Override

    public boolean equals(Object obj){
        Policy p = (Policy)obj;
        return this.policyNumber == p.policyNumber;
           
        
    }



    @Override 

    public int hashCode(){
        return policyNumber;
    }

    @Override

    public String toString(){
        return policyNumber+" | "+holderName+" | "+expiryDate+" | "+premium+" | "+coverageType;
    }


}
