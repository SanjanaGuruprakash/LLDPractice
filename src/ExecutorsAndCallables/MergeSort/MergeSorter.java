package ExecutorsAndCallables.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    List<Integer> arrayTosort;
    //ExecutorService es = Executors.newCachedThreadPool();// this creates pool2
    //if we want single es then client should pass the es it has created

    ExecutorService es; // this uses just one pool

    public MergeSorter(List<Integer> arrayTosort, ExecutorService es){
        this.arrayTosort=arrayTosort;
        this.es=es;
    }
    @Override
    public List<Integer> call() throws Exception {
        // merge sort logic

        //base case
        if(arrayTosort.size()<=1){
            return arrayTosort;
        }

        int mid=arrayTosort.size()/2;
        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArray.add(arrayTosort.get(i));
        }

        for (int i=mid;i<arrayTosort.size();i++){
            rightArray.add(arrayTosort.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftArray,es);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray,es);

        Future<List<Integer>> leftSortedArrayFuture = es.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedArrayFuture = es.submit(rightMergeSorter);

        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();



//        List<Integer> leftSortedArray = leftMergeSorter.call();
//        List<Integer> rightSortedArray = rightMergeSorter.call();

        //merge logic

        List<Integer> sortedArray = new ArrayList<>();
        int i=0;
        int j=0;

        while(i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i)<rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else{
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }
        if(i<leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
        }
        if(j<rightSortedArray.size()){
            sortedArray.add((rightSortedArray.get(j)));
        }

        return sortedArray;
    }
}
