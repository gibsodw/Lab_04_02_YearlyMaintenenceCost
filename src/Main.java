public class Main
{
    public static void main(String[] args) {
        double spring = 775.63;
        double summer = 643.97;
        double fall = 1105.73;
        double winter = 896.04;
        double total = 0;

        System.out.println("What is the cost of home maintenance in the Spring?");

        System.out.println("What is the cost of home maintenance in the Summer?");

        System.out.println("What is the cost of home maintenance in the fall?");

        System.out.println("What is the cost of home maintenance in the Winter?");

        total = spring + summer + fall + winter;

        System.out.println("The cost of Spring is " + spring + " and the cost of Summer is " + summer + "and the cost of Fall is " + fall + " and the cost of winter is " + winter + " which makes the total cost " + total);

    }
}