package Generics1.BoundedWildcards;

public class Main {
    static void showXY(Coords<?>c){
        for(int i=0;i<c.coords.length;i++){
            System.out.print(c.coords[i].a+" "+c.coords[i].b);
        }
        System.out.println();
    }
    static void showXYZ(Coords<? extends ThreeD>c){
        for(int i=0;i<c.coords.length;i++){
            System.out.print(c.coords[i].a+" "+c.coords[i].b);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] twoD={
                new TwoD(1,1),
                new TwoD(2,2)

        };
        ThreeD[] threeD={
                new ThreeD(1,1,1),
                new ThreeD(2,2,2)

        };
        Coords<TwoD> twoDlocs=new Coords<TwoD>(twoD);
        Coords<ThreeD> threeDlocs=new Coords<>(threeD);
        //showXY(twoDlocs);
        //showXYZ(threeDlocs);
        //showXYZ(twoDlocs);
//        int a=1;
//        byte b=(byte)a;
//        System.out.println(b);
    }


}
