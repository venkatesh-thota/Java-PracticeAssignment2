class GradeCalculator{

    public void gradecalculator(int totalStudents,int grades[]){

        int averageGrade,maxGrade,minGrade;
        averageGrade=averagegrade(totalStudents,grades);
        maxGrade=maxGrade(totalStudents,grades);
        minGrade=minGrade(totalStudents,grades);
    }

    public int averagegrade(int totalstudents,int grades[]){
        int averagegrade=0;
        for(int i=0;i<totalstudents;i++)
        {
            averagegrade+=grades[i];
        }
        averagegrade/=totalstudents;
        return averagegrade;
    }

    public int maxGrade(int totalstudents,int grades[]){
        int maxGrade=Integer.MIN_VALUE;
        for(int i=0;i<totalstudents;i++)
        {
            maxGrade=Math.max(maxGrade,grades[i]);
        }
        return maxGrade;
    }

    public int minGrade(int totalstudents,int grades[]){
        int minGrade=Integer.MAX_VALUE;
        for(int i=0;i<totalstudents;i++)
        {
            minGrade=Math.min(minGrade,grades[i]);
        }
        return minGrade;
    }
}