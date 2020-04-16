package lk.sliit.easylist.function;

import java.util.List;
import java.util.Map;
import java.util.Set;


    public class FrequentItemsetData<I> {
        private final List<Set<I>> frequentItemsetList;
        private final Map<Set<I>, Integer> supportCountMap;
        private final double minimumSupport;
        private final int numberOfTransactions;

        FrequentItemsetData(List<Set<I>> frequentItemsetList,Map<Set<I>, Integer> supportCountMap,double minimumSupport,int transactionNumber) {
            this.frequentItemsetList = frequentItemsetList;
            this.supportCountMap = supportCountMap;
            this.minimumSupport = minimumSupport;
            this.numberOfTransactions = transactionNumber;
        }

        public List<Set<I>> getFrequentItemsetList() {
            return frequentItemsetList;
        }

        public Map<Set<I>, Integer> getSupportCountMap() {
            return supportCountMap;
        }

        public double getMinimumSupport() {
            return minimumSupport;
        }

        public int getTransactionNumber() {
            return numberOfTransactions;
        }

        public double getSupport(Set<I> itemset) {
            return 1.0 * supportCountMap.get(itemset) / numberOfTransactions;
        }
    }

