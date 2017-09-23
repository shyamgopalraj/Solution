 public class KSeperation { 
  static boolean isSeperationPossible(List<Integer> list, int[] subsetSum, boolean[] taken,
        int subset, int K, int size, int curIdx, int limitIdx)
    {
        if (subsetSum[curIdx] == subset)
        {
            if (curIdx == K - 2)
                return true;

            return isSeperationPossible(list, subsetSum, taken, subset,
                K, size, curIdx + 1, size - 1);
        }

        for (int i = limitIdx; i >= 0; i--)
        {
            if (taken[i])
                continue;
            int tmp = subsetSum[curIdx] + list.get(i);

            if (tmp <= subset)
            {
                taken[i] = true;
                subsetSum[curIdx] += list.get(i);
                boolean nxt = isSeperationPossible(list, subsetSum, taken,
                    subset, K, size, curIdx, i - 1);

                taken[i] = false;
                subsetSum[curIdx] -= list.get(i);
                if (nxt)
                    return true;
            }
        }
        return false;
    }


    static boolean seperate(List<Integer> list, int k)
    {
        if (k == 1)
            return true;

        int len = list.size();
        if (len < k)
            return false;

        int sum = 0;
        for (int i = 0; i < len; i++)
            sum += list.get(i);
        if (sum % k != 0)
            return false;

        int subset = sum / k;
        int[] subsetSum = new int[k];
        boolean[] taken = new boolean[len];

        for (int i = 0; i < k; i++)
            subsetSum[i] = 0;

        for (int i = 0; i < len; i++)
            taken[i] = false;

        subsetSum[0] = list.get(len-1);
        taken[len - 1] = true;

        return isSeperationPossible(list, subsetSum, taken,
            subset, k, len, 0, len - 1);
    }
}