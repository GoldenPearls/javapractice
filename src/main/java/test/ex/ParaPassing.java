package test.ex;

public class ParaPassing {
    public void change(int i, int[] j){
        i = 20; j[3] = 400;
    }
    public void display(int i, int[] j){
        System.out.println("i : " + i);
        System.out.print("j : ");
        for(int k = 0; k < j.length; k++){
            System.out.print(j[k] + " ");
        }
        System.out.println();
    }
}
