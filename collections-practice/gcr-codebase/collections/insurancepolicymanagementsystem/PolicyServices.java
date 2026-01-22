package insurancepolicymanagementsystem;

import java.util.*;

import java.time.LocalDate;

public class PolicyServices{

    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();


    public void addPolicy(Policy p){
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);

    }


    public void displayAll(){
        System.out.println("All policies ");
        

        for(Policy p:hashSet){
            System.out.println(p);
        }
    }


    public void expiringSoon(){
        System.out.println("Expiring soon");

        LocalDate today = LocalDate.now();

        for(Policy p: hashSet){
            if(p.getExpiryDate().isBefore(today.plusDays(30))){
            System.out.println(p);
            }
        }
    }

    public void filterByCoverage(String type){
        System.out.println("Policy types: "+type);
        for(Policy p:hashSet){
            if(p.getCoverageType().equalsIgnoreCase(type)){
                System.out.println(p);
            }
        }
        }


        public void showSortedByExpiry(){
            System.out.println("Sorted by expiry ");
            //treeSet.forEach(System.out::println);

            for(Policy p:treeSet){
                System.out.println(p);
            }
                    }

    }
