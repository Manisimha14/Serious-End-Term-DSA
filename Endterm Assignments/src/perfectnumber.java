void main() {
    int A=6;
    int count=0;
    if(A==1){
        System.out.println(0);

    }
//    this handles the case where A=1
    for(int i=1;i<=A;i++) {
        if(A%i==0 && A!=i){
            count=count+i;
        }
    }
//    this loop calculates the sum of all divisors except the number itself
    if(count!=A){
        System.out.println(0);
    }
    else {
    
        System.out.println(1);
    }
}