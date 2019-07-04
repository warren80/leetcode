public class Main {
    public static void main(String... args) {

        String[] strs = {"abca", "abc"};

        String result = new Main().longestCommonPrefix(strs);

        System.out.println(result);
    }


    public String longestCommonPrefix(String[] strs) {

        String longest = "";

        try {
            for (int i = 0; true; i++) {
                char currentChar = strs[0].charAt(i);
                try {
                    for (int j = 0; j < strs.length; j++) {
                        if (currentChar != strs[j].charAt(i))
                            return longest;
                    }

                } catch (Exception e) {
                    return longest;
                }
                longest = strs[0].substring(0, i + 1);
            }
        } catch (Exception e) {
            return longest;
        }
//        return longest;
    }
}
