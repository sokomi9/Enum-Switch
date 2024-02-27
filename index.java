enum Direction{
    NORTH, SOUTH, EAST, WEST;
}
public class index {

    public static void main(String[] args) {
        Direction direction = Direction.NORTH;

        switch (direction) {
            case NORTH:
                System.out.println("We are heading NORTH");
                break;

            case SOUTH:
                System.out.println("We are heading SOUTH");
                break;
            case EAST:
                System.out.println("We are heading EAST");
                break;
        
            default:
                System.out.println("We are heading WEST");
                break;
        }
    }
}