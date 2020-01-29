public class StringCalc
{
        public static int Add(String cin) throws Exception {
       if(cin.startsWith("//"))
       {
            cin = cin.replace("4",";");
            int index = cin.indexOf("\n");
            cin = cin.substring(index+1);
       }
        String[] numbers = cin.split(";|,|\n");
        int sum = 0;
        if (!cin.isEmpty())
        {
            for (int i = 0; i < numbers.length; i++)
            {
                if (Integer.parseInt(numbers[i]) < 0 )
                {
                    throw new Exception("Negative number");
                }

            }
            for (int i = 0; i < numbers.length; i++)
            {
                sum += Integer.parseInt(numbers[i]);
            }
        }
        return sum;
    }
}
