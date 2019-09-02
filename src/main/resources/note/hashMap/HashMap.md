```
hashMap源码获取元素的位置：
static int indexFor(int h, int length) {
    // assert Integer.bitCount(length) == 1 : "length must be a non-zero power of 2";
return h & (length-1);
}
```
```
     /**
     * The default initial capacity - MUST be a power of two.
     * hashMap的初始容量，必须为2的幂次数
     */
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
```
