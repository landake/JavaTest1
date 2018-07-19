import java.util.*;
import java.util.stream.Collectors;

public class Map {
    List<Integer> randomList = new ArrayList<Integer>();
    public  void randomNum() {


            int num;
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                num = random.nextInt(50) + 50;
                randomList.add(num);
            }
        System.out.println("生成随机数："+randomList);
        }
        public void sort(){
        int size = 10;
            for (int i = 0; i < size; i++) {// ---》for循环选取第一个数
                for (int j = 0; j < size-1-i; j++) {// 原数组中，取出第一个数之后，相邻的另外一个数
                    //比较两个整数的大小
                    if (randomList.get(j)>randomList.get(j+1)) {
                        Integer temp = randomList.get(j);
//                  使用list集合的set方法，找到位置并将数字赋值到该位置
                        randomList.set(j, randomList.get(j+1));
                        randomList.set(j+1,temp);
                    }
                }
            }
            System.out.println("排序后："+randomList);

        }





    }

