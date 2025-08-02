import java.util.*;

class Index{
    static void merge(int[] arr , int s, int m ,int e){
        int i = s;
        int j= m+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(i<=m && j<=e){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }

        }
        while(i<=m){
            temp.add(arr[i]);
            i++;
        }
        while(j<=e){
            temp.add(arr[j]);
            j++;
        }

        for(int k=0;k<temp.size();k++){
            arr[s+k]= temp.get(k);
        }
    }
    static void sort(int[] arr, int s, int e){
        if(s>=e) return;
        int mid = (s+e)/2;
        sort(arr, s, mid);
        sort(arr,mid+1,e);
        merge(arr, s, mid, e);
        
    }
    public static void main(String[] args) {
        int [] arr = {1,4,2,4,5,6,8,10};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}