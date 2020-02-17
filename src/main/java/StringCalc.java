public class StringCalc
{
    public static void main(String[] args) throws Exception {
       try {
           System.out.println(Add("1;2,1000,2"));
       }catch (Exception e)
       {
           System.out.println(e.getMessage());
       }
    }

    public static int Add(String cin) throws Exception {
       String delimiter = ";|,|\n";
       if(cin.startsWith("//"))
       {
//            cin = cin.replace("4",";");
            int index = cin.indexOf("\n");
            cin = cin.substring(index+1);
            delimiter += cin.substring(2,index-1);

       }
        String[] numbers = cin.split(delimiter);
        int sum = 0;
        StringBuilder negative = new StringBuilder();
        if (!cin.isEmpty())
        {
            for (int i = 0; i < numbers.length; i++)
            {
                if (Integer.parseInt(numbers[i]) < 0)
                {
                    negative.append(Integer.parseInt(numbers[i])).append(",");
                    throw new Exception("ERROR: negatives not allowed " + negative);
                }
                if (Integer.parseInt(numbers[i]) > 999)
                {
                    i++;
                }
                sum += Integer.parseInt(numbers[i]);
            }
        }
        return sum;
    }
}
