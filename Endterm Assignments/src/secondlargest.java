void main() {
    int A[]={4,4,4,4};
    int largest=0;
    int secondlargest=0;
    int count =0;
    for(int i=0;i<A.length;i++) {
        if(A[0]==A[i]) {
            count++;
        }
    }
    if (count==A.length){
        System.out.println(-1);
    }
//    this handles a case where all elements are same

    if(A.length==1) {
        System.out.println(-1);
    }
//    this handles a case where there is only one element in the array
    for(int i=0;i<A.length;i++) {
        largest=Math.max(largest,A[i]);
    }
    for(int i=0;i<A.length;i++) {
        if(largest>A[i] ) {
            secondlargest=Math.max(secondlargest,A[i]);
        }
    }
    System.out.println(secondlargest);

}