## 二分查找

> 每次查找时通过将待查找区间分成两部分并只取一部分继续查找



## template

```java
//区间[l, r]被划分成 [l, mid]和[mid + 1, r]时
//在右半段寻找左边界(即寻找符合性质的第一个点)
int bSearch(int l, int r){
	while(l < r){
        int mid = l + r >> 1;
        if(check(mid)) r = mid;
        else l = mid + 1;
    }
    return l;
}


//区间[l, r]被分成[l, mid - 1]和[mid, r]时
//在左半段寻找右边界(即寻找不符合性质的最后一个点)
int bSearch(int l, int r){
	while(l < r){
        int mid = l + r + 1 >> 1;
        if(check(mid)) l = mid;
        else r = mid - 1;
    }
    return l;
}
```

