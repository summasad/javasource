package api;

// extends Object 기본

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override // 주소 아닌 값비교
    public boolean equals(Object obj) {
        // =v2=new Value

        Value other = (Value) obj;
        if (value != other.value)
            return false;
        return true;
    }

    @Override // 주소 아닌 값출력
    public String toString() {
        return "Value [value=" + value + "]";
    }

}
