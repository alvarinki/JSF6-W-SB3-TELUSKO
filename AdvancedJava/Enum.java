
enum Status{
    PENDING,
    APPROVED,
    REJECTED,
    COMPLETED;
}

public class Enum{
    public static void main(String[] args) {
        
        Status s= Status.APPROVED;
        
        switch (s) {
            case PENDING:
                System.out.println("Status is Pending");
                break;

            case APPROVED:
                System.out.println("Status is Approved");
                break;
        
            default:
                break;
        }
    }
}
