import java.net.IDN;

class Sort {
    public static int[] merge(int[] a){
        int l = a.length / 2;
        int r = a.length - l;

        int[] left = new int[l];
        int[] right = new int[r];

        System.arraycopy(a,0,left,0,l);
        System.arraycopy(a,l,right,0,r);

        if(a.length < 2)return a;
        return sort(merge(left),merge(right));
    }

    public static int[] sort(int[] left,int[] right){
        int[] result = new int[left.length + right.length];
        int r = 0,l = 0,index = 0;

        while (index < result.length) {
            if (l >= left.length) {
                result[index++] = right[r++];
            } else if (r >= right.length) {
                result[index++] = left[l++];
            } else if (left[l] > right[r]) {
                result[index++] = right[r++];
            } else if (left[l] <= right[r]) {
                result[index++] = left[l++];
            }
        }
        return result;
    }
}
