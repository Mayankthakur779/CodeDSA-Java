class updateBit{
    public static void main(String args[]){
        int n=5;
        int pos=3;
        int shift=1<<pos;
        // for updating to 0
        int zeroUpdate=shift|n;
        System.out.println("ZeroUpdated bit:"+zeroUpdate);
        //for updating to 1
        int oneUpdate=~shift&n;
        System.out.println("OneUpdated bit:"+oneUpdate);
    }
}