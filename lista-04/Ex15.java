class Ex15 {
    static byte[] sum(byte[] greaterNumber, byte[] lowerNumber) {
        byte[] sum = new byte[greaterNumber.length];

        for (byte i = 0; i < greaterNumber.length; i++) { 
            sum[i] =  (byte) (greaterNumber[i] + lowerNumber[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        byte greaterLength = (byte) 5;
        byte lowerLength = (byte) 3;
        byte diff = (byte) (greaterLength - lowerLength);

        byte[] greaterNumber = new byte[greaterLength];
        
        byte[] lowerNumber = new byte[lowerLength + diff];
        

        greaterNumber[0] = 1;
        greaterNumber[1] = 2;
        greaterNumber[2] = 1;
        greaterNumber[2] = 1;
        greaterNumber[2] = 1;

        lowerNumber[diff + 0] = 1;
        lowerNumber[diff + 1] = 2;
        lowerNumber[diff + 2] = 1;

        byte[] sum = sum(greaterNumber, lowerNumber);

        for (byte i : sum) {
            System.out.print(i);   
        }
    }
}