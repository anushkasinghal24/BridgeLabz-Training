import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Version {
    String name;
    int size;

    Version(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
}

public class VersionControlledStorageSystem {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<Version>> files = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String operation = parts[0];

            switch(operation) {

                case "UPLOAD":
                    String fileName = parts[1];
                    String version = parts[2];
                    int size = Integer.parseInt(parts[3]);

                    files.putIfAbsent(fileName, new ArrayList<>());

                    List<Version> list = files.get(fileName);

                    boolean exists = false;
                    for (Version v : list) {
                        if (v.name.equals(version)) {
                            exists = true;

                            break;
                        }
                    }

                    if (!exists){
                        list.add(new Version(version, size));
                    }
                    break;

                case "FETCH":
                    fileName = parts[1];

                    if (!files.containsKey(fileName)) {
                        System.out.println("File Not Found");
                        break;
                    }

                    List<Version> versions = new ArrayList<>(files.get(fileName));

                    versions.sort((a, b) -> {
                        if (a.size != b.size)
                            return a.size - b.size;
                        return a.name.compareTo(b.name);
                    }) ;

                    for (Version v : versions) {
                        System.out.println(fileName + " " + v.name + " " + v.size);
                    }
                    
                    break;

                case "LATEST":
                    fileName = parts[1];

                    if (!files.containsKey(fileName) || files.get(fileName).isEmpty()) {
                        System.out.println("File Not Found");
                        break;
                    }

                    List<Version> latestList = files.get(fileName);
                    Version latest = latestList.get(latestList.size() - 1);

                    System.out.println(fileName + " " + latest.name + " " + latest.size);
                    break;

                case "TOTAL_STORAGE":
                    fileName = parts[1];

                    if (!files.containsKey(fileName)) {
                        System.out.println("File Not Found");
                        break;
                    }

                    int total = 0;
                    for (Version v : files.get(fileName)) {
                        total += v.size;
                    }

                    System.out.println(fileName + " " + total);
                    break;
            }
        }
    }
}