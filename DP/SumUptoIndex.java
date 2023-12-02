package DP;

public class SumUptoIndex {

    public static void main(String[] args) {
        int master[]={1,2,1,1,3,5};
        int index[]={0,2,4,1};

        int a[]=new int[master.length];
        a[0]=master[0];
        a[1]=a[0]+master[1];

        for(int i=2;i<master.length;i++){
            a[i]=a[i-1]+master[i];
        }

//        for(int x:a)
//            System.out.println(x);

//        for(int i=0;i<index.length;i++){
//            System.out.println(a[index[i]]);
//        }

        for(int x:index)
            System.out.println(a[x]);

    }
}
