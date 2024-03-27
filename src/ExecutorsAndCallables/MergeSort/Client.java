package ExecutorsAndCallables.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(7,5,3,1,4,2,6);
        ExecutorService es= Executors.newCachedThreadPool(); // creates a pool1

        MergeSorter mergeSorter = new MergeSorter(list,es);

        Future<List<Integer>> sorttedListFuture = es.submit(mergeSorter);
        List<Integer> sortedArray = sorttedListFuture.get();


        //List<Integer> sortedArray = mergeSorter.call();

        System.out.println(sortedArray);

    }
}
