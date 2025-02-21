题目:
分析以下需求，并⽤JAVA代码实现
统计每个单词出现的次数
有如下字符串"If you want to change your fate I think you must come 
to the dark horse to learn java"(⽤空格间隔)
打印格式：
to=3
think=1
you=2
........

答案:
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        // 输入字符串
        String input = "If you want to change your fate I think you must come to the dark horse to learn java";
        
        // 将字符串转换为小写，并用空格分割成单词数组
        String[] words = input.toLowerCase().split(" ");
        
        // 创建一个 HashMap 来存储每个单词及其出现的次数
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        // 遍历单词数组，统计每个单词的出现次数
        for (String word : words) {
            // 如果单词已经在 Map 中，更新其计数
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // 如果单词不在 Map 中，添加并初始化计数为 1
                wordCountMap.put(word, 1);
            }
        }
        
        // 打印每个单词及其出现的次数
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

知识点:
另一种遍历:
for(String word:wordCountMap.keySet()){
            System.out.println(word+" "+wordCountMap.get(word));
        }
        
entrySet() 方法返回 Map.Entry<String, Integer> 对象的集合，每个 entry 代表 key-value 对。
优点：
性能更优（只遍历一次 Map）。
直接访问 entry.getKey() 和 entry.getValue()，避免额外的 get() 操作。

