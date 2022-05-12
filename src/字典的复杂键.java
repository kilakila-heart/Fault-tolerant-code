import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Pair {
    int v1;
    int v2;

    public Pair(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return this.v1 == ((Pair) o).v1 && v2 == ((Pair) o).v2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2);
    }
}

public class 字典的复杂键 {
    public static void main(String[] args) {
        Map<int[], Integer> map = new HashMap<>();
        map.put(new int[]{1, 1}, 100000);
        System.out.println(map.getOrDefault(new int[]{1, 1}, 0));//对象的比较由于不相等没办法拿到值

        Map<Pair, Integer> pairMap = new HashMap<>();
        pairMap.put(new Pair(1, 1), 1000);
        System.out.println(pairMap.getOrDefault(new Pair(1, 1), 0));//对象重写equals后可以拿到值键对应的值

    }
}
