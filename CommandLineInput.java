class CommandLineInput {

    public static void main(String args[]) {

        if (args.length == 2) {
            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);

            int result = firstNumber + secondNumber;

            System.out.println(result);
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}
