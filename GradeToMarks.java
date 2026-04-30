class GradeToMarks {
    public static void main(String[] args) {
        char n = 'A';
        switch (n){
            case 'A':
                System.out.println(91+"-"+100+" the marks");
                break;
             case 'B':
                System.out.println(76+"-"+90+" the marks");
                break;
            case 'C':
                System.out.println(51+"-"+75+" the marks");
                break;
            case 'D':
                System.out.println(36+"-"+50+" the marks");
                break;
            case 'F':
                System.out.println(0+"-"+36+" the marks");
                break;
            default:
                System.out.println(" Enter the  valid marks");
                break;
        }
    }
}