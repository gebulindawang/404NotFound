package ran.com.example.demo.haoran;

public class haoran {
    public static void main(String[] args) {
        // 定义大爱心图案
        String[] bigHeart = {
                "  **      **  ",
                " ****    **** ",
                "******  ******",
                " ************ ",
                "  **********  ",
                "   ********   ",
                "    ******    ",
                "     ****     ",
                "      **      "
        };
        // 定义小爱心图案
        String[] smallHeart = {
                "  *    *  ",
                " ***  *** ",
                " ******* ",
                "  *****  ",
                "   ***   ",
                "    *    "
        };

        try {
            while (true) {
                // 输出大爱心
                for (String line : bigHeart) {
                    System.out.println(line);
                }
                // 暂停一段时间
                Thread.sleep(500);
                // 清屏（在不同系统中清屏方式不同，这里简单用换行模拟）
                for (int i = 0; i < 20; i++) {
                    System.out.println();
                }
                // 输出小爱心
                for (String line : smallHeart) {
                    System.out.println(line);
                }
                // 暂停一段时间
                Thread.sleep(500);
                // 清屏
                for (int i = 0; i < 20; i++) {
                    System.out.println();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
