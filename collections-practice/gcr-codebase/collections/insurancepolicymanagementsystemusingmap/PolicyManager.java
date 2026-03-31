package insurancepolicymanagementsystemusingmap;
import java.time.LocalDate;
import java.util.*;
public class PolicyManager {
	
	//HashMap -- Fast access using policy number
	private Map<String, Policy> policyMap = new HashMap<>();
	//LinkedHashMap -- maintains insertion order
	private Map<String, Policy> insertionOrderMap = new LinkedHashMap<>();
	
	//TreeMap -- sorted by expiry date
	private TreeMap<LocalDate , List<Policy>> expiryDateMap = new TreeMap<>();
	
	//Add a policy 
	public void addPolicy(Policy policy) {
		policyMap.put(policy.getPolicyNumber(), policy);
		insertionOrderMap.put(policy.getPolicyNumber(), policy);
		
		
		//Store policies by expiry date 
		expiryDateMap
				.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>())
				.add(policy);
		
		
	}
	
	//retrieve a policy by policy number
	public Policy getPolicyByNumber(String policyNumber) {
		return policyMap.get(policyNumber);
		
	}
	//  List policies expiring within next 30 days
    public List<Policy> getPoliciesExpiringSoon() {
        List<Policy> result = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        for (Map.Entry<LocalDate, List<Policy>> entry :
                expiryDateMap.subMap(today, true, next30Days, true).entrySet()) {
            result.addAll(entry.getValue());
        }
        return result;
    }
    
    //List policies by policy holder name 
    public List<Policy> getPoliciesByHolder(String holderName){
    	List<Policy> result = new ArrayList<>();
    	
    	for(Policy policy : policyMap.values()) {
    		if(policy.getPolicyHolderName().equalsIgnoreCase(holderName)){
    			result.add(policy);
    			
    		}
    	}
    	return result;
    	
    }
 // 4. Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<String, Policy>> iterator = policyMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Policy policy = iterator.next().getValue();
            if (policy.getExpiryDate().isBefore(today)) {
                iterator.remove();
                insertionOrderMap.remove(policy.getPolicyNumber());
            }
        }

        // Remove from TreeMap
        expiryDateMap.headMap(today).clear();
    }
    //Display Policies in insertion order 
    public void displayAllPolicies() {
    	for(Policy policy : insertionOrderMap.values()) {
    		System.out.println(policy);
    	}
    }

}
