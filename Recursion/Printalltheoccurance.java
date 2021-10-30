public class Printalltheoccurance{

  public static int[] print(int a[], int x, int idx, int fsf) {
    if(idx == a.length){
      return new int[fsf];
    }

    if(a[idx] == x){
      int au[] = print(a, x, idx+1, fsf+1);
      au[fsf] = idx;
      return au;
    }
    else{
      int au[] = print(a,x,idx+1, fsf);
      return au;
    }

       
  }

  public static void main(String[] args) {
   int a[] = {1,2,3,4,3,4,5,6,3,5,6,3,5,6,3};
   int idx = 0;

   int b[] = print(a, 3, 0,0);
   for(int i = 0; i <b.length; i++){
     System.out.print(b[i]+" ");
   }
  }
}
