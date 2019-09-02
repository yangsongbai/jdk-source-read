* HashMap初始容量为什么是2的幂次方?
```
hashMap源码获取元素的位置：
static int indexFor(int h, int length) {
    // assert Integer.bitCount(length) == 1 : "length must be a non-zero power of 2";
return h & (length-1);
}
```
HashMap中的数据结构是数组+单链表的组合，我们希望元素存放的更均匀，最理想的效果是Entry数组中每个位置都只有一个元素，这样，查询的时候效率最高，不需要遍历单链表，也不需要通过equals去比较Key，而且空间利用率最大。
h是通过k的hashCode最终计算出来的哈希值，并不是hashCode本身，而是hashCode之上又经过一层运算的hash值，length是目前容量。当容量是2^n时，h & (length -1) == h % length。
  这个等式实际上可以推理出来，2^n转换成二进制就是1+n个0，减1之后就是0+n个1，如16 -> 10000，15 -> 01111，那根据&位运算的规则，都为1(真)时，才为1，那0≤15运算后的结果≤15，假设h <= 15，那么运算后的结果就是h本身，h >15，运算后的结果就是最后三位二进制做&运算后的值，最终，就是%运算后的余数。

```
     /**
     * The default initial capacity - MUST be a power of two.
     * hashMap的初始容量，必须为2的幂次数
     */
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
```
&：与操作 比如 1101 & 1011=1001
如果length为2的次幂  则length-1 转化为二进制必定是11111……的形式，在于h的二进制与操作效率会非常的快，
而且空间不浪费；如果length不是2的次幂，比如length为15，则length-1为14，对应的二进制为1110，在于h与操作，
最后一位都为0，而0001，0011，0101，1001，1011，0111，1101这几个位置永远都不能存放元素了，空间浪费相当大，更糟的是这种情况中，数组可以使用的位置比数组长度小了很多，这意味着进一步增加了碰撞的几率，减慢了查询的效率！
