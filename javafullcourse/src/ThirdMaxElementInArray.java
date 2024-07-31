int a[] ={1,2,3,4,5,6,7};
    int max=0;
    int smax=0;
    int tmax=0;
    for(int b:a){
        if(b>max){
            tmax=smax;
            smax=max;
            max=b;
        }
        else if(b>smax && b!=max){
            tmax=smax;
         smax = b;   
        }
        else if(b>tmax && b!=max && b!=smax){
         tmax = b;   
        }
    }
    System.out.print(tmax);
