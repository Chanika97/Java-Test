public class StudentGradeCalculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide scores for Math, Science, and English.");
            return;
        }

        
        int mathScore = Integer.parseInt(args[0]);
        int scienceScore = Integer.parseInt(args[1]);
        int englishScore = Integer.parseInt(args[2]);

        
        double averageScore = (mathScore + scienceScore + englishScore) / 3.0;

        
        String finalGrade;
        if (mathScore < 30 || scienceScore < 30 || englishScore < 30) {
            finalGrade = "F";
        } else if (averageScore >= 90) {
            finalGrade = "A";
        } else if (averageScore >= 70) {
            finalGrade = "B";
        } else if (averageScore >= 50) {
            finalGrade = "C";
        } else {
            finalGrade = "F";
        }

        
        System.out.println("Final Grade: " + finalGrade);
        System.out.println("Average Score: " + averageScore);
    }
}
