class EnhancedForLoop {
    public static void main(String[] args) {
        
        int sum = 0;

        //Enhanced For Loop
        for(String i : args)
        {
            sum += Integer.parseInt(i);
        }

        System.out.println("Sum is: "+sum);

    }   
}
