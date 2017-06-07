public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
         int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
/*

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

你是一名产品经理正领导一个团队研发新的产品。不幸的是，产品的最终版本没能通过质量检测。每一个版本都是在前一个版本的基础上研发的，一个差的版本之后的所有版本都是差的版本。
假设你们当前有N个版本[1,2,3...n]并且你想要寻找出第一个导致随后的版本都变差的那个差的版本。
给定你一个返回判断版本是否正确的接口bool isBadVersion(version)。实现一个寻找第一个坏的版本的函数。你要在调用这个接口的次数最少的情况下找到第一个坏的版本。



此题用二分法来查找，先定义两个基点left right      left存放查找序列的最左序号，right存放查找序列的最右序号。
再定义一个mid 调用api判断mid处是否为bad   若为bad则 right=mid 不再查找mid后的部分，因为后半部分均为bad
											若不为bad 则left=mid+1 不再超找mid前的部分，因为前半部分均不为bad
											随后 mid 值赋为 要查找那部分的 中间序号
											重复以上步骤直到left>right  此时 mid等于第一个bad的序号





*/
