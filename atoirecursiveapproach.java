public class atoirecursiveapproach{
public static int atoi(String str) {
    return atoiHelper(str, 0, 1);
}

private static int atoiHelper(String str, int total, int sign) {
    if (str.isEmpty()) return total * sign;
    char c = str.charAt(0);
    if (c >= '0' && c <= '9') {
        total = total * 10 + (c - '0');
        return atoiHelper(str.substring(1), total, sign);
    } else if (c == '-') {
        return atoiHelper(str.substring(1), total, -1);
    } else if (c == '+') {
        return atoiHelper(str.substring(1), total, 1);
    } else {
        return total * sign;
    }
}
}