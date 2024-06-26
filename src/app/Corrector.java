package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String str : strs) {
            if (!str.equals("b")) {
                str = str.replace("b", "o");
            }
            count++;
            sb.append(count).append(") ").append(str).append("\n");
        }
        return sb.toString();
    }
}

