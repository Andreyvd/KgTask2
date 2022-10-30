public class VectorAndMatrix {
      public static void main(String[] args ){
          VectorTwo v = new VectorTwo();
          System.out.println(v.getStringV(v.difV((v.setVector(1,2)),v.setVector(2,1))));
          double[][] m1 =  {{1,2,3},{1,2,3},{1,2,3}
                            };
          double[][] m2 = {{5,6,7},{4,6,2},{8,9,4}};
          MatrixThree m = new MatrixThree();
           double[][] vnk = m.multiMatrix(m1,m2);
           for(int i = 0; i < vnk.length;i++){
               for(int j = 0; j < vnk[0].length;j++){
                   System.out.print(vnk[i][j]);
                   System.out.print(" ");
               }
               System.out.println();
           }
      }

}
