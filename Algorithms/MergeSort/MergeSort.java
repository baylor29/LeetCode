package Algorithms.MergeSort;

public class MergeSort {

    public void sort(Comparable a[], Comparable aux[], int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        sort(a, aux, l, mid);
        sort(a, aux, mid + 1, r);
        merge(a, aux, l, mid, r);

    }

    public void merge(Comparable a[], Comparable aux[], int l, int mid, int r) {
        for (int i = l; i <= mid; i++) {
            aux[i] = a[i];
        }
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) a[k] = a[j++];
            else if (j > r) a[k] = aux[i++];
            else if (aux[i].compareTo((a[j])) < 0) a[k] = aux[i++];
            else a[k] = a[j++];
        }
    }

    public void sort(Comparable a[]) {
        Comparable aux[] = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }
}

