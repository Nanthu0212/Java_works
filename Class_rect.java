import java.util.Scanner;
class Rectangle{
    int length;
    int breadth;
    
    void get_data(int l, int b){
        length = l;
        breadth = b;
    }
    
    int area(){
        return length * breadth;
    }
    int perimeter(){
        return 2 * (length + breadth);
    }
}
public class Class_rect {
    public static void main(String[] args){
        Rectangle rec = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle :");
        int length = sc.nextInt();
        System.out.print("Enter the breath of the rectangle :");
        int breadth = sc.nextInt();
        rec.get_data(length, breadth);
        int area = rec.area();
        int perimeter = rec.perimeter();
        System.out.println("Area of the rectangle : "+area);
        System.out.println("Perimeter of the rectangle : "+perimeter);

    }
    
}
