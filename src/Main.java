public class Main {
    public static void main  (String[] args) {
        // 4. Creating instance and testing
        GradeCalculator gc = new GradeCalculator();

        String studentName = "John Smith";
        double average = gc.calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = gc.getLetterGrade(average);


        gc.displayResult(studentName, average);
        gc.displayResult(studentName, average, letterGrade);
    }
}
