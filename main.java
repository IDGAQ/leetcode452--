//双指针
//写了个2d sorting,所以会很慢

class Solution {
    
  static int findMinArrowShots(int[][] p) {
    // count++
    int count=1;
    
    // 条件1: 如果array length=1,return 1
    if(p.length==1) return 1;
    if(p.length==0)return 0;
    // sort 2d array as ascending by 2nd column
    sortbyColumn(p,1);

    // 双指针（i为最前一个保持者，j向后scan
    int i=0; int j=1;

    while(i>=0 && j<p.length){
        if(p[j][0]<= p[i][1] && p[j][1]>=p[i][1]){
            // j move on
            j++;
        }
   

        else if (p[j][0]>p[i][1]){
            i=j;
            count++;
            System.out.print("count ++");
        }
        
        
    }
    //当 j 跑到底的时候，return count;


    return count;
  }

  public static void sortbyColumn(int arr[][], int col) 
    { 
        // Using built-in sort function Arrays.sort 
        Arrays.sort(arr, new Comparator<int[]>() { 
            
          @Override              
          // Compare values according to columns 
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
  
            // To sort in descending order revert  
            // the '>' Operator 
            if (entry1[col] > entry2[col]) 
                return 1; 
            else
                return -1; 
          } 
        });  // End of function call sort(). 
    }
}
