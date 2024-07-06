class Solution {
    public int passThePillow(int n, int time) {
    int[] arr=new int[n];
 
    for(int i=0;i<n;i++){
        arr[i]=i+1;

    }
    int store=0;
  int i=1;
  while(i<n){
    time--;
    if(time==0){
         store= arr[i];
        break;
    }
    if(time!=0){
        i++;
    }

  }
 if(i==n && time!=0){
    i=n-2;
    while(i>=0){
        time--;
        if(time==0){
            store=arr[i];
        }
        else{
            i--;
        }
    }
 }
 if( time!=0){
    i=1;
     while(i<n){
    time--;
    if(time==0){
         store= arr[i];
        break;
    }
    if(time!=0){
        i++;
    }

  }

 }
 if( i==n &&time!=0){
     i=n-2;
    while(i>=0){
        time--;
        if(time==0){
            store=arr[i];
        }
        else{
            i--;
        }
    }
 }
 
 return store;
    }
  }


    