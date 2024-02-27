public class usaFlag {
    public static void main(String[] args) {
        int h = 30;
        int w = 40;

        for (int i = 1; i <= h; i++)
        {
            for (int j = 1; j <= w; j++)
            {
                if (i <= 9)
                {
                    p("|");
                }
                else
                {
                    if (j >= 13 && j <= 28)
                    {
                        if (i % 2  != 0)
                        {
                            if (j % 2 == 0)
                            {
                                p("*");
                            }
                            else
                            {
                                p(" ");
                            }
                        }
                        else {
                           
                        }
                    }
                }
            }
        }
        
    }
}
