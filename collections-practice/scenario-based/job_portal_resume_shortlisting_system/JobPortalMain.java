package job_portal_resume_shortlisting_system;
import java.util.*;

public class JobPortalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Resume> resumeList = new ArrayList<>();

        System.out.print("Enter number of resumes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            try {
                System.out.println("\nEnter Resume " + (i + 1) + " Details");

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter number of skills: ");
                int skillCount = sc.nextInt();
                sc.nextLine();

                Set<String> skills = new HashSet<>();

                for (int j = 0; j < skillCount; j++) {
                    System.out.print("Enter skill " + (j + 1) + ": ");
                    skills.add(sc.nextLine().toLowerCase());
                }

                Resume resume = new Resume(name, skills);
                resumeList.add(resume);

            } catch (InvalidException e) {
                System.out.println("Error: " + e.getMessage());
                i--; // retry
            }
        }

        // Required Skills
        System.out.print("\nEnter number of required skills: ");
        int reqCount = sc.nextInt();
        sc.nextLine();

        Set<String> requiredSkills = new HashSet<>();

        for (int i = 0; i < reqCount; i++) {
            System.out.print("Enter required skill " + (i + 1) + ": ");
            requiredSkills.add(sc.nextLine().toLowerCase());
        }

        // Calculate match
        for (Resume r : resumeList) {
            r.calculateMatch(requiredSkills);
        }

        // Sort resumes
        Collections.sort(resumeList, new ResumeComparator());

        // Display result
        System.out.println("\n===== Ranked Resumes =====");
        for (Resume r : resumeList) {
            System.out.println(r);
        }

        sc.close();
    }
}
