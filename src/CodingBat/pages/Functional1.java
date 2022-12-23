package CodingBat.pages;

import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(str -> str + "*")
                .collect(Collectors.toList());
    }

    public List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(s -> s + s + s)
                .collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }

    public List<Integer> math1(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n + 1) * 10)
                .collect(Collectors.toList());
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(n -> n % 10)
                .collect(Collectors.toList());
    }

    public List<String> lower(List<String> strings) {
        return strings.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
    }

    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(s -> replaceX(s))
                .collect(Collectors.toList());
    }

    public String replaceX(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'x') {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

}
