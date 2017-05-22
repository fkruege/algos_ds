package interviews;

import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/21/17.
 */
public class LongestCommonSubsequenceTest {
    @Test
    public void findLCS() throws Exception {

        LongestCommonSubsequence lcs = new LongestCommonSubsequence();

        assertEquals("to", lcs.findLCS("tomorrow", "today"));
        assertEquals("ning", lcs.findLCS("morning", "evening"));
        assertEquals("mpi", lcs.findLCS("olympics", "jumping"));

        assertEquals("Geeks", lcs.findLCS("GeeksforGeeks", "GeeksQuiz"));



    }

    public void test(){



//
//
//
//
//        Observable<Location> observable = Observable.fromEmitter(
//                new Action1<AsyncEmitter<Location>>() {
//                    @Override
//                    public void call(final AsyncEmitter<Location> emitter) {
//                        final LocationListener locationListener = new LocationListener() {
//                            @Override
//                            public void onLocationChanged(Location location) {
//                                // emits location
//                                emitter.onNext(location);
//                            }
//
//        ...
//                        };
//
//                        emitter.setCancellation(new AsyncEmitter.Cancellable() {
//                                                    @Override
//                                                    public void cancel() throws Exception {
//                                                        // stops location updates when unsubscribed
//                                                        locationManager.removeUpdates(locationListener);
//                                                    });
//
//      locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
//                                                            1000L, 10.0F, locationListener);
//
//                                                    // if you also emit onError() or onComplete(),
//                                                    // the framework will make sure the Observable
//                                                    // contract is fullfilled
//                                                }
//                                // let the framework to worry about backpressure
//                    }, AsyncEmitter.BackpressureMode.BUFFER);

    }





}